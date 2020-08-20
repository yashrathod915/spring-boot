package com.example.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ShoppingCart.Entity.Book;

/**
 * The Interface BookRepository.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer>{

}
