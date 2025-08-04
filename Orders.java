public class Orders {
    public static void main(String[] args){
        int x = 10 + 3 * 2;  // multiplication and division has higher order than addition and subtraction. 

       int y = (10 + 3)* 2; // but parentheses has a top notch order, higher than *,/. 
       System.out.println(x);
        System.out.println(y);
    }
}
