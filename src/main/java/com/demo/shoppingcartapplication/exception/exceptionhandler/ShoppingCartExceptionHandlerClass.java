package com.demo.shoppingcartapplication.exception.exceptionhandler;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.demo.shoppingcartapplication.exception.ApplicationException;

@RestControllerAdvice
public class ShoppingCartExceptionHandlerClass {

	@ExceptionHandler(ApplicationException.class)
	public ResponseEntity<Object> handleNotFoundException(ApplicationException ex, HttpServletRequest request) {

		ResponseMsg responseMsg = new ResponseMsg();
		responseMsg.setMessage(ex.getMessage());
		responseMsg.setStatus("Error");
		return new ResponseEntity<Object>(responseMsg, HttpStatus.BAD_REQUEST);
	}

}
