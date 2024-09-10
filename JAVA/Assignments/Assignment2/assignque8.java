public class assignque8 {
    public static void main(String[] args) {
       
        byte b= 10;
        short s = 32000;
        int i = 100000;
        long l = 100000000L;
        float f = 45.67f;
        double d = 12345.6789;
        char c = 'A';
        boolean bo = true;

       
        System.out.println("Using toString() method of wrapper class:");
        System.out.println("Byte to String: " + Byte.toString(b));
        System.out.println("Short to String: " + Short.toString(s));
        System.out.println("Int to String: " + Integer.toString(i));
        System.out.println("Long to String: " + Long.toString(l));
        System.out.println("Float to String: " + Float.toString(f));
        System.out.println("Double to String: " + Double.toString(d));
        System.out.println("Char to String: " + Character.toString(c));
        System.out.println("Boolean to String: " + Boolean.toString(bo));

       
        System.out.println("\nUsing String.valueOf() method:");
        System.out.println( String.valueOf(b));
        System.out.println( String.valueOf(s));
        System.out.println( String.valueOf(i));
        System.out.println( String.valueOf(l));
        System.out.println( String.valueOf(f));
        System.out.println( String.valueOf(d));
        System.out.printl ( String.valueOf(c));
        System.out.println( String.valueOf(bo));
    }
}
