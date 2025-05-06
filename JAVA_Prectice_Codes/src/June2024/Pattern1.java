package June2024;

public class Pattern1 {
	public static void main(String args[]) {
		int n = 5;
		for(int i=1; i<=n; i++) {
			for(int j=i; j>=i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
	}
}
