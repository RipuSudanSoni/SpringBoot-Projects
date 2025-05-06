package MultiThreading;

public class MyThread {
	public static void main(String[] args) {
		
		FirstThread ft = new FirstThread();
		SecThread sc = new SecThread();
		ft.start();
		try {
			ft.wait(200);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.start();
		try {
			sc.wait(250);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
