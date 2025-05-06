package Java8Features;

import java.util.Arrays;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class MyStream extends Emp{
	public static void main(String args[]) {
		
		List<Integer> list = Arrays.asList(4,7,5,2,10,89,7,34,10);
		
	//	list.stream().map(x -> x).distinct().forEach(e -> System.out.println(e));
		
		
//		int result = list.stream().mapToInt(e -> e).sum();
//		System.out.println("Sum of all Num = "+result);
		
//		List<String> listStr = Arrays.asList("America", "", "Israil", "India","","Japan");
//		List<String> listStr2 = listStr.stream().filter(x -> !x.isEmpty()).collect(Collectors.toList());
//		System.out.println("String list :- "+listStr);
//		System.out.println("Non Empty String list :- "+listStr2);

		
//----------------------------------------------------------------------------------------
		
		List<Emp> empList = Arrays.asList(new Emp(101, "Raju", 35, 250000), new Emp(102, "suman", 28, 80000),
											new Emp(103, "daman", 25, 20000), new Emp(104, "Suraj", 24, 56000),
											new Emp(105, "Radha", 38, 120000), new Emp(106, "Gokul", 32, 86000));
//		List<Double> sals = empList.stream().map(e -> e.getSal()).collect(Collectors.toList());
//		System.out.println(sals);
		
		DoubleSummaryStatistics statistics = empList.stream().mapToDouble(e -> e.getSal()).summaryStatistics();
		System.out.println(statistics.getAverage());
		
//		List<Emp> newList =  empList.stream().filter(x -> x.getAge() > 30 && x.getName().startsWith("R")).collect(Collectors.toList());
//		System.out.println(newList);
		
	}

}
