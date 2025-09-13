public class Main {
    public static void main(String[] args) {
   //************************ SWITCH STATEMENT ************************ */
   String role = "moderator";

  switch (role) {
    case "admin":
       System.out.println("welcome admin");
          break;
          case "moderator":
             System.out.println("welcome moderator");
                break;
                default:
                   System.out.println("welcome guest");

  }
 //************************ IF ELSE STATEMENT ************************** */

   if (role == "admin")
   System.out.println("welcome admin");
   else if (role  == "moderator")
   System.out.println("welcome moderator");
   else
   System.out.println("welcome guest");

    }
}