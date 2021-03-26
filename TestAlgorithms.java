// Imports
import java.util.Random;
import java.util.Scanner;

public class TestAlgorithms {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); // Create new scanner
		// Prompt for data size
		System.out.println("Please select a size of data set to be generated: "
				+ "\n1: 10,000"
				+ "\n2: 50,000"
				+ "\n3: 100,000"
				+ "\n4: 500,000"
				+ "\n5: 1,000,000"
				+ "\n6: 5,000,000\n");
		String dataSelection = scan.next(); // Get user input
		// Check if user input a proper data set size
		while (!dataSelection.matches("1|2|3|4|5|6")) {
			System.out.println("That is not an option!\n"); // Tell user that they input an incorrect option
			// Prompt for data size
			System.out.println("Please select a size of data set to be generated: "
					+ "\n1: 10,000"
					+ "\n2: 50,000"
					+ "\n3: 100,000"
					+ "\n4: 500,000"
					+ "\n5: 1,000,000"
					+ "\n6: 5,000,000\n");
			dataSelection = scan.next(); // Get user selection
		}
		Random random = new Random(); // Create random object
		int[] numbers; // Declare numbers
		int[] tempNumbers; // Declare temporary numbers
		long startTime; // Declare start time
		long stopTime; // Declare stop time
		long time; // Declare time
		String sortSelection; // Declare sort selection
		switch (dataSelection) {
		case "1" :
			numbers = new int[10000]; // Create array of size n
			for (int i = 0; i < numbers.length; i++) { // Iterate through to assign elements
				numbers[i] = Math.abs(random.nextInt()); // Set elements to random integers
			}
			tempNumbers = numbers.clone(); // Create temporary array to be overwritten
			// Prompt for sorting method
			System.out.println("\nPlease select a sorting method: "
					+ "\n1: Insertion Sort"
					+ "\n2: Bubble Sort"
					+ "\n3: Merge Sort"
					+ "\n4: Quick Sort"
					+ "\n5: Radix Sort\n");
			sortSelection = scan.next(); // Get user input
			// Check if user input a proper sorting method
			while (!sortSelection.matches("1|2|3|4|5")) {
				System.out.println("That is not an option!\n"); // Tell user incorrect input
				// Prompt for sorting method
				System.out.println("\nPlease select a sorting method: "
						+ "\n1: Insertion Sort"
						+ "\n2: Bubble Sort"
						+ "\n3: Merge Sort"
						+ "\n4: Quick Sort"
						+ "\n5: Radix Sort\n");
				sortSelection = scan.next(); // Get user input
			}
			switch (sortSelection) {
			case "1" :
				startTime = System.nanoTime();// Start timer
				InsertionSort.insertionSort(tempNumbers); // Call insertion sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nInsertion sort time: " + + (double) time / 1000000000 + " seconds\n"); // Print the time of insertion sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "2" :
				startTime = System.nanoTime(); // Start timer
				BubbleSort.bubbleSort(tempNumbers); // Call bubble sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nBubble sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of bubble sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "3" :
				startTime = System.nanoTime(); // Start timer
				MergeSort.mergeSort(tempNumbers); // Call merge sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nMerge sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of merge sort
				tempNumbers = numbers.clone(); // Reset the temporary array
				break;
			case "4" :
				startTime = System.nanoTime(); // Start timer
				QuickSort.quickSort(tempNumbers); // Call quick sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nQuick sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of quick sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "5" :
				startTime = System.nanoTime(); // Start timer
				RadixSort.radixSort(tempNumbers); // Call radix sort method
				stopTime = System.nanoTime(); //stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nRadix sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of radix sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			}
			break;
		case "2" :
			numbers = new int[50000]; // Create array of size n
			for (int i = 0; i < numbers.length; i++) { // Iterate through to assign elements
				numbers[i] = Math.abs(random.nextInt()); // Set elements to random integers
			}
			tempNumbers = numbers.clone(); // Create temporary array to be overwritten
			// Prompt for sorting method
			System.out.println("\nPlease select a sorting method: "
					+ "\n1: Insertion Sort"
					+ "\n2: Bubble Sort"
					+ "\n3: Merge Sort"
					+ "\n4: Quick Sort"
					+ "\n5: Radix Sort\n");
			sortSelection = scan.next(); // Get user input
			// Check if user input a proper sorting method
			while (!sortSelection.matches("1|2|3|4|5")) {
				System.out.println("That is not an option!\n"); // Tell user incorrect input
				// Prompt for sorting method
				System.out.println("\nPlease select a sorting method: "
						+ "\n1: Insertion Sort"
						+ "\n2: Bubble Sort"
						+ "\n3: Merge Sort"
						+ "\n4: Quick Sort"
						+ "\n5: Radix Sort\n");
				sortSelection = scan.next(); // Get user input
			}
			switch (sortSelection) {
			case "1" :
				startTime = System.nanoTime();// Start timer
				InsertionSort.insertionSort(tempNumbers); // Call insertion sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nInsertion sort time: " + + (double) time / 1000000000 + " seconds\n"); // Print the time of insertion sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "2" :
				startTime = System.nanoTime(); // Start timer
				BubbleSort.bubbleSort(tempNumbers); // Call bubble sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nBubble sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of bubble sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "3" :
				startTime = System.nanoTime(); // Start timer
				MergeSort.mergeSort(tempNumbers); // Call merge sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nMerge sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of merge sort
				tempNumbers = numbers.clone(); // Reset the temporary array
				break;
			case "4" :
				startTime = System.nanoTime(); // Start timer
				QuickSort.quickSort(tempNumbers); // Call quick sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nQuick sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of quick sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "5" :
				startTime = System.nanoTime(); // Start timer
				RadixSort.radixSort(tempNumbers); // Call radix sort method
				stopTime = System.nanoTime(); //stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nRadix sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of radix sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			}
			break;
		case "3" :
			numbers = new int[100000]; // Create array of size n
			for (int i = 0; i < numbers.length; i++) { // Iterate through to assign elements
				numbers[i] = Math.abs(random.nextInt()); // Set elements to random integers
			}
			tempNumbers = numbers.clone(); // Create temporary array to be overwritten
			// Prompt for sorting method
			System.out.println("\nPlease select a sorting method: "
					+ "\n1: Insertion Sort"
					+ "\n2: Bubble Sort"
					+ "\n3: Merge Sort"
					+ "\n4: Quick Sort"
					+ "\n5: Radix Sort\n");
			sortSelection = scan.next(); // Get user input
			// Check if user input a proper sorting method
			while (!sortSelection.matches("1|2|3|4|5")) {
				System.out.println("That is not an option!\n"); // Tell user incorrect input
				// Prompt for sorting method
				System.out.println("\nPlease select a sorting method: "
						+ "\n1: Insertion Sort"
						+ "\n2: Bubble Sort"
						+ "\n3: Merge Sort"
						+ "\n4: Quick Sort"
						+ "\n5: Radix Sort\n");
				sortSelection = scan.next(); // Get user input
			}
			switch (sortSelection) {
			case "1" :
				startTime = System.nanoTime();// Start timer
				InsertionSort.insertionSort(tempNumbers); // Call insertion sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nInsertion sort time: " + + (double) time / 1000000000 + " seconds\n"); // Print the time of insertion sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "2" :
				startTime = System.nanoTime(); // Start timer
				BubbleSort.bubbleSort(tempNumbers); // Call bubble sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nBubble sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of bubble sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "3" :
				startTime = System.nanoTime(); // Start timer
				MergeSort.mergeSort(tempNumbers); // Call merge sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nMerge sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of merge sort
				tempNumbers = numbers.clone(); // Reset the temporary array
				break;
			case "4" :
				startTime = System.nanoTime(); // Start timer
				QuickSort.quickSort(tempNumbers); // Call quick sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nQuick sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of quick sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "5" :
				startTime = System.nanoTime(); // Start timer
				RadixSort.radixSort(tempNumbers); // Call radix sort method
				stopTime = System.nanoTime(); //stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nRadix sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of radix sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			}
			break;
		case "4" :
			numbers = new int[500000]; // Create array of size n
			for (int i = 0; i < numbers.length; i++) { // Iterate through to assign elements
				numbers[i] = Math.abs(random.nextInt()); // Set elements to random integers
			}
			tempNumbers = numbers.clone(); // Create temporary array to be overwritten
			// Prompt for sorting method
			System.out.println("\nPlease select a sorting method: "
					+ "\n1: Insertion Sort"
					+ "\n2: Bubble Sort"
					+ "\n3: Merge Sort"
					+ "\n4: Quick Sort"
					+ "\n5: Radix Sort\n");
			sortSelection = scan.next(); // Get user input
			// Check if user input a proper sorting method
			while (!sortSelection.matches("1|2|3|4|5")) {
				System.out.println("That is not an option!\n"); // Tell user incorrect input
				// Prompt for sorting method
				System.out.println("\nPlease select a sorting method: "
						+ "\n1: Insertion Sort"
						+ "\n2: Bubble Sort"
						+ "\n3: Merge Sort"
						+ "\n4: Quick Sort"
						+ "\n5: Radix Sort\n");
				sortSelection = scan.next(); // Get user input
			}
			switch (sortSelection) {
			case "1" :
				startTime = System.nanoTime();// Start timer
				InsertionSort.insertionSort(tempNumbers); // Call insertion sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nInsertion sort time: " + + (double) time / 1000000000 + " seconds\n"); // Print the time of insertion sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "2" :
				startTime = System.nanoTime(); // Start timer
				BubbleSort.bubbleSort(tempNumbers); // Call bubble sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nBubble sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of bubble sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "3" :
				startTime = System.nanoTime(); // Start timer
				MergeSort.mergeSort(tempNumbers); // Call merge sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nMerge sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of merge sort
				tempNumbers = numbers.clone(); // Reset the temporary array
				break;
			case "4" :
				startTime = System.nanoTime(); // Start timer
				QuickSort.quickSort(tempNumbers); // Call quick sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nQuick sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of quick sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "5" :
				startTime = System.nanoTime(); // Start timer
				RadixSort.radixSort(tempNumbers); // Call radix sort method
				stopTime = System.nanoTime(); //stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nRadix sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of radix sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			}
			break;
		case "5" :
			numbers = new int[1000000]; // Create array of size n
			for (int i = 0; i < numbers.length; i++) { // Iterate through to assign elements
				numbers[i] = Math.abs(random.nextInt()); // Set elements to random integers
			}
			tempNumbers = numbers.clone(); // Create temporary array to be overwritten
			// Prompt for sorting method
			System.out.println("\nPlease select a sorting method: "
					+ "\n1: Insertion Sort"
					+ "\n2: Bubble Sort"
					+ "\n3: Merge Sort"
					+ "\n4: Quick Sort"
					+ "\n5: Radix Sort\n");
			sortSelection = scan.next(); // Get user input
			// Check if user input a proper sorting method
			while (!sortSelection.matches("1|2|3|4|5")) {
				System.out.println("That is not an option!\n"); // Tell user incorrect input
				// Prompt for sorting method
				System.out.println("\nPlease select a sorting method: "
						+ "\n1: Insertion Sort"
						+ "\n2: Bubble Sort"
						+ "\n3: Merge Sort"
						+ "\n4: Quick Sort"
						+ "\n5: Radix Sort\n");
				sortSelection = scan.next(); // Get user input
			}
			switch (sortSelection) {
			case "1" :
				startTime = System.nanoTime();// Start timer
				InsertionSort.insertionSort(tempNumbers); // Call insertion sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nInsertion sort time: " + + (double) time / 1000000000 + " seconds\n"); // Print the time of insertion sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "2" :
				startTime = System.nanoTime(); // Start timer
				BubbleSort.bubbleSort(tempNumbers); // Call bubble sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nBubble sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of bubble sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "3" :
				startTime = System.nanoTime(); // Start timer
				MergeSort.mergeSort(tempNumbers); // Call merge sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nMerge sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of merge sort
				tempNumbers = numbers.clone(); // Reset the temporary array
				break;
			case "4" :
				startTime = System.nanoTime(); // Start timer
				QuickSort.quickSort(tempNumbers); // Call quick sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("Quick sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of quick sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "5" :
				startTime = System.nanoTime(); // Start timer
				RadixSort.radixSort(tempNumbers); // Call radix sort method
				stopTime = System.nanoTime(); //stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nRadix sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of radix sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			}
			break;
		case "6" :
			numbers = new int[5000000]; // Create array of size n
			for (int i = 0; i < numbers.length; i++) { // Iterate through to assign elements
				numbers[i] = Math.abs(random.nextInt()); // Set elements to random integers
			}
			tempNumbers = numbers.clone(); // Create temporary array to be overwritten
			// Prompt for sorting method
			System.out.println("\nPlease select a sorting method: "
					+ "\n1: Insertion Sort"
					+ "\n2: Bubble Sort"
					+ "\n3: Merge Sort"
					+ "\n4: Quick Sort"
					+ "\n5: Radix Sort\n");
			sortSelection = scan.next(); // Get user input
			// Check if user input a proper sorting method
			while (!sortSelection.matches("1|2|3|4|5")) {
				System.out.println("That is not an option!\n"); // Tell user incorrect input
				// Prompt for sorting method
				System.out.println("\nPlease select a sorting method: "
						+ "\n1: Insertion Sort"
						+ "\n2: Bubble Sort"
						+ "\n3: Merge Sort"
						+ "\n4: Quick Sort"
						+ "\n5: Radix Sort\n");
				sortSelection = scan.next(); // Get user input
			}
			switch (sortSelection) {
			case "1" :
				startTime = System.nanoTime();// Start timer
				InsertionSort.insertionSort(tempNumbers); // Call insertion sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nInsertion sort time: " + + (double) time / 1000000000 + " seconds\n"); // Print the time of insertion sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "2" :
				startTime = System.nanoTime(); // Start timer
				BubbleSort.bubbleSort(tempNumbers); // Call bubble sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nBubble sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of bubble sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "3" :
				startTime = System.nanoTime(); // Start timer
				MergeSort.mergeSort(tempNumbers); // Call merge sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nMerge sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of merge sort
				tempNumbers = numbers.clone(); // Reset the temporary array
				break;
			case "4" :
				startTime = System.nanoTime(); // Start timer
				QuickSort.quickSort(tempNumbers); // Call quick sort method
				stopTime = System.nanoTime(); // Stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nQuick sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of quick sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			case "5" :
				startTime = System.nanoTime(); // Start timer
				RadixSort.radixSort(tempNumbers); // Call radix sort method
				stopTime = System.nanoTime(); //stop timer
				time = stopTime - startTime; // Get the overall time
				System.out.println("\nRadix sort time: " + (double) time / 1000000000 + " seconds\n"); // Print the time of radix sort
				tempNumbers = numbers.clone(); // Reset temporary array
				break;
			}
			break;
		}
		scan.close(); // Close scanner
	}
}
