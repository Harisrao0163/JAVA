import java.text.NumberFormat;

public class Number {
    public static void main (String[] args){
      NumberFormat percent = NumberFormat.getPercentInstance();
      String result = percent.format(0.2);
      System.out.println(result);

       
      String resulti = NumberFormat.getPercentInstance().format(0.1);
      System.out.println(resulti);

      NumberFormat currency = NumberFormat.getCurrencyInstance();
      String results = currency.format(123456.21);
      System.out.println(results);
    }
}