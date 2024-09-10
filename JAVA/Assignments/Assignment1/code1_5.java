import java.util.Scanner;
public class code1_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: Age of the person
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Check eligibility to vote
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are not eligible to vote.");
        }

     
    }
}


