import java.util.Scanner;
public class assign7_3 {
  
    public static void main(String[] args) {
        
        int[] numbers = new int[5];

       
        acceptRecord(numbers);

        
        int max = findMax(numbers);
        int min = findMin(numbers);

        System.out.println("\nMaximum value in the array: " + max);
        System.out.println("Minimum value in the array: " + min);
    }

   
    public static void acceptRecord(int[] arr) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number for index " + i + ": ");
            arr[i] = scanner.nextInt();
        }
        scanner.close();
    }

    
    public static int findMax(int[] arr) {
        int max = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  
            }
        }
        return max;
    }

  public static int findMin(int[] arr) {
        int min = arr[0];  

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];  
            }
        }
        return min;
    }
}


