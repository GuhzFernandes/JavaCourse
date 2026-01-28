package io.github.guhzfernandes.exercises;
// Write a jav aprogram that convert a string to integer and vice versa

public class Exercise4 {
    public void main() {
        //String to number
        String stringNumber = "123";
        System.out.println(stringNumber+" is "+stringNumber.getClass());

        int number = Integer.parseInt(stringNumber);
        System.out.println("trying to sum 123 + 123");
        System.out.println(number+123);

        System.out.println("----");
        //Int to String
        int intNumber = 321;

        String numberString = String.valueOf(intNumber);
        System.out.println(numberString +" is "+ numberString.getClass());
    }
}
