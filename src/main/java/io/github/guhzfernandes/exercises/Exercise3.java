package io.github.guhzfernandes.exercises;
// Write a program that removes an element from array

import java.util.Arrays;

public class Exercise3 {
    public void main() {
        int[] array = {1,2,3,4,5};
        for(int value:array) System.out.print(value+"; ");
        //lets remove the number 3
        for (int i=2;i<array.length-1;i++){
            array[i] = array[i+1];
        }
        int[] newArray = Arrays.copyOf(array,array.length-1);
        for(int value:newArray) System.out.print(value+"; ");
    }
}
