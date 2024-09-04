public class code1_3 {
   public static void main(String[] args)
   {
    int year=2002;
    boolean leap = false;
  
    if (year % 4 == 0) {

        
        if (year % 100 == 0) {
  
         
          if (year % 400 == 0)
            leap = true;
          else
            leap = false;
        }
        
       
        else
          leap = true;
      }
      
      else
        leap = false;
  
      if (leap)
        System.out.println(year + " is a leap year.");
      else
        System.out.println(year + " is not a leap year.");
    }
  }

  /*BY USING SWITCH CASE

public class LeapYearChecker {
    public static void main(String[] args) {
 int year = 2024; // Replace with any year you want to check

 switch (year % 4) {
  case 0:
   switch (year % 100) {
  case 0:
  switch (year % 400) {
     case 0:
   System.out.println(year + " is a leap year.");
     break;
    default:
    System.out.println(year + " is not a leap year.");
  }
    break;
 default:
  System.out.println(year + " is a leap year.");
   }
  break;
  default:
 System.out.println(year + " is not a leap year.");
}
 }
}


  */
   
  
