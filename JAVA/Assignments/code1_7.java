import java.util.Scanner;
public class code1_7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Select a shape to calculate the area:");
        System.out.println("1. Circle  2.Square 3.Rectangle 4.Triangle");
       
        System.out.print("Enter your choice (1-4): ");
        int choice = sc.nextInt();

       
        double area = 0;

      
        switch (choice) {
            case 1:
                System.out.print("Enter the radius of the circle: ");
                double radius = sc.nextDouble();
                area = 3.14 * radius * radius;
                break;
            case 2: 
                System.out.print("Enter the side length of the square: ");
                double side = sc.nextDouble();
                area = side * side;
                break;
            case 3:
                System.out.print("Enter the length of the rectangle: ");
                double length = sc.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = sc.nextDouble();
                area = length * width;
                break;
            case 4: 
                System.out.print("Enter the base of the triangle: ");
                double base = sc.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = sc.nextDouble();
                area = 0.5 * base * height;
                break;
            default:
                System.out.println("Invalid choice! Please select a valid shape (1-4).");
                return; 
        }

      
        System.out.printf("The area of the selected shape is: %.2f\n", area);

    
    }
}

