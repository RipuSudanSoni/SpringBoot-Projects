package DSA;

public class BinarySearch {
	
	public static int useBinarySerach(int arr[], int val) {
		
		int start = 0;
		int end = arr.length - 1;
		int mid = 0;
		
		while(start <= end) {
			mid = start + (end - start) / 2;
			if(arr[mid] == val) {
				return mid;
			} else if(arr[mid] > val) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,4,6,8,12,15,30,45,66,100};
		int targetVal = 66;
		
		int indx = useBinarySerach(arr, targetVal);
		
		if(indx != -1) {
			System.out.println("find target Value at index : "+indx);
		} else {
			System.out.println("Trget Value Not found !!");
		}
		
	}
	
	

}
