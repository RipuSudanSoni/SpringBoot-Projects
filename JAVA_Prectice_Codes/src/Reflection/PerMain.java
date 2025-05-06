package Reflection;
import java.lang.reflect.Constructor;
import java.lang.reflect.*;

public class PerMain {
	public static void main(String[] args) throws ClassNotFoundException {
		
		Class c = Class.forName("Reflection.Person");
		String str = c.getName();
		System.out.println("Class Name :- "+str);
		
		Constructor<Person>[] constructors = c.getConstructors();
		for(Constructor<Person> con : constructors) {
			System.out.println(con);
		}
		
		Method methods[] = c.getMethods();
		for(Method met: methods) {
			System.out.println(met);
		}
	}
}
