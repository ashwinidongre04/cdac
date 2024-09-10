public class instancecounter {

    static int instanceCount = 0;
      
       public instancecounter() {
                  instanceCount++;
          }
    
          public static int getInstanceCount() {
              return instanceCount;
          }
      }
      
      public class Program {
          public static void main(String[] args) {
              // Create instances of InstanceCounter
              instancecounter obj1 = new instancecounter();
              instancecounter obj2 = new instancecounter();
              instancecounter obj3 = new instancecounter();
      
              // Display the number of instances created
              System.out.println("Number of instances created: " + instancecounter.getInstanceCount());
          }
      }
      
      