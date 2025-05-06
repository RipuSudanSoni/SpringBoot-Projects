package MultiThreading;

public class SecThread extends Thread{
	
	public void run() {
		for(int i=1; i<10; i++) {
			System.out.println("Thread 2 : "+i);
		}
	}
	

}
