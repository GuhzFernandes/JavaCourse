package io.github.guhzfernandes.exercises2;
// Write a java program that reverses an entered string

import java.util.Scanner;

public class Exercise10 {
    public void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("type anything");
        System.out.println(new StringBuilder(input.nextLine()).reverse());
        input.close();

    }
}
