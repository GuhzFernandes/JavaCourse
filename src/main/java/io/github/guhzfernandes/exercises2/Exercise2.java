package io.github.guhzfernandes.exercises2;

import java.util.Arrays;
import java.util.Scanner;

public class Exercise2 {
    public void main() {

        Scanner input = new Scanner(System.in);
        int[] inputs = new int[10];
        double average= 0;

        for(int i = 0;i<inputs.length;i++){
            System.out.println("Insert the #"+(i+1)+" number:");
            inputs[i] = input.nextInt();
            average+=inputs[i];
        }
        //System.out.println("Average: "+ Arrays.stream(inputs).average());
        System.out.println("Average: "+average/inputs.length);
        input.close();
    }
}
