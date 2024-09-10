import java.util.Scanner;
public class CompoundInterestCalculator {
    private double principal;
    private double annualInterestRate;
    private int numberOfCompounds;
    private int years;
    private double futureValue;

    
    public void acceptRecord() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the initial investment amount (Principal) in ₹: ");
        principal = scanner.nextDouble();
        System.out.print("Enter the annual interest rate (in %): ");
        annualInterestRate = scanner.nextDouble();
        System.out.print("Enter the number of times interest is compounded per year: ");
        numberOfCompounds = scanner.nextInt();
        System.out.print("Enter the investment duration (in years): ");
        years = scanner.nextInt();
    }

   
    public void calculateFutureValue() {
        double ratePerPeriod = annualInterestRate / numberOfCompounds / 100;  
        int totalPeriods = numberOfCompounds * years;  
        
        futureValue = principal * Math.pow(1 + ratePerPeriod, totalPeriods);
    }

   
    public void printRecord() {
        double totalInterest = futureValue - principal; 
        System.out.printf("Future Value of Investment: ₹%.2f\n", futureValue);
        System.out.printf("Total Interest Earned: ₹%.2f\n", totalInterest);
    }

   
    public static void main(String[] args) {
        CompoundInterestCalculator calculator = new CompoundInterestCalculator();
        calculator.acceptRecord();  
        calculator.calculateFutureValue(); 
        calculator.printRecord();  
    }
}
