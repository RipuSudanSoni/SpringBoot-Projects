package Multithreading2;

public class Main {
	public static void main(String[] args) {
		
		MyFirstThread ft = new MyFirstThread();
		Thread t1 = new Thread(ft);
		
		t1.start();
		
		MySecondThread sThread = new MySecondThread();
		sThread.start();
	}

}
