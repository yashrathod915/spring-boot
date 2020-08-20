package com.example.ShoppingCart.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.ShoppingCart.Entity.Apparal;

/**
 * The Interface ApparalRepository.
 */
@Repository
public interface ApparalRepository extends JpaRepository<Apparal, Integer> {

}
