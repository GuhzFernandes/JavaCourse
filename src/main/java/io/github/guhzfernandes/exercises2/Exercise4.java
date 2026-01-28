package io.github.guhzfernandes.exercises2;
//Write a Java program that inserts an element into array

import java.util.Arrays;

public class Exercise4 {
    public void main() {
        int[] array = {1,2,3,4,5};
        for(int value:array) System.out.print(value+"; ");
        System.out.println();
        //lets insert a new value into the end
        int[] intoTheEnd = new int[6];
        for (int i=0;i<array.length;i++) intoTheEnd[i] = array[i];
        intoTheEnd[5] = 6;

        for(int value:intoTheEnd) System.out.print(value+"; ");

    }
}
