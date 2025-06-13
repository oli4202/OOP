/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.rolldie;

/**
 *
 * @author Oli
 */
import java.security.SecureRandom;

public class RollDie {
    public static void main(String[] args) {
        // randomNumbers object will produce secure random numbers
        SecureRandom randomNumbers = new SecureRandom();

        int frequency1 = 0; // count of 1s rolled
        int frequency2 = 0; // count of 2s rolled
        int frequency3 = 0; // count of 3s rolled
        int frequency4 = 0; // count of 4s rolled
        int frequency5 = 0; // count of 5s rolled
        int frequency6 = 0; // count of 6s rolled

        // tally counts for 6,000,000 rolls of a die
        for (int roll = 1; roll <= 6000000; roll++) {
            int face = 1 + randomNumbers.nextInt(6); // number from 1 to 6

            // increment frequency counter based on face value
            switch (face) {
                case 1:
                    ++frequency1;
                    break;
                case 2:
                    ++frequency2;
                    break;
                case 3:
                    ++frequency3;
                    break;
                case 4:
                    ++frequency4;
                    break;
                case 5:
                    ++frequency5;
                    break;
                case 6:
                    ++frequency6;
                    break;
            }
        }

        // display results
        System.out.println("Face\tFrequency");
        System.out.printf("1\t%d%n2\t%d%n3\t%d%n4\t%d%n5\t%d%n6\t%d%n",
                frequency1, frequency2, frequency3, frequency4, frequency5, frequency6);
    }
}