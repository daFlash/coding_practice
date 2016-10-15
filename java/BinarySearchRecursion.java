package search;

public class BinarySearchRecursion {
	
    public static boolean recursiveBinarySearch(int[] sortedArray, int start, int end, int key) {
        
        if (start <= end) {
            int mid = (start + end) /2;  
            if (key < sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, start, mid - 1, key);
                 
            } else if (key > sortedArray[mid]) {
                return recursiveBinarySearch(sortedArray, mid + 1, end , key);
                 
            } else {
                return true;   
            }
        }
        return false;  
    }
 
    public static void main(String[] args) {
         
        int[] arr1 = {2,45,234,567,876,900,976,999};
        boolean index = recursiveBinarySearch(arr1,0,arr1.length - 1,45);
        System.out.println(index);
        index = recursiveBinarySearch(arr1,0,arr1.length - 1,999);
        System.out.println(index);
        index = recursiveBinarySearch(arr1,0,arr1.length - 1,5);
        System.out.println(index);
    }

}
