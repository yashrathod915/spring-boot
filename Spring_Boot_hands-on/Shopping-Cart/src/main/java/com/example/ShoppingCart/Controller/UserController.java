package com.example.ShoppingCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoppingCart.Dto.CartDto;
import com.example.ShoppingCart.Dto.UserDto;
import com.example.ShoppingCart.Exception.CartIdNotFoundException;
import com.example.ShoppingCart.Exception.ShoppingCartException;
import com.example.ShoppingCart.Exception.UserNotFoundException;
import com.example.ShoppingCart.Service.UserService;

// TODO: Auto-generated Javadoc
/**
 * The Class UserController.
 */
@RestController
public class UserController {
	
	/** The user service. */
	@Autowired
	UserService userService;
	
	/**
	 * Adds the user.
	 *
	 * @param userDto the user dto
	 * @return the response entity
	 */
	@PostMapping("/shopping-cart/user")
	public ResponseEntity<UserDto> addUser(@RequestBody UserDto userDto ) {
		return ResponseEntity.status(HttpStatus.OK).body(userService.addUser(userDto));
	}
	
	/**
	 * Adds the product to cart.
	 *
	 * @param userId the user id
	 * @param productId the product id
	 * @return the response entity
	 * @throws ShoppingCartException the shopping cart exception
	 */
	@PutMapping("/shopping-cart/cart")
	public ResponseEntity<String> addProductToCart(@RequestParam int userId,@RequestParam int productId) throws ShoppingCartException{
		return ResponseEntity.status(HttpStatus.OK).body(userService.addProductToCart(userId,productId));
	}
	
	/**
	 * Removes the A product from cart.
	 *
	 * @param productId the product id
	 * @param cartId the cart id
	 * @return the response entity
	 * @throws ShoppingCartException the shopping cart exception
	 */
	@PutMapping("/shopping-cart/remove-product")
	public ResponseEntity<String> removeAProductFromCart(@RequestParam int productId,@RequestParam int cartId) throws ShoppingCartException{
		return  ResponseEntity.status(HttpStatus.OK).body(userService.removeProductFromCart(productId,cartId));
	}
	
	/**
	 * Removes the all product from cart.
	 *
	 * @param cartId the cart id
	 * @return the response entity
	 * @throws CartIdNotFoundException the cart id not found exception
	 */
	@PutMapping("shopping-cart/remove-cart")
	public ResponseEntity<String> removeAllProductFromCart(@RequestParam int cartId) throws CartIdNotFoundException{
		return ResponseEntity.status(HttpStatus.OK).body(userService.removeAllProductFromCart(cartId));
	}
	
	
	/**
	 * View cart.
	 *
	 * @param cartId the cart id
	 * @return the response entity
	 * @throws CartIdNotFoundException the cart id not found exception
	 */
	@GetMapping("shopping-cart/cart")
	public ResponseEntity<CartDto> viewCart(@RequestParam int cartId) throws CartIdNotFoundException{
		return ResponseEntity.status(HttpStatus.OK).body(userService.viewCart(cartId));
	}
	
	/**
	 * Update cart.
	 *
	 * @param cartId the cart id
	 * @param productId the product id
	 * @param quantity the quantity
	 * @return the response entity
	 * @throws ShoppingCartException the shopping cart exception
	 */
	@PutMapping("Shopping-cart/update-quantity")
	public ResponseEntity<String> updateCart(@RequestParam int cartId,@RequestParam int productId,@RequestParam int quantity) throws ShoppingCartException{
		return ResponseEntity.status(HttpStatus.OK).body(userService.updateCart(cartId,productId,quantity));
	}
	
	

}
