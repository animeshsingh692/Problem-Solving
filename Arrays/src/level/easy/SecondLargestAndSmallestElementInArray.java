package level.easy;

public class SecondLargestAndSmallestElementInArray {
	public static int[] getSecondOrderElements(int n, int []a) {
        // Brute Force Approach
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for(int i=0; i<n; i++){
            //Second Largest
            if(a[i] > largest){
                secondLargest = largest;
                largest = a[i];
            }else if(a[i] > secondLargest && a[i] != largest){
                secondLargest = a[i];
            }
            
            // Second Smallest
            if(a[i] < smallest){
                secondSmallest = smallest;
                smallest = a[i];
            }else if(a[i] < secondSmallest && a[i] != smallest){
                secondSmallest = a[i];
            }
        }
        if(secondLargest == Integer.MIN_VALUE){
            secondLargest = -1;
        }
        if(secondSmallest == Integer.MAX_VALUE){
            secondSmallest = -1;
        }
        return new int[]{secondLargest, secondSmallest};
    }
	public static void main(String[] args) {
		int arr[] = {3, 4, 5, 2};
		int n = arr.length;
		int[] result = getSecondOrderElements(n, arr);
		System.out.println("[" +result[0]+ "," +result[1]+ "]");
	}

}
