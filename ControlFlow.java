public class Main {
    public static void main(String[] args) {
        // *******************COMPARISON OPERATORS*********************
        int x = 10;
        int y = 20;
        int sum = x + y;
        System.out.println(sum); 
       System.out.println(x == y);
       System.out.println(x != y);

       // *******************LOGICAL OPERATORS*********************
       int temperature = 22;
       boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm);
           
      // boolean hasHighIncome = true;
       boolean hasGoodCredit = true; // yhan sy hm conditions ko set krty hn 
       boolean hasCriminalRecord = false;    
       //boolean isEligible = (hasHighIncome && hasGoodCredit) && !hasCriminalRecord;// & this means And || this means Or ! this means Not...
       
       //System.out.println(isEligible); 
       
       //******************** IF STATEMENT **************************
        int temp = 22;
        if (temp > 30){
            System.out.println("it is a hot day");
            System.out.println("Drink water");
        } else if (temp > 20) {
            System.out.println("it's a nice day");
        }else {
            System.out.println("it's cold");
        }
        //****************** SIMPLIFYING IF STATEMENT**************** */
        int income = 120_000;
       // boolean hasHighIncome;
      //  if (income > 100_000)
          //  hasHighIncome = true;
         //   else
          //  hasHighIncome = false;

       // System.out.println(hasHighIncome);
// this upper code can be simplified as:
            boolean hasHighIncome = (income > 100_000);
        System.out.println(hasHighIncome); 
    
    //************************** TERNARY OPErATOR *******************/
    int income1 = 120_000;
    String className = income1 > 100_000 ? "First" : "Economy"; // if condition is true then first value will be assigned otherwise second value will be assigned
    
    System.out.println(className); //this method is used bcz, string and boolean cannot be printed directly so we use ternary method
     }
}