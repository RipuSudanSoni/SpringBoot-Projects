package SingletonDesignePattern;

public class DCSingletonMain {
	
	public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();

        singleton.showMessage();
    }

}
