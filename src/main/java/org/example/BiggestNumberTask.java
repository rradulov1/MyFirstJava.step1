package org.example;

import java.util.Scanner;

public class BiggestNumberTask {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int firstNumber = scanner.nextInt();

        System.out.println("Enter the second number:");
        int secondNumber = scanner.nextInt();

        System.out.println("Enter the third number:");
        int thirdNumber = scanner.nextInt();

        if (firstNumber >= secondNumber) {
            if (firstNumber >= thirdNumber) {
                System.out.println("The biggest number is: " + firstNumber);
            } else {
                System.out.println("The biggest number is: " + thirdNumber);
            }
        } else if (secondNumber >= thirdNumber) {
            System.out.println("The biggest number is: " + secondNumber);
        } else {
            System.out.println("The biggest number is: " + thirdNumber);
        }
    }
}
