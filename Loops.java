import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //************************* FOR LOOPS ******************* */

     for (int i = 6; i >= 0; i--){

      System.out.println("Hello " + i);
     // System.out.println("world " + i); // we use curly braces to group multiple statements
     }
   
     //************************* WHILE LOOPS ********************* */

     Scanner scanner = new Scanner(System.in);
     String input = "";

        while (true) {
            System.out.print("input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("pass"))
                continue; // we use continue to skip the current iteration and move to the next one
            if (input.equals("quit"))
                break;  // we use break instead of ! this mark which means not equal
            System.out.println(input);
        }
        
        //******************* DO..WHILE LOOPS ************************** */
       do {
         System.out.print("input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
       } while (!input.equals("quit"));

       //********************** FOR-EACH LOOP ************************* */

       String[] fruits = {"apple" , "mango" , "orange"};

       for(int i = 0; i < fruits.length; i++) // this is the traditional for loop and a method to express the for each loop
         System.out.println(fruits[i]);

    for(String fruit : fruits) // this is another method...
    System.out.println(fruit);

    }
}