package com.example.ShoppingCart.Service.Impl;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.ShoppingCart.Dto.ProductDto;
import com.example.ShoppingCart.Entity.Product;
import com.example.ShoppingCart.Repository.ProductRepository;
import com.example.ShoppingCart.Service.ProductService;

// TODO: Auto-generated Javadoc
/**
 * The Class ProductServiceImpl.
 */
@Service
@Transactional(propagation = Propagation.SUPPORTS,readOnly = true)
public class ProductServiceImpl implements ProductService{

	/** The product repository. */
	@Autowired
	ProductRepository productRepository;
	
	/** The model mapper. */
	private ModelMapper modelMapper = new ModelMapper();

    /**
     * Convert entity to product dto.
     *
     * @param product the product
     * @return the product dto
     */
    public ProductDto convertEntityToProductDto(Product product) {
        return modelMapper.map(product, ProductDto.class);
    }

    /**
     * Convert product dto to entity.
     *
     * @param productDto the product dto
     * @return the product
     */
    public Product convertProductDtoToEntity(ProductDto productDto) {
        return modelMapper.map(productDto, Product.class);
    }


	/**
	 * Product.
	 *
	 * @param productName the product name
	 * @return the product dto
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS,readOnly = false)
	public ProductDto product(String productName) {
		// TODO Auto-generated method stub
		Product product=productRepository.findByProductName(productName);
		return convertEntityToProductDto(product);
	}
	

}
