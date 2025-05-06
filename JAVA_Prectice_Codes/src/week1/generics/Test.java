package week1.generics;

import java.util.*;
import java.util.stream.*;
public class Test
{
	public static void main(String[] args) {
	    List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		
		List<Integer> list2 = list.stream().map(x -> x*x).collect(Collectors.toList());
		System.out.println("Previous lis :- "+list);
		System.out.println("final list :- "+list2);
	}
}