public class Arithmetic {
    public static void main(String[] args){
       // int x = 10+3;
       // int x = 10-3;
      //  int x = 10*3;
     // int x = 10/3; // here, the value is in whole number. bcz, java gives the whole no. as a result of two dividing whole numbers. but we use float or double to recieve the decimal or exact value.
      // float x = (float)10 / (float)3; // this gives us the exact results. 
     //  int x  = 10 % 3;
       // System.out.println(x);

        // Increment and Decrement oprtators..........
        int y = 1;
       // ++y;
      //  y++; // same results. 
        int z = ++y; // here, results are different. 
    
        System.out.println(y);
        System.out.println(z);
      // .......Augmented Assignment Operators..................
      
      int a = 1; 
      a+= 2;
     // a-= 2;
    // a*= 2;
     // a/= 2;
      // a =  a + 2; // this is equivalent to above value. 
       System.out.println(a);
    }
}