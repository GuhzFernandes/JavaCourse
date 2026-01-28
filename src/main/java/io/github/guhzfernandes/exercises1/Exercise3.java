package io.github.guhzfernandes.exercises1;
// write a java program that compute the sum of digits of a number

import java.util.Scanner;

public class Exercise3 {
    public void main() {
        Scanner input = new Scanner(System.in);
        int originalNumber, number, sum;

        System.out.println("Enter a number to get the sum of it's digits");
        originalNumber = number = input.nextInt();

        sum=0;
        while(number>0){
            sum += number%10;
            number /=10;
        }
        System.out.println("number:"+originalNumber+"\nsum: "+sum);
    }
}
