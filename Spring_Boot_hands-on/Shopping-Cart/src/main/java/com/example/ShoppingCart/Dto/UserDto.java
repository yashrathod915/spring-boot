package com.example.ShoppingCart.Dto;

// TODO: Auto-generated Javadoc
/**
 * The Class UserDto.
 */
public class UserDto {

	/** The user id. */
	private int userId;
	
	/** The user name. */
	private String userName;
	
	/**
	 * Instantiates a new user dto.
	 */
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new user dto.
	 *
	 * @param userId the user id
	 * @param userName the user name
	 */
	public UserDto(int userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}
	
	/**
	 * Gets the user id.
	 *
	 * @return the user id
	 */
	public int getUserId() {
		return userId;
	}
	
	/**
	 * Sets the user id.
	 *
	 * @param userId the new user id
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	/**
	 * Gets the user name.
	 *
	 * @return the user name
	 */
	public String getUserName() {
		return userName;
	}
	
	/**
	 * Sets the user name.
	 *
	 * @param userName the new user name
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
