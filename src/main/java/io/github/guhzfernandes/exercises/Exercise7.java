package io.github.guhzfernandes.exercises;
//Write a program in java that finds duplicate values of array

import java.util.Arrays;

public class Exercise7 {
    public void main() {
        int[] array = {1,1,2,3,4,5,5,6,7,8,9};

        for(int i = 0; i<array.length; i++) {
            for (int j = i+1; j< array.length; j++){
                if(array[i] == array[j] ) System.out.println( array[j] );
            }
        }
    }
}
