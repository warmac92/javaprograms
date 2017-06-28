public class ArrayExample {

   public static void main(String[] args) {
      int[] myArray = {1, 2, 3, 4,5};

      // Print all the array elements
      for (int i = 0; i < myArray.length; i++) {
         System.out.println(myArray[i] + " ");
      }
     
      // Summing all elements
      int total = 0;
      for (int i = 0; i < myArray.length; i++) {
         total += myArray[i];
      }
      System.out.println("Total is " + total);
      
      // Finding the largest element
      int max = myArray[0];
      for (int i = 1; i < myArray.length; i++) {
         if (myArray[i] > max) max = myArray[i];
      }
      System.out.println("Max is " + max);  
   }
}
