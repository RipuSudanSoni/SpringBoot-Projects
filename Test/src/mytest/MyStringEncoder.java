package mytest;
import java.net.URLEncoder;
import java.net.URL;


public class MyStringEncoder {
	
	public static void main(String[] args) {
		//"mobile & accessories";  "* - _ ."
	    String originalString = "mobile & accessories";
	    String encodedString = "";

	    try {
	      encodedString = URLEncoder.encode(originalString, "UTF-8").replace("+", " ");
	      URLEncoder.encode(originalString, encodedString)
	    //  encodedString = URLEncoder.encode(originalString, "UTF-8").replace("+", "%20");
	    } catch (Exception e) {
	      
	    }

	    System.out.println("Original string: " + originalString);
	    System.out.println("Encoded string: " + encodedString);
	  }

}
