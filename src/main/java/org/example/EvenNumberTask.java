package org.example;

import java.util.Scanner;

public class EvenNumberTask {
    public static void main(String[] args) {

        int number;
        int remainder;

        System.out.println("Please enter an integer number");

        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        scanner.close();
        remainder = number % 2;

        if (remainder == 0) {
            System.out.println("The number " + number + " is an even number.");
        } else {
            System.out.println("The number " + number + " is an odd number.");
        }
    }
}
