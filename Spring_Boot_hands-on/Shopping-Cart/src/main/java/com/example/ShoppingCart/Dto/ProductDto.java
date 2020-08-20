package com.example.ShoppingCart.Dto;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductDto.
 */
public class ProductDto {
	
	/** The product id. */
	private int productId;
	
	/** The product name. */
	private String productName;
	
	/** The quantity. */
	private int quantity;
	
	/** The price. */
	private float price;
	
	/**
	 * Instantiates a new product dto.
	 */
	public ProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new product dto.
	 *
	 * @param productId the product id
	 * @param productName the product name
	 * @param quantity the quantity
	 * @param price the price
	 */
	public ProductDto(int productId, String productName, int quantity, float price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
	}
	
	/**
	 * Gets the product id.
	 *
	 * @return the product id
	 */
	public int getProductId() {
		return productId;
	}
	
	/**
	 * Sets the product id.
	 *
	 * @param productId the new product id
	 */
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	/**
	 * Gets the product name.
	 *
	 * @return the product name
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * Sets the product name.
	 *
	 * @param productName the new product name
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	
	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}
	
	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	
	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	

}
