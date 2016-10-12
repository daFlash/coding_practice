package basic;

public class ArraysBasics {
	
	public static String getMinMax(int[] arr) {
		int len = arr.length;
		if (arr.length < 1 ) return "No elements in the array";
		int min = arr[0];
		int max = arr[0];
		for(int i = 0 ; i < arr.length; i++) {
			System.out.println("i is " + i);
			if (arr[i] > max) max = arr[i];
			if (arr[i] < min) min = arr[i];
		}
		return "The Min is" + min + "and the max is " + max;
	}
	
	public static int[] reverse1(int[] list) {
		int reversed[] = new int[list.length];
		for (int i=0, j=reversed.length - 1; i < list.length; i++, j--) {
			reversed[j] = list[i];
		}
		return reversed;
	}
	
	public static int[] reverse2(int[] list) {
		int result[] = new int[list.length];
		int j = 0;
		for (int i = list.length - 1; i >= 0; i--) {
			result[j] = list[i];
			j++;
		}
		return result;
	}
	
	public static void printArray(int[] toBePrinted) {
		for (int elements: toBePrinted) {
			System.out.println(elements);
		}
	}

	public static void main(String[] args) {
		int arr[];
		arr = new int[10];
		int len = arr.length;
		// System.out.println(len);
		
		// Accessing the array elements
		// System.out.println(arr[0]);
		// System.out.println(arr[5]);
		
		int[] secondArray = {1,2,3,4,5}; // Dynamically allocates memory to the array from the number of elements
		// System.out.println(secondArray[4]);
		// System.out.println(secondArray.length);
		
		char chars[];
		chars = new char[10];
		
		// System.out.println(chars.length);
		
		char chars2[] = {'a', 'b' , 'c'};
		// System.out.println(chars2.length);
		for (int i = 0; i < chars2.length; i++) {
			// System.out.println(chars2[i]);
		}
		
		
		// Print all elements in an array
		int[] a = {6,8,2,9,1};
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		// Sum all element in an array
		int sum = 0;
		for (int i = 0; i < a.length; i++ ) {
			sum = sum + a[i];
		}
		System.out.println("The Sum is "+ sum);
		
		// Max element in an array
		int max = a[0];
		int min = a[0];
		for(int i=0; i< a.length; i++) {
			if (a[i] > max) max = a[i];
			if (a[i] < min) min = a[i];
		}
		System.out.println("Min is " + min + "\nThe max is " + max);
		
		// Call the function to do the same
		System.out.println(getMinMax(new int[] {3, 7, 8 ,1, 0}));
		
		// For each loops traversing
		double[] myarray = {5.0, 7.0, 1.0, 3.0, 9.0};
		System.out.println("Printing using foreach");
		for (double elem: myarray) {
			System.out.println(elem);
		}
		
		printArray(reverse1(new int[] {1,2,3,4,5}));
		printArray(reverse2(new int[] {1,2,3,4,5}));
		
	}

}
