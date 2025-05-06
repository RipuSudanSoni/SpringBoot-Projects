package exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.lcwd.user.service.payload.ApiResponse;


public class GlobalExceptionHandler {

	
	@ExceptionHandler(ResourseNotFoundException.class)
	public ResponseEntity<ApiResponse> handlerResourceNotFoundException(ResourseNotFoundException ex) {
		
		String message = ex.getMessage();
		ApiResponse response = ApiResponse.builder().message(message).success(true).status(HttpStatus.NOT_FOUND).build();
		
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}
}
