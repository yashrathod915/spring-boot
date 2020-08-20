package com.example.ShoppingCart.Service.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.ShoppingCart.Dto.BookDto;
import com.example.ShoppingCart.Entity.Book;
import com.example.ShoppingCart.Repository.BookRepository;
import com.example.ShoppingCart.Service.BookService;

// TODO: Auto-generated Javadoc
/**
 * The Class BookserviceImpl.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class BookserviceImpl implements BookService {

	/** The book repository. */
	@Autowired
	BookRepository bookRepository;
	
	/** The model mapper. */
	private ModelMapper modelMapper = new ModelMapper();

	/**
	 * Convert book dto to book.
	 *
	 * @param bookDto the book dto
	 * @return the book
	 */
	private Book convertBookDtoToBook(BookDto bookDto) {
		return modelMapper.map(bookDto, Book.class);
	}

	/**
	 * Convert book to book dto.
	 *
	 * @param book the book
	 * @return the book dto
	 */
	private BookDto convertBookToBookDto(Book book) {
		return modelMapper.map(book, BookDto.class);
	}
	
	/**
	 * Adds the book.
	 *
	 * @param bookDto the book dto
	 * @return the book dto
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = false)
	public BookDto addBook(BookDto bookDto) {
		// TODO Auto-generated method stub
		Book book=convertBookDtoToBook(bookDto);
		book=bookRepository.save(book);
		bookDto=convertBookToBookDto(book);
		return bookDto;
	}

}
