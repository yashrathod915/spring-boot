package com.example.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ShoppingCart.Entity.Cart;

/**
 * The Interface CartRepository.
 */
@Repository
public interface CartRepository extends JpaRepository<Cart, Integer>{

}
