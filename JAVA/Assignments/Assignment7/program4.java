// 4)	Build a class Student which contains details about the Student and compile and run its
//instance.

class Student 
{
   String name;
   int age;
   int rollnum;
   String bloodgrp;

   public Student( String name,int age,int rollnum, String bloodgrp)
   {
      this.name = name;
      this.age = age;
      this.rollnum = rollnum;
      this.bloodgrp= bloodgrp;
   }
}

public class program4 {
    public static void main(String[] args)
    {
        Student st = new Student("Ashwini", 22, 13,"AB+");
        System.out.println(st.name);
    }
}
