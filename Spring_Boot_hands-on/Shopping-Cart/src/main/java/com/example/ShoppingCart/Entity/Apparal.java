package com.example.ShoppingCart.Entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

// TODO: Auto-generated Javadoc
/**
 * The Class Apparal.
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "productId")
public class Apparal extends Product {

	/** The type. */
	private String type;
	
	/** The band. */
	private String band;
	
	/** The design. */
	private String design;

	/**
	 * Instantiates a new apparal.
	 */
	public Apparal() {
		super();
		// TODO Auto-generated constructor stub
	}
		
	/**
	 * Instantiates a new apparal.
	 *
	 * @param type the type
	 * @param band the band
	 * @param design the design
	 */
	public Apparal(String type, String band, String design) {
		super();
		this.type = type;
		this.band = band;
		this.design = design;
	}
	
	/**
	 * Instantiates a new apparal.
	 *
	 * @param price the price
	 * @param productName the product name
	 * @param type the type
	 * @param band the band
	 * @param design the design
	 */
	public Apparal(int price,String productName,String type, String band, String design) {
		super(productName, price);
		this.type = type;
		this.band = band;
		this.design = design;
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
	

}
