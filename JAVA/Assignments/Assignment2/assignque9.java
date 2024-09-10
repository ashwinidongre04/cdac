public class assignque9 {
   
        // Instance variables (non-static fields)
        byte instanceByte;
        short instanceShort;
        int instanceInt;
        long instanceLong;
        float instanceFloat;
        double instanceDouble;
        char instanceChar;
        boolean instanceBoolean;
    
        // Static variables (class fields)
        static byte staticByte;
        static short staticShort;
        static int staticInt;
        static long staticLong;
        static float staticFloat;
        static double staticDouble;
        static char staticChar;
        static boolean staticBoolean;
    
        public static void main(String[] args) {
          
            assignque9 defaults = new  assignque9();
    
           
            System.out.println("Default values of instance variables:");
            System.out.println("byte: " + defaults.instanceByte);
            System.out.println("short: " + defaults.instanceShort);
            System.out.println("int: " + defaults.instanceInt);
            System.out.println("long: " + defaults.instanceLong);
            System.out.println("float: " + defaults.instanceFloat);
            System.out.println("double: " + defaults.instanceDouble);
            System.out.println("char: '" + defaults.instanceChar + "'");
            System.out.println("boolean: " + defaults.instanceBoolean);
    
           
            System.out.println("\nDefault values of static variables:");
            System.out.println("byte: " + staticByte);
            System.out.println("short: " + staticShort);
            System.out.println("int: " + staticInt);
            System.out.println("long: " + staticLong);
            System.out.println("float: " + staticFloat);
            System.out.println("double: " + staticDouble);
            System.out.println("char: '" + staticChar + "'");
            System.out.println("boolean: " + staticBoolean);
        }
    }
    
    

