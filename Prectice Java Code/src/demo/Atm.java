package demo;
import java.util.*;

class InsufficentBalanceException extends Exception {
	
	public InsufficentBalanceException(String msg) {
		super(msg);
	}
}

public class Atm {
	
	public static void checkBalence(int totalAmount) {
		System.out.println("Total Balance = "+totalAmount);
	}
	
	public static void Withdraw(int totalAmount) throws InsufficentBalanceException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter Amount.");
		int amount = sc.nextInt();
		if(amount > totalAmount) {
			throw new InsufficentBalanceException("Insufficent Balance !<<>>!!!!");
		} else {
			System.out.println("Amount Dedusted = "+amount);
			System.out.println("Remaining Balancc = "+(totalAmount - amount));
		}
	}
	
	
	public static void main(String[] args) {
		int totalAmount = 1000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Choice :- \n 1. Check Balance \n 2. Withdraw");
		int choice = sc.nextInt();
		
		switch (choice) {
			case 1: {
				checkBalence(totalAmount);
				break;
			} case 2: {
				try {
					Withdraw(totalAmount);
				} catch(Exception e) {
					System.out.println("Exception Occured :"+e);
				}
				break;
			}
		}			
		
	}
}
