package demo;

public class Finf_Second_Largest_Number {
	public static void main(String[] args) {
		int arr[] = {45,67,32,45,39,88,10};
		int largest = Integer.MIN_VALUE;
		int secLar = Integer.MIN_VALUE;
		for(int x : arr) {
			if(x >= largest) {
				secLar = largest;
				largest = x;
			} else if( x >= secLar && x != largest) {
				secLar = x;
			}
		}
		System.out.println("Second largest val = "+secLar);
	}

}
