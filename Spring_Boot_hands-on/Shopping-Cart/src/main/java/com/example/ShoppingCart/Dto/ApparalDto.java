package com.example.ShoppingCart.Dto;

// TODO: Auto-generated Javadoc
/**
 * The Class ApparalDto.
 */
public class ApparalDto {

	/** The type. */
	private String type;
	
	/** The band. */
	private String band;
	
	/** The design. */
	private String design;
	
	/** The price. */
	private float price;
	
	/** The product name. */
	private String productName;
	
	/**
	 * Instantiates a new apparal dto.
	 */
	public ApparalDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new apparal dto.
	 *
	 * @param type the type
	 * @param band the band
	 * @param design the design
	 * @param price the price
	 * @param productName the product name
	 */
	public ApparalDto(String type, String band, String design, float price, String productName) {
		super();
		this.type = type;
		this.band = band;
		this.design = design;
		this.price = price;
		this.productName = productName;
	}
	
	/**
	 * Gets the type.
	 *
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	
	/**
	 * Sets the type.
	 *
	 * @param type the new type
	 */
	public void setType(String type) {
		this.type = type;
	}
	
	/**
	 * Gets the band.
	 *
	 * @return the band
	 */
	public String getBand() {
		return band;
	}
	
	/**
	 * Sets the band.
	 *
	 * @param band the new band
	 */
	public void setBand(String band) {
		this.band = band;
	}
	
	/**
	 * Gets the design.
	 *
	 * @return the design
	 */
	public String getDesign() {
		return design;
	}
	
	/**
	 * Sets the design.
	 *
	 * @param design the new design
	 */
	public void setDesign(String design) {
		this.design = design;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public float getPrice() {
		return price;
	}
	
	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(float price) {
		this.price = price;
	}
	
	/**
	 * Gets the product name.
	 *
	 * @return the product name
	 */
	public String getProductName() {
		return productName;
	}
	
	/**
	 * Sets the product name.
	 *
	 * @param productName the new product name
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	
}
