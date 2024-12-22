package level.easy;

public class LargestElementInArray {
	
	static int largestElement(int[] arr, int n) {
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(largest < arr[i]){
                largest = arr[i];
            }
        }
        return largest;
    }

	public static void main(String[] args) {
		int arr[] = {4, 7, 8, 6, 7, 6};
		int n = arr.length;
		System.out.println(largestElement(arr, n));
	}

}
