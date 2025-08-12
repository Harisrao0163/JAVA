public class casting {
    public static void main(String[] args){
         // Implicit casting 
          // they will automatically converted to next e.g: byte>short>int>long
        short x = 1;
        int y = x + 2;
        System.out.println(y);

        double hello = 1.1;
        double hi = hello + 2;
        System.out.println(hi); // used to show the values in decimal

        // Explicit casting

     double w = 1.1;
        int e = (int)w + 2;
        System.out.println(e);

        // Sring to Number conversion

        String d = "1.1";
       
         //int u = Integer.parseInt(d) + 5;
        // e.g:
         // int u = Byte.parseByte(d) + 5;
           // int u = Short.parseShort(d) + 5;
           // int u = Long.parselong(d) + 5;
            float u = Float.parseFloat(d) + 5;
        System.out.println(u);
    }
}