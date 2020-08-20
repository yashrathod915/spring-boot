package com.example.ShoppingCart.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;

// TODO: Auto-generated Javadoc
/**
 * The Class Product.
 */
@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@NamedNativeQueries({
    @NamedNativeQuery(name = "product.findByProductName", query = "select p from Product p where p.productName=?")})
public class Product {
	
	/** The product id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productId;
	
	/** The product name. */
	private String productName;
	
	/** The quantity. */
	private int quantity;
	
	/** The price. */
	private float price;
	
	/** The cart. */
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Cart cart;

	/**
	 * Instantiates a new product.
	 */
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new product.
	 *
	 * @param productId the product id
	 * @param productName the product name
	 * @param quantity the quantity
	 * @param price the price
	 * @param cart the cart
	 */
	public Product(int productId, String productName, int quantity, float price, Cart cart) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantity = quantity;
		this.price = price;
		this.cart = cart;
	}

	/**
	 * Instantiates a new product.
	 *
	 * @param productName the product name
	 * @param price the price
	 */
	public Product(String productName, float price) {
		super();
		this.productName = productName;
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
