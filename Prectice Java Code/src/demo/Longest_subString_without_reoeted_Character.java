package demo;

import java.util.LinkedHashMap;
import java.util.Map;

public class Longest_subString_without_reoeted_Character {
	
	public static String findLongestStr(String str) {
		
		char ch[] = str.toCharArray();
		Map<Character, Integer> mp = new LinkedHashMap<>();
		int longestStrLen = 0;
		String longeString = null;

		for(int i=0; i<ch.length; i++) {
			
			if(!mp.containsKey(ch[i])) {
				mp.put(ch[i], i);
				
			} else {
				i = mp.get(ch[i]);
				mp.clear();
			}
			
			if(mp.size() > longestStrLen) {
				longestStrLen = mp.size();
				longeString = mp.keySet().toString();
				StringBuilder sb = new StringBuilder();
				for(Character c : mp.keySet()) {
					sb.append(c);
				}
				longeString = sb.toString();
			}
			
		}
	
		return longeString;
	}
	
	
	public static void main(String[] args) {
		String str = "Hyderabad";
		String result = findLongestStr(str);
		System.out.println("Longest String Length = "+result);
	
	}

}
