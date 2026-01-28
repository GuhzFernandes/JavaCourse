package io.github.guhzfernandes.exercises1;
// Write a java program that compares two numbers entered by user

import java.util.Scanner;

public class Exercise2 {
    public void main() {
        Scanner input = new Scanner(System.in);
        int n1, n2;

        System.out.println("Number comparetor");

        System.out.println("Please insert the first number:");
        n1 = input.nextInt();

        System.out.println("Please insert the second number:");
        n2 = input.nextInt();

        if (n1>n2) System.out.println("First number is greater then the second one!");
        if (n1<n2) System.out.println("Second number is greater then the first one!");
        if (n1==n2) System.out.println("Both number are the same.");

    }
}
