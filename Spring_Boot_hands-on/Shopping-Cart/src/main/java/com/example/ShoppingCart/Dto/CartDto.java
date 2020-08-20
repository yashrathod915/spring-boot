package com.example.ShoppingCart.Dto;

// TODO: Auto-generated Javadoc
/**
 * The Class CartDto.
 */
public class CartDto {
	
	/** The cart id. */
	private int cartId;
	
	/** The total price. */
	private float totalPrice;
	
	/**
	 * Instantiates a new cart dto.
	 */
	public CartDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new cart dto.
	 *
	 * @param cartId the cart id
	 * @param totalPrice the total price
	 */
	public CartDto(int cartId, float totalPrice) {
		super();
		this.cartId = cartId;
		this.totalPrice = totalPrice;
	}
	
	/**
	 * Gets the cart id.
	 *
	 * @return the cart id
	 */
	public int getCartId() {
		return cartId;
	}
	
	/**
	 * Sets the cart id.
	 *
	 * @param cartId the new cart id
	 */
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	
	/**
	 * Gets the total price.
	 *
	 * @return the total price
	 */
	public float getTotalPrice() {
		return totalPrice;
	}
	
	/**
	 * Sets the total price.
	 *
	 * @param totalPrice the new total price
	 */
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
