package CustomAnotation;

public class DemoMain implements MessageInterface{
	
	@Override
	public void myMessage() {
		System.out.println("This Interface method for using @Override");
	}
	
	public static void main(String[] args) {
		
		MyAnnoImplClass ma = new MyAnnoImplClass();
		Class c = ma.getClass();
		System.out.println(c.getName());
		
		MyAnno an = (MyAnno)c.getAnnotation(MyAnno.class);
		System.out.println(an.myValue());
		System.out.println(an.name());
		System.out.println(an.city());
		
		DemoMain obj = new DemoMain();
		obj.myMessage();
	}

	
}
