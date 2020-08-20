package com.example.ShoppingCart.Service.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.ShoppingCart.Dto.CartDto;
import com.example.ShoppingCart.Dto.UserDto;
import com.example.ShoppingCart.Entity.Cart;
import com.example.ShoppingCart.Entity.Product;
import com.example.ShoppingCart.Entity.User;
import com.example.ShoppingCart.Exception.CartIdNotFoundException;
import com.example.ShoppingCart.Exception.NoProductFoundException;
import com.example.ShoppingCart.Exception.ProductAlreadyTakenException;
import com.example.ShoppingCart.Exception.QuantityNegativeException;
import com.example.ShoppingCart.Exception.ShoppingCartException;
import com.example.ShoppingCart.Exception.UserNotFoundException;
import com.example.ShoppingCart.Repository.CartRepository;
import com.example.ShoppingCart.Repository.ProductRepository;
import com.example.ShoppingCart.Repository.UserRepository;
import com.example.ShoppingCart.Service.UserService;

// TODO: Auto-generated Javadoc
/**
 * The Class UserServiceImpl.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class UserServiceImpl implements UserService {

//	AES aes= new AES();

	/** The user repository. */
	@Autowired
	UserRepository userRepository;

	/** The product repository. */
	@Autowired
	ProductRepository productRepository;

	/** The cart repository. */
	@Autowired
	CartRepository cartRepository;

	/** The model mapper. */
	private ModelMapper modelMapper = new ModelMapper();

	/**
	 * Convert user dto to user.
	 *
	 * @param userDto the user dto
	 * @return the user
	 */
	private User convertUserDtoToUser(UserDto userDto) {
		User user = modelMapper.map(userDto, User.class);
		user = userRepository.save(user);
		return user;
	}

	/**
	 * Convert user to user dto.
	 *
	 * @param user the user
	 * @return the user dto
	 */
	private UserDto convertUserToUserDto(User user) {
		return modelMapper.map(user, UserDto.class);
	}

	/**
	 * Convert cart entity to cart dto.
	 *
	 * @param cart the cart
	 * @return the cart dto
	 */
	public CartDto convertCartEntityToCartDto(Cart cart) {
		return modelMapper.map(cart, CartDto.class);
	}

	/**
	 * Convert cart dto to cart entity.
	 *
	 * @param cartDto the cart dto
	 * @return the cart
	 */
	public Cart convertCartDtoToCartEntity(CartDto cartDto) {
		return modelMapper.map(cartDto, Cart.class);
	}

	/**
	 * Adds the user.
	 *
	 * @param userDto the user dto
	 * @return the user dto
	 */
	@Override
	public UserDto addUser(UserDto userDto) {
		// TODO Auto-generated method stub
		User user = convertUserDtoToUser(userDto);
		return convertUserToUserDto(user);
	}

	/**
	 * Adds the product to cart.
	 *
	 * @param userId the user id
	 * @param productId the product id
	 * @return the string
	 * @throws ShoppingCartException the shopping cart exception
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = false)
	public String addProductToCart(int userId, int productId) throws ShoppingCartException {
		// TODO Auto-generated method stub
		List<Product> products = new ArrayList<Product>();
		Optional<User> user = userRepository.findById(userId);

		user.orElseThrow(() -> new UserNotFoundException("User Id not found"));
		Optional<Product> product = productRepository.findById(productId);
		product.orElseThrow(() -> new NoProductFoundException("Product Id not found"));
		if (product.get().getCart() == null || (product.get().getCart().getUser().getUserId() == userId)) {

			products.add(product.get());
			Cart cart;
			if (user.get().getCart() == null) {
				cart = new Cart();
				cart.setProducts(products);
				cart.setUser(user.get());
			} else {
				cart = user.get().getCart();
				cart.setProducts(products);
				cart.setUser(user.get());
			}
			Cart savedCart = cartRepository.save(cart);
			product.get().setCart(cart);
			product.get().setQuantity(product.get().getQuantity() + 1);
			productRepository.save(product.get());
		} else {
			throw new ProductAlreadyTakenException("Product Already Taken");
		}
		return "added Successfully";
	}

	/**
	 * Removes the product from cart.
	 *
	 * @param productId the product id
	 * @param cartId the cart id
	 * @return the string
	 * @throws ShoppingCartException the shopping cart exception
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = false)
	public String removeProductFromCart(int productId, int cartId) throws ShoppingCartException {
		// TODO Auto-generated method stub
		Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new CartIdNotFoundException("Cart Id Not Found"));
		Product product = productRepository.findById(productId)
				.orElseThrow(() -> new NoProductFoundException("Product Id Not Found"));
		List<Product> products = cart.getProducts();
		if (products.removeIf(e -> e.getProductId() == productId)) {
			cart.setProducts(products);
			product.setQuantity(0);
			product.setCart(null);
			productRepository.save(product);
			Cart savedCart = cartRepository.save(cart);
		} else {
			throw new NoProductFoundException("Product Not Found in Cart");
		}
		return "Removed Successfully";
	}

	/**
	 * Removes the all product from cart.
	 *
	 * @param cartId the cart id
	 * @return the string
	 * @throws CartIdNotFoundException the cart id not found exception
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = false)
	public String removeAllProductFromCart(int cartId) throws CartIdNotFoundException {
		// TODO Auto-generated method stub
		Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new CartIdNotFoundException("Cart Id Not Found"));

		for (Product product : cart.getProducts()) {
			product.setCart(null);
			product.setQuantity(0);
			productRepository.save(product);
		}
		cart.getProducts().clear();
		Cart savedCart = cartRepository.save(cart);
		return "deleted";
	}

	/**
	 * View cart.
	 *
	 * @param cartId the cart id
	 * @return the cart dto
	 * @throws CartIdNotFoundException the cart id not found exception
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = false)
	public CartDto viewCart(int cartId) throws CartIdNotFoundException {
		// TODO Auto-generated method stub
		Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new CartIdNotFoundException("Cart Id Not Found"));

		float price = 0;
		for (Product product : cart.getProducts()) {
			System.out.println(product.getPrice());
			price += product.getPrice() * product.getQuantity();
		}
		cart.setTotalPrice(price);
		Cart savedCart = cartRepository.save(cart);
		CartDto cartDto = convertCartEntityToCartDto(savedCart);
		return cartDto;
	}

	/**
	 * Update cart.
	 *
	 * @param cartId the cart id
	 * @param productId the product id
	 * @param quantity the quantity
	 * @return the string
	 * @throws ShoppingCartException the shopping cart exception
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = false)
	public String updateCart(int cartId, int productId, int quantity) throws ShoppingCartException {
		// TODO Auto-generated method stub
		 Cart cart = cartRepository.findById(cartId).orElseThrow(() -> new CartIdNotFoundException("Cart Id Not Found"));
         Product Product=  productRepository.findById(productId)
                   .orElseThrow(() -> new NoProductFoundException("Product Id Not Found"));
           if (quantity > 0) {
               int cnt = 0;
               for (Product product : cart.getProducts()) {
                   if (product.getProductId() == productId) {
                       cnt++;
                       product.setQuantity(quantity);
                       productRepository.save(product);
                       return "Successfully Updated Product in Cart with quantity " + quantity;
                   }
               }
               if (cnt == 0) {        
                   throw new NoProductFoundException("Product Not Found In Cart");  
               }

           } else if (quantity == 0) {
               removeAllProductFromCart(cartId);
               return "Removed All Product As Quantity is " + quantity;
           }
           else {
               throw new QuantityNegativeException("Quantity Not Be Negative");
           }
           return null;
	}

}
