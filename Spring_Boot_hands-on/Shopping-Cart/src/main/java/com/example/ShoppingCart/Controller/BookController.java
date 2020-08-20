package com.example.ShoppingCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoppingCart.Dto.BookDto;
import com.example.ShoppingCart.Service.BookService;

// TODO: Auto-generated Javadoc
/**
 * The Class BookController.
 */
@RestController
public class BookController {
	
	/** The book service. */
	@Autowired
	BookService bookService;
	
	/**
	 * Adds the book.
	 *
	 * @param bookDto the book dto
	 * @return the response entity
	 */
	@PutMapping("/shopping-cart/book")
	public ResponseEntity<BookDto> addBook(@RequestBody BookDto bookDto ) {
		return ResponseEntity.status(HttpStatus.OK).body(bookService.addBook(bookDto));
	}

}
