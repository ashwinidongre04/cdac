import java.util.Scanner;
public class assignque10 {
   
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();

     
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();

     
        System.out.print("Enter an arithmetic operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

       
        double result = 0; 

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
               
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator. Please enter +, -, *, or /.");
                return;
        }

        
        System.out.println("The result of the operation is: " + result);
    }
}


