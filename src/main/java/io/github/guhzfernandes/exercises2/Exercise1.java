package io.github.guhzfernandes.exercises2;
//write a java program that allows the user to enter 10 number and give their sum.

import java.util.Scanner;

public class Exercise1 {
    public void main() {

        Scanner input = new Scanner(System.in);
        int[] inputs = new int[10];
        int sum = 0;

        for(int i = 0;i<inputs.length;i++){
            System.out.println("Insert the #"+(i+1)+" number:");
            inputs[i] = input.nextInt();
            sum+=inputs[i];
        }
        System.out.println("Sum: "+sum);
        input.close();
    }
}
