//3)Create a base class Animal with attributes like name, and methods like eat() and sleep(). Create a 
//subclass Dog that inherits from Animal and has an additional method bark(). Write a program to 
//demonstrate the use of inheritance by creating objects of Animal and Dog and calling their methods.

class Animal
{
    String name;
    public void eat()
    {
        System.out.println("eating");
    }
    public void sleep()
    {
        System.out.println("sleeping");
    }

}
class Dog extends Animal{

   public void  bark()
   {
      System.out.println("barking");
   }
}

public class program3 {
    public static void main(String [] args)
    {
        Dog d = new Dog ();
        d.bark();
        d.sleep();
        d.eat();
    }
}
