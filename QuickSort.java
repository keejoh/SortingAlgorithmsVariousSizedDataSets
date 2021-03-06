// This implementation is from lecture and https://www.java2novice.com/java-sorting-algorithms/quick-sort/
public class QuickSort {
     
    private static int array[];
    private static int length;
 
    public static void quickSort(int[] inputArr) {
         
        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        array = inputArr;
        length = inputArr.length;
        sort(0, length - 1);
    }
 
    private static void sort(int lowerIndex, int higherIndex) {
         
        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which 
             * is greater then the pivot value, and also we will identify a number 
             * from right side which is less then the pivot value. Once the search 
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            sort(lowerIndex, j);
        if (i < higherIndex)
            sort(i, higherIndex);
    }
 
    private static void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    
 // Method to print array
    static void print(int[] list) 
    { 
    	int size = list.length;
        for (int i=0; i< size; i++) 
            System.out.print(list[i]+" "); 
    }
}