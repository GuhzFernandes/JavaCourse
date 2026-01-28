package io.github.guhzfernandes.exercises2;
//Write a java program that reverses an array

public class Exercise6 {
    public void main() {
        int[] array = {1,2,3,4,5,6,7,8,9};
        int[] reversedArray = new int[array.length];

        for(int i=0; i<array.length; i++) reversedArray[array.length-1-i] = array[i];

        for (int item:reversedArray) System.out.println(item);

    }
}
