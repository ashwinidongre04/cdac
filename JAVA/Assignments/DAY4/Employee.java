import java.util.Scanner;
public class Employee {
    int salary;
    int empid;
    int exp;
    String name;
    String position;

    void getData()
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("enter salary");
        salary = sc.nextInt();
        System.out.println("enter empid");
        empid = sc.nextInt();
        System.out.println("enter experience");
        exp = sc.nextInt();
        System.out.println("enter name");
        name = sc.nextLine();
        System.out.println("enter position");
        position = sc.nextLine();


    }

    public Employee(int salary, int empid, int exp,String name,String position)

    {
      this.salary = salary;
      this.empid = empid;
      this.exp = exp;
      this.name = name;
      this.position = position;

    }

    void printData()
    {
        System.out.println(salary);
        System.out.println(empid);
        System.out.println(exp);
        System.out.println(name);
        System.out.println(position);


    }

    public static void main(String [] args)
    {
        Employee emp = new Employee(0, 0, 0, null, null);
        emp. getData();
        emp.printData();


    }
}
