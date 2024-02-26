package org.example;


import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Enter your name");

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        System.out.println("Your name is " + name);

        System.out.println("Hello " + name + " nice to meet you");

        System.out.println("What is your hobby?");

        String hobby=scanner.nextLine();

        System.out.println("Your hobby is " + hobby );








    }
}
