//2)	Create a base class Vehicle with attributes like make and year. Provide a constructor in Vehicle to initialize these attributes. 
//Derive a class Car that has an additional attribute model and write a constructor that initializes make, year, and model.
 //Write a program to create a Car object and display its details.

 class Vehicle
 {
    String make = "mercedes";
    int year = 2014;

    public Vehicle()
    {
        this.make=make;
        this.year=year;
    }
   
 }

 class Car extends Vehicle
 {
    int model = 1998;

 public Car ()
 {
  this.model = model;  
 this.make = make;
 this.year = year;
 }

public class program2 {
    public static void main(String [] args)
    {
         Car c = new Car();
        {
          System.out.println(c.model);
        }
    }
}
}

