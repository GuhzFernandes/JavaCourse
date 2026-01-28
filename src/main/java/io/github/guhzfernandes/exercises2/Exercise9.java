package io.github.guhzfernandes.exercises2;
// Write a Java program that counts the letters, spaces, numbers and others characters of an input string.

import java.util.Scanner;

public class Exercise9 {
    public void main() {
        Scanner input = new Scanner(System.in);
        int characters, numbers, spaces, others;
        characters = numbers = spaces = others = 0;

        System.out.println("type anything:");
        String inputText = input.nextLine();
        for (int i = 0; i<inputText.length(); i++){
            if(Character.isAlphabetic(inputText.charAt(i))) characters++;
            else if (Character.isDigit(inputText.charAt(i))) numbers++;
            else if (Character.isSpaceChar(inputText.charAt(i))) spaces++;
            else others++;
        }

        System.out.println(inputText.length() + " total characters");
        System.out.println(characters+" letters");
        System.out.println(numbers+" numbers");
        System.out.println(spaces+" spaces");
        System.out.println(others+" others");
        input.close();
    }
}
