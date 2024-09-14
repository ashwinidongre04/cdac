//5)Write a Java program to create a base class Vehicle with methods
 //startEngine() and stopEngine(). Create two subclasses Car and 
 //Motorcycle. Override the startEngine() and stopEngine() methods in
  //each subclass to start and stop the engines differently.


    class Vehicle {
        
        Vehicle() {
            
        }
        
        public void startEngine() {
            System.out.println("Started Vehicle engine");
        }
        public void stopEngine() {
            System.out.println("Stopped Vehicle engine");
        }
    }
    class Car extends Vehicle {
        
        Car() {
            
        }
        
        public void startEngine() {
            
            System.out.println("Started Car engine");
        }
        public void stopEngine() {
        
            System.out.println("Stopped Car engine");
        }
        
    }
    class MotorCycle extends Vehicle {
        MotorCycle() {
            
        }
        @Override
        public void startEngine() {
            System.out.println("Started MotorCycle engine");
        }
        @Override
        public void stopEngine() {
            System.out.println("Stopped MotorCycle engine");
        }
    }

    public class prob5
    {
       public static void main(String [] args)
       {
            MotorCycle moto = new MotorCycle();
            moto.startEngine();
       }
    }