import java.util.Scanner;
public class assign7_2 {
 public static void printRecord(int[] arr) {
        System.out.println("\nThe values of the array are:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
public  static void acceptRecord(int[] arr) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter 5 integers:");
    
            for (int i = 0; i < arr.length; i++) {
                System.out.print("Enter number for index " + i + ": ");
                arr[i] = scanner.nextInt();
            }
            scanner.close();
        }
    
    public static void main(String[] args) {
        
        int[] numbers = new int[5];

       
        acceptRecord(numbers);

       
        printRecord(numbers);
    }
}

   