public class Sequence {
    public static void main(String[] args){
      String message = "Hello Haris";

        System.out.println(message);
      
       String coder = "Hello \"Haris\""; // this method is used to express special word of our string message in quotes. "By putting Backslash Double quote before and after the word." 
        
              System.out.println(coder);

          // (c:\window\...) this is the message. 
          String window = "c:\\window\\..."; // here, we put one more backslash on both sides to remove the error bcz, backslash is already present in our string msg which we have to show in terminal ,
          // so in this case we can't use double quotes, we will use backslash to remove the error and to show our message . 

          System.out.println(window);

          // (Backslash N) this is another way to add a line to our string message. 
            String windows = "c:\nwindows\\...";
            System.out.println(windows);
          
          // (Backslash t) this is another way to add a new tab to our string message. 
          String project = "c:\tproject\\...";
            System.out.println(project);

    }
    }