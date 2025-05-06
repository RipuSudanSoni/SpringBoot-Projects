package demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.*;

//import.java.util.*;
public class FrequencyOfWords {
	public static void main(String[] args) {
		String str = "Java is fun, and learning Java is great";
		String strArray[] = str.split(" ");
		System.out.println("String array = "+Arrays.toString(strArray));
		
		Map<String, Long> mpMap = Arrays.asList(strArray).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println("frequency of String = "+mpMap);
		
//		HashMap<String, Integer> hm = new HashMap<>();
//		
//		for(int i=0; i< strArray.length; i++) {
//			if(hm.containsKey(strArray[i])) {
//				hm.put(strArray[i], hm.get(strArray[i]) + 1);
//			} else {
//				hm.put(strArray[i], 1);
//			}
//		}
//		
//		for(Map.Entry<String, Integer> mp : hm.entrySet()) {
//			System.out.println(mp.getKey()+" : "+mp.getValue());
//		}
		
//		System.out.println("frequency of String = "+hm);
	}

}
