package org.example;

import java.util.Scanner;

public class WeekDaysTask {
    public static void main(String[] args) {
        System.out.println("Enter a number in the range 1-7:");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        switch (number) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("An error occurred. Accepted input is a number in the range 1-7.");
                break;
        }


    }
}
