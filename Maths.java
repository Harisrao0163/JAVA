public class Maths {
    public static void main (String[] args){
        int result = Math.round(1.1F);
        System.out.println(result);

        int results = (int)Math.ceil(1.1F); // here, we explicitly cast this by adding "(int)" 
        System.out.println(results);

        int resulti = (int)Math.floor(1.1F);
        System.out.println(resulti);

        int resulta = Math.max(1, 2); // returns the greater value
       // int resulta = Math.min(1, 2); // returns the smaller value
         System.out.println(resulta);

      double j = Math.random() * 50; // it generates the random value b/w 0-50
      System.out.println(j);

       double k = Math.round(Math.random() * 50); // if we don't want digits after decimal so, this method is used
        System.out.println(k);
        
        int o = (int)Math.random() * 50; // this gives 0 every time bcz, integer can't display the value in decimal
        System.out.println(o);

        double p = (int)(Math.random() * 50); // now , by wraping this entire section by parentheses we can solve this issue
         System.out.println(p);
    }
    
}
