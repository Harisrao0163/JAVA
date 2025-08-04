import java.util.Arrays;

  //  public class Arrayss
  //   {
  //   public static void main(String[] args){ 
  //       int[] numbers = {1,2,3,6,9,8,4,5};
  //       System.out.println(numbers.length);
  //      Arrays.sort(numbers); // this will sortout all the numbers. 
        
  //       System.out.println(Arrays.toString(numbers));
  //     }}
    // ...................Multidimentional Array.....................
    public class Arrayss {
    public static void main(String[] args){
     int[][] numbers = new int[2][3];
     numbers[0][0] = 10;
     System.out.println(Arrays.deepToString(numbers)); // but if add one more digit then we use shortcut. see below
      int [][] matrix = {{1,2,3,4},{5,6,7,8}};
      System.out.println(Arrays.deepToString(matrix));
    }
  } 
        