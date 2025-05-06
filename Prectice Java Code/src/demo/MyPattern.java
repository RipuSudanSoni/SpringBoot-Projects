package demo;
//
//7
//8 7
//7 8 7
//8 7 8 7


public class MyPattern {
	
	public static void main(String[] args) {
		int n = 10;
		int val = 7;
		for(int i=1; i<=n; i++) {
			if(i % 2 != 0) {
				val = 7;
			} else {
				val = 8;
			}
			for(int j=1; j<= i; j++) {
				System.out.print(val);

				if(val == 8) {
					val--;
				} else {
					val++;
				}
			}
			System.out.println();
		}
	}

}
