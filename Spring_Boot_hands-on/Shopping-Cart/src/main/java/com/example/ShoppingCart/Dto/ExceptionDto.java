package com.example.ShoppingCart.Dto;

// TODO: Auto-generated Javadoc
/**
 * The Class ExceptionDto.
 */
public class ExceptionDto {
	
	/** The message. */
	private String message;
	
	/**
	 * Instantiates a new exception dto.
	 */
	public ExceptionDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new exception dto.
	 *
	 * @param message the message
	 * @param cause the cause
	 */
	public ExceptionDto(String message, Throwable cause) {
		super();
		this.message = message;
	}
	
	/**
	 * Instantiates a new exception dto.
	 *
	 * @param message the message
	 */
	public ExceptionDto(String message) {
		this.message=message;
	}
	
	/**
	 * Gets the message.
	 *
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}
	
	/**
	 * Sets the message.
	 *
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}


	
}
