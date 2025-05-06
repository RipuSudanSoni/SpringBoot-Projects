package MySingletonDesignePatternPack;

final public class SingletonClassExample {
	
	// at the time of class loading because this is static.
//	static SingletonClassExample s = new SingletonClassExample(); //Eager Initialization
	
	static SingletonClassExample s = null; // Lazy Initialization
	
	
	//static SingletonClassExample s = null;

	private SingletonClassExample() {
		
	}
	
	public static SingletonClassExample getInstance() {
		if(s == null) {
			s = new SingletonClassExample();
		}
		return s;
	}
}
