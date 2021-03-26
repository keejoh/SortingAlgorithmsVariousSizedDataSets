// Portion of implementation from https://www.geeksforgeeks.org/java-program-for-radix-sort/
import java.util.Arrays;

public class RadixSort {
	// Main method for sorting array with radix sort
	public static void radixSort(int[] list) {
		int size = list.length;
		int max = getMax(list, size); // Find maximum number to know how many digits
		for (int exp = 1; max/exp > 0; exp *= 10) { // Do counting sort for ever digit
			countSort(list, size, exp);
		}
	}
	
	// Method to get maximum value in array
	public static int getMax(int[] list, int size) {
		int max = list[0];
		for (int i = 1; i < size; i++) {
			if (list[i] > max) {
				max = list[i];
			}
		}
		return max;
	}
	
	// Method to do counting sort for array according to digit of exp
	public static void countSort(int[] list, int size, int exp) {
		int[] output = new int[size]; // Output array
		int i;
		int count[] = new int[10];
		Arrays.fill(count,0);
		for (i = 0; i < size; i++) { // Stores count of occurrences in count array
			count[(list[i]/exp)%10]++;
		}
		for (i = 1; i < 10; i++) { // Change element i in count to actual position of digit in output array
			count[i] += count[i - 1];
		}
		for (i = size - 1; i >= 0; i--) { // Build output array
			output[count[(list[i]/exp)%10] - 1] = list[i];
			count[(list[i]/exp)%10]--;
		}
		for (i = 0; i < size; i++) { // Copy the output array to list so list has sorted numbers
			list[i] = output[i];
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
