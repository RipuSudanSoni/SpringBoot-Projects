package MyComprableAndCompratorPack;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MYComprable {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		list.add(new Student(101,"Rameshwar", 25));
		list.add(new Student(106,"Aman", 40));
		list.add(new Student(120,"Zara", 35));
		list.add(new Student(103,"Narendra", 67));

		System.out.println("before sorting List : "+list);
		//Collections.sort(list);        // this is for comprable
		
		//Collections.sort(list, new NameComprator());    // this is using comprator for sorting by name
		Collections.sort(list, new AgeComprator());
		System.out.println("after sorting List : "+list);
	}

}
