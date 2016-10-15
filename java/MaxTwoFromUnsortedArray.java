package okta;

public class MaxTwoFromUnsortedArray {
	
	public static void findMaxTwo(int[] arr) {
		int firstMax = arr[0], secondMax = arr[0];
		for (int i= 1; i < arr.length; i++) {
			if (arr[i] > firstMax ) {
				secondMax = firstMax;
				firstMax = arr[i];
			}
		}
		System.out.println("FirstMax=" + firstMax + "secondMax=" + secondMax);
	}

	public static void main(String[] args) {
		int[] a = new int[]{5,1,8,2,6,3,9,45,67,0};
		findMaxTwo(a);
	}

}
