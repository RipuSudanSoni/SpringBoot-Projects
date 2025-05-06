//1.write a java program to count the occurrences of each character in string


package test;
import java.util.*;

public class CharCount {
	public static void main(String[] args) {
		String str = "occurrences";
		Map<Character, Integer> charCount = new HashMap<>();
		for(char c : str.toCharArray()) {
			if(charCount.containsKey(c)) {
				charCount.put(c, charCount.get(c) + 1);
			} else {
				charCount.put(c, 1);
			}
		}
		System.out.println(charCount);
	}

}
