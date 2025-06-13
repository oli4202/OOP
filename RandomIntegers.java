/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.randominteger;

/**
 *
 * @author Oli
 */


    
import java.security.SecureRandom;

public class RandomIntegers {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom(); // create random number generator

        // loop 20 times
        for (int counter = 1; counter <= 20; counter++) {
            int face = 1 + randomNumbers.nextInt(6); // pick random int from 1 to 6
            System.out.printf("%d ", face); // display value

            // start new line after every 5 numbers
            if (counter % 5 == 0)
                System.out.println();
        }
    }
}
    

