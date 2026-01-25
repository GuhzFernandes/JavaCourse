package io.github.guhzfernandes.exercises;
// Write a Java program that counts the letters, spaces, numbers and others caracteres of an input string.

import java.util.Scanner;

public class Exercise9 {
    public void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("type anything:");
        System.out.println(input.nextLine().length());

        input.close();
    }
}
