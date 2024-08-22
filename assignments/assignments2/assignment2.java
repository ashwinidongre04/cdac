
SECTION 1


1 snippet


public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
 here in this code the keyword static is missing 
and error comes as: enum,class , interface expected


2 snippet

public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 
here in this code the keyword public is missing 
and errorc comes as : main method not found

3 snippet

public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 
 }
}

in this code int will not come in main method and no return type
void is used in main method because  
It signifies that the method does not return any value

4 snippet

public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 

In this code String[] args is used to pass command-line arguments to the application. 

5 snippet

Yes multiple main methods are allowed in java but their is a catch it is only 
allowed with different parameters

6 snippet

Error : cannot find symbol
Variables are neccesary to declare to know the datatype of the variable and allocate the memory in the backend

7 snippet

Error : string cannot be converted to int

8 snippet

public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 } 
} 

here ); was missing and will cause syntax error

9 snippet

We cannot use reserved keywords as identifiers because it will give error after compilation

10 snippet

Error: non-static method display() cannot be referenced from a static context
YES method overloading is allowed in java

11 snippet

In this code the array does not have any block after 3 

12 snippet

It will print "infinite loop " multiple times
We can avoid infinite loop by providing a false statement or terminating statement

13 snippet

14 snippet

Error : String cannot be converted to double
 Java enforce datatype constraints to improve code readability and catch type-related errors at compile time.

15 snippet

Error: incompatible types: possible lossy conversion from double to int

corrected one 

public class Main { 
 public static void main(String[] args) { 
 double num1 = 10; 
 double num2 = 5.5; 
 double result = num1 + num2; 
 System.out.println(result); 
 } 
} 

16 snippet

The output is 2.0 and this output is not the expected output

17 snippet

error: illegal start of expression

18 snippet

output : 20
 Operator precedence specifies the manner in which operands are
 grouped with operators. For example, 1 + 2 * 3 is treated as
 1 + (2 *3), whereas 1 * 2 + 3 is treated as (1 * 2) + 3 because the
 multiplication operator * has a higher precedence than the addition operator +
 
 19 snippet
 
 Arithematic exception, it is a runtime exception
 
 20 snippet
 
 public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World") 
 } 
} 

here semicolon is missing after )
Missing semicolon in the code gives the syntax error

21 snippet

public class Main { 
 public static void main(String[] args) { 
 System.out.println("Hello, World!"); 
 // Missing closing brace here 
} 


 error: reached end of file while parsing
 
 22 snippet
 
  error: illegal start of expression
   error: class, interface, or enum expected
   
 23 snippet
 
 public class Confusion { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1"); 
 case 2: 
 System.out.println("Value is 2"); 
 case 3: 
 System.out.println("Value is 3"); 
 default: 
 System.out.println("Default case"); 
 } 
 } 
} 
the default case print after "Value is 2" because their is no break statement

correct one :

public class Confusion { 
 public static void main(String[] args) { 
 int value = 2; 
 switch(value) { 
 case 1: 
 System.out.println("Value is 1");
 break; 
 case 2: 
 System.out.println("Value is 2"); 
 break;
 case 3: 
 System.out.println("Value is 3");
 break; 
 default: 
 System.out.println("Default case"); 
 } 
 } 
}
 
 24 snippet
 
 In this code such thing happened because their is no break statement in case1
 if their is no break statement the compiler will print all the statements.
 
 25 snippet
 
The error says possible lossy conversion from double to int
To correct the code we will :

public class Switch { 
 public static void main(String[] args) { 
 int score = 85; 
 switch(score) { 
 case 100: 
 System.out.println("Perfect score!"); 
 break; 
 case 85: 
 System.out.println("Great job!"); 
 break; 
 default: 
 System.out.println("Keep trying!"); 
 } 
 } 
} 

26 snippet

Because the numbering for case is similar in all conditions 
When we have two identical case labels it will throw error of duplication 


 SECTION 2
 
 Q.1
 
public class Marks {
    public static void main(String[] args) {
        int score = 72;
        
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
}
}

 Q.2
 
 public class Weekchart {
    public static void main(String[] args) {
        
        int day = 2;
        
        switch(day)
        {
          case 1:
            {
              System.out.println("it is monday");
              System.out.println("it is weekday");
              break;
            }
             case 2:
            {
              System.out.println("it is tuesday");
              System.out.println("it is weekday");
               break;
            }
             case 3:
            {
              System.out.println("it is wednesday");
              System.out.println("it is weekday");
               break;
            }
             case 4:
            {
              System.out.println("it is thursday");
              System.out.println("it is weekday");
               break;
            }
             case 5:
            {
              System.out.println("it is friday");
              System.out.println("it is weekday");
               break;
            }
             case 6:
            {
              System.out.println("it is saturday");
              System.out.println("it is weekend");
               break;
            }
             case 7:
            {
              System.out.println("it is sunday");
              System.out.println("it is weekend");
               break;
            }
            
            default:
            System.out.println("wrong input");
            
        }
	}
 }
		
		
		
	Q.3
	
		public class SimpleCalculator {

    public static void main(String[] args) {
        
		int num1=10;
		int num2 = 0;
        int operator ='+';
        double result;

        // Use a switch statement to perform the appropriate operation
        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
                // Use nested if-else to check for division by zero
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;

            default:
                System.out.println("Error: Invalid operator.");
                break;
        }

        
    }
}

  Q.4
  
  public class Discount{
	  
	  public static void main(String[] args)
	  {
		  int price=800;
		  double total;
		  boolean membership= true;
		  
		  if(price>1000)
		  {
			  if(membership==true)
			  {
				  total = price * 0.25;
				  System.out.println(total);
			  }
			  else {
				  total = price * 0.2;
				  System.out.println(total);
			  }
		  }
		  else if(price>500 && price<999)
		  {
			  if(membership==true)
			  {
				  total = price * 0.15;
				  System.out.println(total);
			  }
			   else {
				  total = price * 0.10;
				  System.out.println(total);
			  }
			  
		  }
		  else if(price<500 )
		  {
			  if(membership==true)
			  {
				  total = price * 0.10;
				  System.out.println(total);
			  }
			   else {
				  total = price * 0.05;
				  System.out.println(total);
			  }
			  
		  }
	  }
  }

  Q.5
  
        public class StudentGrades {
    public static void main(String[] args) {
        int subject1 = 54;
		int subject2 = 46;
		int subject3=  49;
        int failedSubjects = 0;

        if (subject1 <= 40) {
            failedSubjects++;
        }
        if (subject2 <= 40) {
            failedSubjects++;
        }
        if (subject3 <= 40) {
            failedSubjects++;
        }

        // Determine if the student passes or fails
        if (failedSubjects == 0) {
            System.out.println("The student passes.");
        } else {
            System.out.println("The student fails.");
            System.out.println("Number of subjects failed: " + failedSubjects);
        }

       
    }
}


