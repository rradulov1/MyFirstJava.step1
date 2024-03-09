package org.example;

import java.util.Scanner;

public class RectangleTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value og the width side:");
        int widthSide = scanner.nextInt();

        System.out.println("Enter the value of the length side:");
        int lengthSide = scanner.nextInt();

        int perimeter = 2*(widthSide+lengthSide);
        System.out.println("The perimeter of the rectangle is: " + perimeter);

        int area = (widthSide*lengthSide);
        System.out.println("The area of the rectangle is: " + area);
    }
}
