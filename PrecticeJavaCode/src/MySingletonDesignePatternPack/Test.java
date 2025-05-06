package MySingletonDesignePatternPack;

public class Test {
	
	public static void main(String args[]) {
		
		SingletonClassExample obj1 = SingletonClassExample.getInstance();
		System.out.println(obj1.hashCode());
		
		SingletonClassExample obj2 = SingletonClassExample.getInstance();
		System.out.println(obj2.hashCode());
	}
}
