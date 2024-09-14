//1) Create a base class BankAccount with methods like deposit() and withdraw(). Derive a class SavingsAccount
// that overrides the withdraw() method to impose a limit on the withdrawal amount. 
//Write a program that demonstrates the use of overridden methods and proper access modifiers & return the details.

class  BankAccount 
{
   public void  deposit()
    {
     System.out.println("you can deposit money here");
    }
    public void withdraw()
    {
        System.out.println("you can withdraw money here");
    }
}
class SavingsAccount extends BankAccount 
{
    public void withdraw()
    {    super.withdraw();
        System.out.println("you can withdraw money but only upto 50000");
    }
}

 public class program1 {
    public static void main(String [] args)
    {
        SavingsAccount save = new SavingsAccount();
        save.withdraw();
    }
    

    
}
