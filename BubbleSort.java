// Implementation available from lecture
public class BubbleSort {
  /** Bubble sort method */
  public static void bubbleSort(int[] list) {
    boolean needNextPass = true;
    
    for (int k = 1; k < list.length && needNextPass; k++) {
      // Array may be sorted and next pass not needed
      needNextPass = false;
      for (int i = 0; i < list.length - k; i++) {
        if (list[i] > list[i + 1]) {
          // Swap list[i] with list[i + 1]
          int temp = list[i];
          list[i] = list[i + 1];
          list[i + 1] = temp;
          
          needNextPass = true; // Next pass still needed
        }
      }
    }
  }
  
// Method to print array
 static void print(int[] list) 
 { 
 	int size = list.length;
     for (int i=0; i< size; i++) 
         System.out.print(list[i]+" "); 
 }
}