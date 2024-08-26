SECTION 1 

1 snippet

public class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i--) { 
 System.out.println(i); 
 } 
 } 
} 
In this code i-- will replace with i++

corrected one 

public class InfiniteForLoop { 
 public static void main(String[] args) { 
 for (int i = 0; i < 10; i++) { 
 System.out.println(i); 
 } 
 } 
} 

2 snippet

In this code (count != 0) will come

public class IncorrectWhileCondition { 
 public static void main(String[] args) { 
 int count = 5; 
 while (count != 0) { 
 System.out.println(count); 
  count--;
 } 
 
 } 
}

3 snippet

IN this snippet the statement of while condition is increasing after each increment
so the correct code is

public class DoWhileCorrectCondition { 
    public static void main(String[] args) { 
        int num = 0; 
        do { 
            System.out.println(num); 
            num++; 
        } while (num < 10);  // The loop stops when num reaches 10
    } 
}

4 snippet

public class OffByOneErrorForLoop { 
 public static void main(String[] args) { 
 for (int i = 1; i <= 10; i++) { 
 System.out.println(i); 
 } 
 // Expected: 10 iterations with numbers 1 to 10 
 // Actual: Prints numbers 1 to 10, but the task expected only 1 to 9 
 } 
} 

in this code if we remove = then it will print the expected output

corrected one

public class OffByOneErrorForLoop { 
 public static void main(String[] args) { 
 for (int i = 1; i <10; i++) { 
 System.out.println(i); 
 } 
 
 } 
} 

5 snippet

the loop doesnot give the expecyted output because it is incrementing 'i'

corrected one

public class WrongInitializationForLoop { 
 public static void main(String[] args) { 
 for (int i = 10; i >= 0; i--) { 
 System.out.println(i); 
 } 
 } 
}

6 snippet

Because in this code after for condition only one statement will bw considered because their were 
no curly braces thats why second statement of done considered outside the loop 

corrected one

public class MisplacedForLoopBody { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i++) {
      System.out.println(i); 
      System.out.println("Done");} 
 } 
}

7 snippet

in this snippet value of count was not declared

corrected one 

public class UninitializedWhileLoop { 
 public static void main(String[] args) { 
 int count = 1; 
 while (count < 10) { 
 System.out.println(count); 
 count++; 
 } 
 } 
} 

8 snippet

in this code if we need to print the numbers from 1 to 5 
then u need to num++ and num<=5

public class OffByOneDoWhileLoop { 
 public static void main(String[] args) { 
 int num = 1; 
 do { 
 System.out.println(num); 
 num++; 
 } while (num <=5); 
 } 
} 

9 snippet

corrected one

public class InfiniteForLoopUpdate { 
 public static void main(String[] args) { 
 for (int i = 0; i < 5; i ++) { 
 System.out.println(i); 
 } 
 } 
}

10 snipppet

in ths code 
public class IncorrectWhileLoopControl { 
 public static void main(String[] args) { 
 int num = 10; 
 while (num == 10) { 
 System.out.println(num); 
 num--; 
 } 
 } 
} 

11 snippet

SECTION 2

1 SNIPPET
 
 OUTPUT : 1 1 1 2 
          2 1 2 2 
          3 1 3 2

2 SNIPPET

OUTPUT : 11

3 SNIPPET

OUTPUT : 0 1 2 3

4 SNIPPET

OUTPUT : 1 2 3 4 5

5 SNIPPET

OUTPUT : 3

6 SNIPPET

OUTPUT : 8

7 SNIPPET

OUTPUT : 49

8 SNIPPET

OUTPUT : -4 		  
		  
		  

SECTION 3 

Q1

public class NaturalNumber  
{  
public static void main(String[] args)   
{
  int sum=0;
  for(int i=0;i<=50;i++)
  {
    sum = sum +i;
  }
  System.out.println(sum);
}
}

Q2

public class Factorial 
{  
public static void main(String[] args)   
{
  int fact =1;
  for(int i=10;i>=1;i--)
  {
   fact = fact*i;
  }
  System.out.println(fact);
}
}

Q3

public class Multiple  
{  
public static void main(String[] args)   
{
  
  for(int i=1;i<=100;i++)
  {
   if(i%7==0)
   {
     System.out.println(i);
   }
  }

}
}

Q4

public class Reverse 
{  
public static void main(String[] args)   
{  
int number = 987654, reverse = 0;  
while(number != 0)   
{  
int remainder = number % 10;  
reverse = reverse * 10 + remainder;  
number = number/10;  
}  
System.out.println("reversed number : " + reverse);  
}  
}

Q5

public class Fibonacci  
{  
public static void main(String[] args)   
{
  
  int num1 = 0, num2 = 1;

        for (int i = 0; i < 21; i++) {
           
            System.out.print(num1 + " ");

           
            int num3 = num2 + num1;
            num1 = num2;
            num2 = num3;
}
}
}

Q7
		public class SumofDigits {
    public static void main(String[] args) {
        int n = 9876;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10; 
            sum += digit;            
            n /= 10;            
        }

        System.out.println("Sum of digits: " + sum );
    }
}

Q8

public class Count 
{  
public static void main(String[] args)   
{
  
  for(int i=10;i>=0;i--)
  {
    System.out.println(i);
  }
}
}

Q9

public class LargestDigit {
    public static void main(String[] args) {
        int n = 4825;
        int largestDigit = 0;

        while (n > 0) {
            int digit = n % 10; 
            if (digit > largestDigit) {
                largestDigit = digit; 
            }
            n /= 10; 
        }

        System.out.println("The largest digit is: " + largestDigit);
    }
}

Q10

public class EvenNum
{  
public static void main(String[] args)   
{
  
  for(int i=1;i<=50;i++)
  {
    if(i%2==0)
    {
       System.out.println(i);
    }
   
  }
}
}

Q11

public class SumOfNaturalNumber1  
{  
public static void main(String[] args)   
{
  
  int i = 5;
        int result = ++i + i--;
        System.out.println(result);
}
}

Q12

public class Star 
{  
public static void main(String[] args)   
{
  
  for(int i =1;i<=5;i++){
  
    for(int j = 0;j<=5;j++)
    {
       System.out.print("*");
    }
    System.out.println(" ");
  }
  
}
}

Q13

public class NumberPattern {
    public static void main(String[] args) {
        int n = 5;  

        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");  
                }
            }
            System.out.println();  
        }

       
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
                if (j < i) {
                    System.out.print("*");  
                }
            }
            System.out.println(); 
        }
    }
}

Q14

public class Star {
    public static void main(String[] args) {
        int rows = 6; 

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

Q15

  class pattern { 
    public static void main(String[] args) 
    { 
       int rows = 5; 
        for (int i = 1; i <= rows; i++) { 
  
            for (int j = rows; j >= i; j--) { 
                System.out.print(" "); 
            } 
  
            for (int j = 1; j <= i; j++) { 
                System.out.print("* "); 
            } 
  
            System.out.println(); 
        } 
    } 
}
  
Q16
public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
            
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

Q17

public class StarPattern {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = rows; i > 0; i--) 
            for (int j = rows; j > i; j--) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            
            System.out.println();
        }
    }
}

Q18

public class DiamondPattern {
    public static void main(String[] args) {
        int n = 4; 

        
        for (int i = 1; i <= n; i++) {
           
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

        
        for (int i = n - 1; i > 0; i--) {
           
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}

Q19

public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
                if (j < i) {
                    System.out.print("*"); 
                }
            }
           
            System.out.println();
        }
    }
}

Q20


Q21

public class OddNumberPattern {
    public static void main(String[] args) {
        int rows = 5; 
        int oddNum = 1; 

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(oddNum);
                if (j < i) {
                    System.out.print("*"); 
                }
                oddNum += 2; 
            }
            
            System.out.println();
            
            oddNum = 1;
        }
    }
}

Q22
public class DiamondPattern {
    public static void main(String[] args) {
        int n = 5; 

        
        for (int i = n; i >= 1; i--) {
            
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }

       
        for (int i = 2; i <= n; i++) {
            
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
           
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
           
            System.out.println();
        }
    }
}

Q23

public class Number {
    public static void main(String[] args) {
   int num =5;
   for(int i=1;i<=num;i++)
   {
     
     for(int j=1;j<=num;j++)
     {
         System.out.print(i);
     }
     System.out.println();
   }
              
    }
}

Q24

public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5; 

        for (int i = 1; i <= rows; i++) {
           
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            
            System.out.println();
        }
    }
}

Q25

public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            System.out.println();
        }
    }
}

Q26

public class NumberPattern {
    public static void main(String[] args) {
        int rows = 5; 
        int num = 1;  

        for (int i = 1; i <= rows; i++) {
            
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; 
            }
           
            System.out.println();
        }
    }
}



