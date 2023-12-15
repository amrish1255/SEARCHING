package Searching;

public class linear_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// binary search
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
		int item = 5;
		Binary_search(arr, item);
		System.out.println(Binary_search(arr, item)); 

	}

	public static int Binary_search(int[] arr, int item) {

		int str = 0;
		int end = arr.length - 1;
		while (str <= end) {
			int mid = (str + end) / 2;
			if (arr[mid] == item) {
				return mid;
			}
			if(arr[mid]<item )
			{
				str=mid+1;
			}else {
				end=mid-1;
			}

		}
		return -1;
	}
}
