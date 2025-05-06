package MyStrms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Emp> list = Arrays.asList(new Emp(1,"Ripu","GKP",35000), new Emp(2,"Aman","Chennai",45000),
				new Emp(3,"Rohit","Banglore",25000), new Emp(4,"Golu","Hyd",55000), new Emp(5,"Jayant","Patna",34000));
		
		List<Emp> filteredEmp = list.stream().filter(e -> e.getSal() > 30000).collect(Collectors.toList());
		for(Emp emp : filteredEmp) {
			System.out.println(emp);
			//System.err.println(emp);
		}
	}

}
