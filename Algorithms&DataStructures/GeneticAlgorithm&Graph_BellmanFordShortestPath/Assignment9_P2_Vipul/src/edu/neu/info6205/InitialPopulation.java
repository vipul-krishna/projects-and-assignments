package edu.neu.info6205;

public class InitialPopulation {
	
	int populationSize = 100;
    Individual[] individuals = new Individual[125];
    int rankFitness = 0;

    public void initializePopulation(int size) {
        for (int i = 0; i < individuals.length; i++) {
            individuals[i] = new Individual();
        }
    }

    public Individual getFittest() {
        int maxFit = Integer.MIN_VALUE;
        int maxFitIndex = 0;
        for (int i = 0; i < individuals.length; i++) {
            if (maxFit <= individuals[i].rankFitness) {
                maxFit = individuals[i].rankFitness;
                maxFitIndex = i;
            }
        }
        rankFitness = individuals[maxFitIndex].rankFitness;
        return individuals[maxFitIndex];
    }

    public Individual getSecondFittest() {
        int maxFit1 = 0;
        int maxFit2 = 0;
        for (int i = 0; i < individuals.length; i++) {
            if (individuals[i].rankFitness > individuals[maxFit1].rankFitness) {
                maxFit2 = maxFit1;
                maxFit1 = i;
            } else if (individuals[i].rankFitness > individuals[maxFit2].rankFitness) {
                maxFit2 = i;
            }
        }
        return individuals[maxFit2];
    }

    public int getLeastFittestIndex() {
        int minFitVal = Integer.MAX_VALUE;
        int minFitIndex = 0;
        for (int i = 0; i < individuals.length; i++) {
            if (minFitVal >= individuals[i].rankFitness) {
                minFitVal = individuals[i].rankFitness;
                minFitIndex = i;
            }
        }
        return minFitIndex;
    }

    public void calculateFitness() {

        for (int i = 0; i < individuals.length; i++) {
            individuals[i].calcFitness();
        }
        getFittest();
    }    

}
