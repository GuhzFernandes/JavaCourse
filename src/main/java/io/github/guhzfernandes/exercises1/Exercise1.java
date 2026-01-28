package io.github.guhzfernandes.exercises;
//Write a java program that calculates the factorial of 10

public class Exercise1 {
    public int factorial(int n){
        if(n>1) {
            return n * factorial(n - 1);
        } else return n;
    }
    public void main() {
        System.out.println(factorial(10));
    }
}
