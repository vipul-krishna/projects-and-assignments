package edu.neu.info6205;

import java.util.Random;

public class Individual {
	
	int rankFitness = 0;
    int[] town = new int[125];
    int townCount = 125;

    public Individual() {
        Random rn = new Random();
        for (int i = 0; i < town.length; i++) {
            town[i] = Math.abs(rn.nextInt() % 2);
        }

        rankFitness = 0;
    }
    public void calcFitness() {

        rankFitness = 0;
        for (int i = 0; i < 5; i++) {
            if (town[i] == 1) {
                ++rankFitness;
            }
        }
    }

}
