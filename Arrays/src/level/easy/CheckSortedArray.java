package level.easy;

public class CheckSortedArray {
	public static int isSorted(int n, int []a) {
        for(int i=1; i<n; i++){
            if(a[i] < a[i-1]) return 0;
        }
        return 1;
    }
	public static void main(String[] args) {
//		int arr[] = {4, 7, 8, 6, 7, 6};
		int[] arr = {1, 2, 3, 3, 6, 7, 7, 10};
		int n = arr.length;
		if(isSorted(n, arr) == 0) {
			System.out.println("No");
		}else {
			System.out.println("Yes");
		}
	}

}
