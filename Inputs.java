import java.util.Scanner;

public class Inputs {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
       // String Name = scanner.next();

     // String Name = scanner.nextLine(); // this method combines the tokkens. but if we add extra spaces then it will show these white spaces. So, to remove extra white space see below
    
      String Name = scanner.nextLine().trim(); // this method removes the extra white spaces
    
        System.out.println("You are " + Name);

    }
}
