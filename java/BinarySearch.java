package search;

public class Search {
	
	public static boolean binarySearch(int[] a, int target) {
		int low = 0;
		int high = a.length;
		while(low <= high) {
			int mid = (low + high) / 2;
			if (target == a[mid])
				return true;
			else if (target < a[mid])
				high = mid -1;
			else
				low = mid + 1;
		}
		return false;
	}

	public static void main(String[] args) {
		//input is already sorted.
		int[] a = new int[] {1, 4, 7, 9, 35, 67, 233, 999};
		boolean b = binarySearch(a, 35);
		System.out.println(b);
		System.out.println(binarySearch(a, 44));
	}

}
