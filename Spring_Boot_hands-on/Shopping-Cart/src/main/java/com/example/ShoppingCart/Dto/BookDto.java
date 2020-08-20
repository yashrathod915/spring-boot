package com.example.ShoppingCart.Dto;

// TODO: Auto-generated Javadoc
/**
 * The Class BookDto.
 */
public class BookDto {

	/** The genere. */
	private String genere;
	
	/** The author. */
	private String author;
	
	/** The publication. */
	private String publication;
	
	/** The price. */
	private float price;
	
	/** The product name. */
	private String productName;
	
	/**
	 * Instantiates a new book dto.
	 */
	public BookDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new book dto.
	 *
	 * @param genere the genere
	 * @param author the author
	 * @param publication the publication
	 * @param price the price
	 * @param productName the product name
	 */
	public BookDto(String genere, String author, String publication, float price, String productName) {
		super();
		this.genere = genere;
		this.author = author;
		this.publication = publication;
		this.price = price;
		this.productName = productName;
	}
	
	/**
	 * Gets the genere.
	 *
	 * @return the genere
	 */
	public String getGenere() {
		return genere;
	}
	
	/**
	 * Sets the genere.
	 *
	 * @param genere the new genere
	 */
	public void setGenere(String genere) {
		this.genere = genere;
	}
	
	/**
	 * Gets the author.
	 *
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}
	
	/**
	 * Sets the author.
	 *
	 * @param author the new author
	 */
	public void setAuthor(String author) {
		this.author = author;
	}
	
	/**
	 * Gets the publication.
	 *
	 * @return the publication
	 */
	public String getPublication() {
		return publication;
	}
	
	/**
	 * Sets the publication.
	 *
	 * @param publication the new publication
	 */
	public void setPublication(String publication) {
		this.publication = publication;
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
