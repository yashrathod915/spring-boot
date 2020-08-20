package com.example.ShoppingCart.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.ShoppingCart.Dto.ApparalDto;
import com.example.ShoppingCart.Service.ApparalService;

// TODO: Auto-generated Javadoc
/**
 * The Class ApparalController.
 */
@RestController
public class ApparalController {
	
	/** The apparal service. */
	@Autowired
	ApparalService apparalService;
	
	/**
	 * Adds the apparal.
	 *
	 * @param apparalDto the apparal dto
	 * @return the response entity
	 */
	@PutMapping("/shopping-cart/Apparal")
	public ResponseEntity<ApparalDto> addApparal(@RequestBody ApparalDto apparalDto ) {
		return ResponseEntity.status(HttpStatus.OK).body(apparalService.addApparal(apparalDto));
	}

}
