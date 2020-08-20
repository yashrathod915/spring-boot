package com.example.ShoppingCart.Service.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.ShoppingCart.Dto.ApparalDto;
import com.example.ShoppingCart.Entity.Apparal;
import com.example.ShoppingCart.Repository.ApparalRepository;
import com.example.ShoppingCart.Service.ApparalService;

// TODO: Auto-generated Javadoc
/**
 * The Class ApparalServiceImpl.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class ApparalServiceImpl implements ApparalService{

	
	/** The apparal repository. */
	@Autowired
	ApparalRepository apparalRepository;
	
	/** The model mapper. */
	private ModelMapper modelMapper = new ModelMapper();

	/**
	 * Convert apparal dto to apparal.
	 *
	 * @param apparalDto the apparal dto
	 * @return the apparal
	 */
	private Apparal convertApparalDtoToApparal(ApparalDto apparalDto) {
		return modelMapper.map(apparalDto, Apparal.class);
	}

	/**
	 * Convert apparal to apparal dto.
	 *
	 * @param apparal the apparal
	 * @return the apparal dto
	 */
	private ApparalDto convertApparalToApparalDto(Apparal apparal) {
		return modelMapper.map(apparal, ApparalDto.class);
	}
	
	/**
	 * Adds the apparal.
	 *
	 * @param apparalDto the apparal dto
	 * @return the apparal dto
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = false)
	public ApparalDto addApparal(ApparalDto apparalDto) {
		// TODO Auto-generated method stub
		Apparal apparal=convertApparalDtoToApparal(apparalDto);
		apparal=apparalRepository.save(apparal);
		apparalDto=convertApparalToApparalDto(apparal);
		return apparalDto;
	}

}
