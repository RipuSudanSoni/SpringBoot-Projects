public class Main {
    public static void main(String[] args) {
        String str = "Hello, World!";
        
        // charAt(int index) - Returns the character at the specified index
        char character = str.charAt(4);
        System.out.println("Character at index 4: " + character);
        
        // length() - Returns the length of the string
        int length = str.length();
        System.out.println("Length of the string: " + length);
        
        // substring(int beginIndex) - Returns a substring from the specified beginIndex to the end of the string
        String substring1 = str.substring(7);
        System.out.println("Substring from index 7 to end: " + substring1);
        
        // substring(int beginIndex, int endIndex) - Returns a substring from the specified beginIndex to endIndex-1
        String substring2 = str.substring(7, 12);
        System.out.println("Substring from index 7 to 11: " + substring2);
        
        // indexOf(String str) - Returns the index of the first occurrence of the specified string
        int index = str.indexOf("World");
        System.out.println("Index of 'World': " + index);
    }
}
