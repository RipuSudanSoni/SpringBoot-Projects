// WAP to create a lambda and call them.    (lambda is invoked by functional Interface)

package Java8Features.Lambda;

@FunctionalInterface
interface MyInterfaceOne {
	
	public void m1();
}

public class MyAppOne {
	
	public static void main(String args[]) {
		MyInterfaceOne mio = () -> System.out.println("Mi method is called..");
		mio.m1();
	}
}
