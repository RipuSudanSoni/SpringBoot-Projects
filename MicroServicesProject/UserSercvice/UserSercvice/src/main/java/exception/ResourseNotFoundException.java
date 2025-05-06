package exception;

public class ResourseNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ResourseNotFoundException() {
		super("Resourse Not found");
	}
	
	public ResourseNotFoundException(String msg) {
		super(msg);
	}

}
