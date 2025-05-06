package myPack1;

public class Test extends Thread{
	
//	public void run() {
//		for(int j = 0; j<3; j++) {
//			printmsg();	
//		}
//	}
//	
//	public void printmsg() {
//		Thread t = Thread.currentThread();
//		String name = t.getName();
//		System.out.println("thread name : "+name);
//	}
//	
	public static void main(String args[]) {
//		int age = 25;
//		try {
//			CheckAge(age);
//		} catch (MyException e) {
//			System.out.println("Exception occered !!");
//			e.printStackTrace();
//		}
		
//		List<Integer> list = Arrays.asList(2,5,4,1,7,9);
//		//List<Integer> collect = list.stream().map(x -> x*x).collect(Collectors.toList());
//		List<Integer> collect = list.stream().filter(x -> x %2==0).collect(Collectors.toList());
//		System.out.println("sum of  List : "+collect);
		
		Thread thread = currentThread();
		Thread th = new Thread();
		th.setName("MyThread");
		
		System.out.println("Thread Name : "+thread.getName());
		System.out.println("Second Thread Name : "+th.getName());
		
	}
}
