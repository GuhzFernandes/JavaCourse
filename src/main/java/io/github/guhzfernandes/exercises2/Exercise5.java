package io.github.guhzfernandes.exercises2;
// Write a java program that finds the max and min of array

import java.util.Arrays;

public class Exercise5 {
    public void main() {
        int[] array = new int[50];
        int min = 0;
        int max = 0;

        for (int i=0;i<array.length;i++) {
            array[i] = (int)(Math.random()*99+1);
            if(i==0){
                min = array[0];
                max = array[0];
            }
            else{
                if(min>=array[i]) min=array[i];
                if(max<=array[i]) max=array[i];
            }
        }
        for(int value:array) System.out.println(value);

        System.out.println("max: "+ max);
        System.out.println("min: "+ min);

        /*
        //or

        for (int i=0;i<array.length;i++) array[i] = (int)(Math.random()*99+1);
        for(int value:array) System.out.println(value);

        min = Arrays.stream(array).min().orElse(0);
        max = Arrays.stream(array).max().orElse(0);

        System.out.println("max: "+ max);
        System.out.println("min: "+ min);
        */
    }
}
