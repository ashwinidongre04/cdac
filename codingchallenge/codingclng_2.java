public class codingclng_2 {
    public static void main(String[] args) {
        int rows = 5; 
        char alphabet = 'A'; 

        for (int i = 1; i <= rows; i++) {
            
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }

            
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print(alphabet);
                alphabet++; 
               
                if (alphabet > 'Z') {
                    alphabet = 'A';
                }
            }

           
            System.out.println();
        }
    }
}
