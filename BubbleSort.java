public class BubbleSort {
   static void bubbleSort(int[] arr) {
      int n = arr.length;
      int temp = 0;

      for(int a = 0; a < n; a++) {
         for(int b=1; b < (n-a); b++) {
            if(arr[b-1] > arr[b]) {
               temp = arr[b-1];
               arr[b-1] = arr[b];
               arr[b] = temp;
            }
         }
      }
   }
   public static void main(String[] args) {
      int arr[] = { 2, 5, -2, 6, -3, 8, 0, -7, -9, 4 };
      System.out.println("Array Before Bubble Sort");

      for(int a = 0; a < arr.length; a++) {
         System.out.print(arr[a] + " ");
      }
      System.out.println();
      bubbleSort(arr);
      System.out.println("Array After Bubble Sort");

      for(int a = 0; a < arr.length; a++) {
         System.out.print(arr[a] + " ");
      }
   }
}