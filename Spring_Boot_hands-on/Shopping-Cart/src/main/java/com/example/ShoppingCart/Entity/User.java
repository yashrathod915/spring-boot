package com.example.ShoppingCart.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

// TODO: Auto-generated Javadoc
/**
 * The Class User.
 */
@Entity
public class User {
	
	/** The user id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int userId;
	
	/** The user name. */
	private String userName;
	
	/** The cart. */
	@OneToOne(mappedBy = "user")
	private Cart cart;

	/**
	 * Instantiates a new user.
	 */
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param userId the user id
	 * @param userName the user name
	 * @param cart the cart
	 */
	public User(int userId, String userName, Cart cart) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.cart = cart;
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

	/**
	 * Gets the cart.
	 *
	 * @return the cart
	 */
	public Cart getCart() {
		return cart;
	}

	/**
	 * Sets the cart.
	 *
	 * @param cart the new cart
	 */
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	
	
}
