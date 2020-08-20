package com.example.ShoppingCart.Controller.Handler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.ShoppingCart.Dto.ExceptionDto;
import com.example.ShoppingCart.Exception.ShoppingCartException;

// TODO: Auto-generated Javadoc
/**
 * The Class ShoppingCartExceptionHandler.
 */
@RestControllerAdvice
public class ShoppingCartExceptionHandler {
	
	/**
	 * Admin exception handler.
	 *
	 * @param e the e
	 * @param cause the cause
	 * @return the response entity
	 */
	@ExceptionHandler(ShoppingCartException.class)
	public ResponseEntity<ExceptionDto> adminExceptionHandler(ShoppingCartException e, Throwable cause){
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(new ExceptionDto(e.getMessage()));
	}


}
