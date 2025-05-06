// WAP to return name startsWith 'A'  using predicate and Lambda.

package Java8Features.Lambda;

import java.util.function.Predicate;

public class PredicatesDemo1 {
	public static void main(String args[]) {
		String names[] = {"Anushka", "Anjali", "Deepika", "Chandani"};
		
		Predicate<String> p = name -> name.charAt(0) == 'A';
		
		for(String name : names) {
			if(p.test(name)) {
				System.out.println(name);
			}
		}
	}

}
