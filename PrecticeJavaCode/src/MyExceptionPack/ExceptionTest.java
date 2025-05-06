package MyExceptionPack;

class MyCustomException extends Exception {
	
	public MyCustomException() {
		super();
	}
	
	public MyCustomException(String msg) {
		super(msg);
	}
}


public class ExceptionTest extends MyCustomException{
	
	public static void main(String args[]) throws MyCustomException {
		int age = 26;
		if(age >= 18) {
			System.out.println("you  are valid for vote !!");
		}
		else {
			throw new MyCustomException("you are not valid for vote, this is Exception message !!");
		}
		
	}
}
