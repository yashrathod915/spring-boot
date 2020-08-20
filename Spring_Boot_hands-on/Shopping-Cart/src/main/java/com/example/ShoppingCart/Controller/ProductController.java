package com.example.ShoppingCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoppingCart.Dto.ProductDto;
import com.example.ShoppingCart.Service.ProductService;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductController.
 */
@RestController
public class ProductController {
	
	/** The product service. */
	@Autowired
	ProductService productService;
	
	/**
	 * Product.
	 *
	 * @param productName the product name
	 * @return the response entity
	 */
	@GetMapping("shopping-cart/product")
	public ResponseEntity<ProductDto> product(@RequestParam String productName){
		return ResponseEntity.status(HttpStatus.OK).body(productService.product(productName));
	}

}
