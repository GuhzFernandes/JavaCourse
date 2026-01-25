package io.github.guhzfernandes.exercises;
// Write a java program that rotates an array clockwise (move every position one forward

import java.util.Arrays;

public class Exercise8 {
    public void main() {
        int[] array = {1,2,3,4,5,6,7,8,9};

        int aux = array[array.length-1];
        for (int i = array.length-1; i>0; i--) array[i] = array[i-1];
        array[0] = aux;

        Arrays.stream(array).forEach(System.out::println);
        }
}
