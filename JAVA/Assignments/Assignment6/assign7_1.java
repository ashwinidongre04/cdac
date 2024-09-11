import java.util.*;
public class assign7_1 {
   
 
    public static void main(String[] args) {
        
        int[] arr = new int[5];
        for(int i=0 ; i<arr.length ; i++) { 
            arr[i] = i;
        }
       Scanner sc = new Scanner(System.in);
        
        for(int i=0 ; i<arr.length ; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i=0 ; i<arr.length ; i++) {
            System.out.println(arr[i]);
        }

    }
 }

