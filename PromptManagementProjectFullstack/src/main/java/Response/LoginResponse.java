package Response;

import lombok.Data;

@Data
public class LoginResponse {
	
	private String message;
	private boolean status;
	
	
	public LoginResponse() {
		super();
	}
	
	public LoginResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
}
