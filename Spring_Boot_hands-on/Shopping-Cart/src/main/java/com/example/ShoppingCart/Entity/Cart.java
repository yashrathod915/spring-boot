package com.example.ShoppingCart.Entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

// TODO: Auto-generated Javadoc
/**
 * The Class Cart.
 */
@Entity
public class Cart {
	
	/** The cart id. */
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int cartId;
	
	/** The total price. */
	private float totalPrice;
	
	/** The user. */
	@OneToOne
	private User user;
	
	/** The products. */
	@OneToMany(mappedBy = "cart",fetch = FetchType.LAZY)
	private List<Product> products;

	/**
	 * Instantiates a new cart.
	 */
	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * Instantiates a new cart.
	 *
	 * @param cartId the cart id
	 * @param totalPrice the total price
	 * @param user the user
	 * @param products the products
	 */
	public Cart(int cartId, float totalPrice, User user, List<Product> products) {
		super();
		this.cartId = cartId;
		this.totalPrice = totalPrice;
		this.user = user;
		this.products = products;
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

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * Sets the user.
	 *
	 * @param user the new user
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * Gets the products.
	 *
	 * @return the products
	 */
	public List<Product> getProducts() {
		return products;
	}

	/**
	 * Sets the products.
	 *
	 * @param products the new products
	 */
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	
}
