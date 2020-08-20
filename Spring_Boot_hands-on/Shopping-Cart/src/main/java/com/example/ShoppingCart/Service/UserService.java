package com.example.ShoppingCart.Service;

import com.example.ShoppingCart.Dto.CartDto;
import com.example.ShoppingCart.Dto.UserDto;
import com.example.ShoppingCart.Exception.CartIdNotFoundException;
import com.example.ShoppingCart.Exception.ShoppingCartException;
import com.example.ShoppingCart.Exception.UserNotFoundException;

// TODO: Auto-generated Javadoc
/**
 * The Interface UserService.
 */
public interface UserService {

	/**
	 * Adds the user.
	 *
	 * @param userDto the user dto
	 * @return the user dto
	 */
	public UserDto addUser(UserDto userDto);

	/**
	 * Adds the product to cart.
	 *
	 * @param userId the user id
	 * @param productId the product id
	 * @return the string
	 * @throws ShoppingCartException the shopping cart exception
	 */
	public String addProductToCart(int userId, int productId) throws ShoppingCartException;

	/**
	 * Removes the product from cart.
	 *
	 * @param productId the product id
	 * @param cartId the cart id
	 * @return the string
	 * @throws ShoppingCartException the shopping cart exception
	 */
	public String removeProductFromCart(int productId, int cartId) throws ShoppingCartException;

	/**
	 * Removes the all product from cart.
	 *
	 * @param cartId the cart id
	 * @return the string
	 * @throws CartIdNotFoundException the cart id not found exception
	 */
	public String removeAllProductFromCart(int cartId) throws CartIdNotFoundException;

	/**
	 * View cart.
	 *
	 * @param cartId the cart id
	 * @return the cart dto
	 * @throws CartIdNotFoundException the cart id not found exception
	 */
	public CartDto viewCart(int cartId) throws CartIdNotFoundException;

	/**
	 * Update cart.
	 *
	 * @param cartId the cart id
	 * @param productId the product id
	 * @param quantity the quantity
	 * @return the string
	 * @throws ShoppingCartException the shopping cart exception
	 */
	public String updateCart(int cartId, int productId, int quantity) throws ShoppingCartException;

}
