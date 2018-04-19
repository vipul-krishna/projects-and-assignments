package edu.neu.info6205;

import java.util.Random;

public class ShortestPathBetweenTowns {

    InitialPopulation population = new InitialPopulation();
    Individual first;
    Individual next;
    int generationCount = 0;


    public void selection() {

       
        first = population.getFittest();
        next = population.getSecondFittest();
    }


    public void performCrossOver() {
        Random rn = new Random();

        int crossOverPoint = rn.nextInt(population.individuals[0].townCount);
        for (int i = 0; i < crossOverPoint; i++) {
            int temp = first.town[i];
            first.town[i] = next.town[i];
            next.town[i] = temp;

        }

    }

    public void performMutation() {
        Random rn = new Random();

        int mutationPoint = rn.nextInt(population.individuals[0].townCount);
        if (first.town[mutationPoint] == 0) {
            first.town[mutationPoint] = 1;
        } else {
            first.town[mutationPoint] = 0;
        }

        mutationPoint = rn.nextInt(population.individuals[0].townCount);

        if (next.town[mutationPoint] == 0) {
            next.town[mutationPoint] = 1;
        } else {
            next.town[mutationPoint] = 0;
        }
    }

    Individual getFittestOffspring() {
        if (first.rankFitness > next.rankFitness) {
            return first;
        }
        return next;
    }

    public void addFittestOffspring() {

        first.calcFitness();
        next.calcFitness();

        int leastFittestIndex = population.getLeastFittestIndex();

        population.individuals[leastFittestIndex] = getFittestOffspring();
    }
    
    public void getShortestPath() {
    	Random rn = new Random();

        ShortestPathBetweenTowns shortestPath = new ShortestPathBetweenTowns();

        shortestPath.population.initializePopulation(10);

        shortestPath.population.calculateFitness();

        System.out.println("Individual: " + shortestPath.generationCount + " Rank Fittest: " + shortestPath.population.rankFitness);

        while (shortestPath.population.rankFitness < 125) {
            ++shortestPath.generationCount;

            shortestPath.selection();

            shortestPath.performCrossOver();

            if (rn.nextInt()%7 < 125) {
                shortestPath.performMutation();
            }

            shortestPath.addFittestOffspring();
            shortestPath.population.calculateFitness();

            System.out.println("Individual: " + shortestPath.generationCount + " Rank Fittest: " + shortestPath.population.rankFitness);
        }

        System.out.println("\nSolution found in generation " + shortestPath.generationCount);
        System.out.println("Fitness: "+shortestPath.population.getFittest().rankFitness);
        System.out.print("Sequence of Towns: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(shortestPath.population.getFittest().town[i]);
        }

        System.out.println("");
    }

}
