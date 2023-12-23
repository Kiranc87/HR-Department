package org.jsp.HR.Department.Exception;


import org.jsp.HR.Department.Helper.ResponseStructure;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class Exceptionhandler {
	@ExceptionHandler(value =UserDefinedException.class )
	public ResponseEntity<ResponseStructure<String>> UserDefinedException(UserDefinedException e){
		ResponseStructure<String> responseStructure = new ResponseStructure<String>() ;
		responseStructure.setStatus(HttpStatus.NOT_FOUND.value());
		responseStructure.setMessage("There is some exception");
		responseStructure.setData(e.toString());
		
		return new ResponseEntity<ResponseStructure<String>>(responseStructure,HttpStatus.NOT_FOUND);
	}
}
