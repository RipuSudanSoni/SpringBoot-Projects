package DSA;

public class LinierSearch {

	public static int useLinearSerch(int[] arr, int val) {
		for(int i=0 ; i<arr.length; i++) {
			if(arr[i]== val) {
				return i;
			}
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {34,5,67,23,45,90,65,34,10};
		int targetVal = 45;
		
		int indx = useLinearSerch(arr, targetVal);
		if(indx != -1) {
			System.out.println("target value found at index : "+indx);
		} else {
			System.out.println("target value not found !!");
		}
	}
}
