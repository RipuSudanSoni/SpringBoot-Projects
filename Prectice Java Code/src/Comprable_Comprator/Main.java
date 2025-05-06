package Comprable_Comprator;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		List<Emp>empList = new ArrayList<>();
//		Emp epEmp = new Emp(101, "Sohan", 28);
		empList.add(new Emp(101, "Mohan", 28));
		empList.add(new Emp(121, "Rohit", 19));
		empList.add(new Emp(151, "Golu", 20));
		empList.add(new Emp(10, "Radhey", 38));
//		System.out.println("Emp Object = "+epEmp.toString());
		System.out.println("Emp List = "+empList);
//		Collections.sort(empList);
//		Collections.sort(empList, new IdComprator());
		
		Collections.sort(empList, new nameComprator());
		System.out.println("Sorted Emp List = "+empList);
	}

}
