package com.nextgencoderchallenges;

import java.util.Scanner;

public class NumberOfOnesChecker {

    public void countNumberOfOnes() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int inputNumber = scanner.nextInt();
        scanner.close();

        if (inputNumber > 1) {
            String inputNumberBinaryString = Integer.toBinaryString(inputNumber);
            char[] inputNumberBinaryToCharArray = inputNumberBinaryString.toCharArray();

            int onesCounter = 0;

            for (char charDigit : inputNumberBinaryToCharArray) {
                int numericDigit = Character.getNumericValue(charDigit);
                if (numericDigit == 1) {
                    onesCounter++;
                }
            }

            System.out.println("Binary Value: " + inputNumberBinaryString);
            System.out.println("Number of Ones: " + onesCounter);
        } else {
            System.out.println("Input number must be positive.");
        }
    }
}
