void main() {
    Scanner input = new Scanner(System.in);
    Double bmi, height,weight;

    System.out.println("let's check your BMI!");

    System.out.println("Please inform your height:eg x.xx");
    height = input.nextDouble();
    System.out.println("Please inform your weight:eg xxx");
    weight = input.nextDouble();

    bmi = weight/(height*height);
    System.out.println("Your BMI is: " + bmi);
    System.out.println("\n\nBMI reference categories for adults\n" +
            "Underweight. Less than 18.5.\n" +
            "Healthy Weight. 18.5 to less than 25.\n" +
            "Overweight. 25 to less than 30.\n" +
            "Obesity. 30 or greater.\n" +
            "Class 1 Obesity. 30 to less than 35.\n" +
            "Class 2 Obesity. 35 to less than 40.\n" +
            "Class 3 Obesity. (Severe Obesity) 40 or greater.");

    input.close();
}
