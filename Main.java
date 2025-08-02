public class Main {
    public static void main(String[] args){
        String message = "  Hello World!"+ " what's Up  ";  // String is also a Reference type in JAVA....bcz, it also give same results as we type a messahe in print line method.

        System.out.println(message.endsWith("what's Up")); // "message.endsWith()" this tells us that,the last string message is corretly existing or not.

        System.out.println(message.startsWith("what's Up")); // same as above. this method gives us a Boolean value like true or false.

        System.out.println(message.length()); // .length method gives the actual no. of message.

        System.out.println(message.indexOf("o")); // this method tells  the actual postion of required word by Number.

        System.out.println(message.replace("!", "*"));  // this method has an ability to replace every single word of our message. here, target and replacement both are "Parameters" ,
        // and "!" mark and "*" asterisk are "Arguments" which we have give to them. also this method doesn't change our original string but gives us a new string. and the main reason is that in JAVA the Strings
        // are "immutable". so, no one change this. 

        System.out.println(message); // this is the proof of above statement. 

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());

        System.out.println(message.trim()); // it removes the "white spaces" from our string message. 

    }
}