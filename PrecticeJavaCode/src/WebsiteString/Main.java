package WebsiteString;

public class Main {
    public static String combinesString(String a, String b) {
        return a + b + b + a;
    }

    public static void main(String[] args) {
        String a = "Hi";
        String b = "Bye";
        String result = combinesString(a, b);
        System.out.println(result);
    }
}
