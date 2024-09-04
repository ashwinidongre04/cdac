import java.util.Scanner;
public class code1_4 {
    

 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Height in meters and weight in kilograms
        System.out.print("Enter your height in meters: ");
        double height = sc.nextDouble();

        System.out.print("Enter your weight in kilograms: ");
        double weight = sc.nextDouble();

        // Calculate BMI
        double bmi = weight / (height * height);

        // Output the BMI value
        System.out.printf("Your BMI is: %.2f\n", bmi);

        // Classify BMI using if-else
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 24.9) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 29.9) {
            System.out.println("You are overweight.");
        } else if (bmi >= 30 && bmi < 34.9) {
            System.out.println("You are obese (Class 1).");
        } else if (bmi >= 35 && bmi < 39.9) {
            System.out.println("You are obese (Class 2).");
        } else {
            System.out.println("You are extremely obese (Class 3).");
        }

       
    }
}


