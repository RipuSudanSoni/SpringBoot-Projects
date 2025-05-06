package mytest;
import java.util.*;
import java.util.stream.*;

public class MyStream {
	public static void main(String args[]) {
		
//		String arr[] = {"banana", "pea", "Peanut", "pizza", "apple", "dosa"};
//		List<String> list = Arrays.asList(arr);
		
	//	List<String> list = Arrays.asList("banana", "pea", "Peanut", "pizza", "apple", "dosa");
	//	List<String> filterdeList = list.stream().filter(e -> e.startsWith("P") || e.startsWith("p")).collect((Collectors.toList()));
	//	list.stream().filter(e -> e.startsWith("P") || e.startsWith("p")).forEach(System.out::println);
	//  System.out.println("Elements Strart with 'P' = "+filterdeList);
	
		
		List<Employee> list = new ArrayList<>();
		list.add(new Employee(101,"Aman",55000.0));
		list.add(new Employee(102,"Modi",15000.0));
		list.add(new Employee(103,"Dhiraj",35000.0));
		list.add(new Employee(104,"John",25000.0));
		
		Double avj = list.stream().mapToDouble(x -> x.getSal()).average().getAsDouble();
		System.out.println("Average of this list item = "+avj);
		
	}
}
