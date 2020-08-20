package com.example.ShoppingCart.Entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

// TODO: Auto-generated Javadoc
/**
 * The Class Book.
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName = "productId")
public class Book extends Product{
	
	/** The genere. */
	private String genere;
	
	/** The author. */
	private String author;
	
	/** The publication. */
	private String publication;
	
	/**
	 * Instantiates a new book.
	 */
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Instantiates a new book.
	 *
	 * @param productName the product name
	 * @param price the price
	 * @param genere the genere
	 * @param author the author
	 * @param publication the publication
	 */
	public Book(String productName,int price,String genere, String author, String publication) {
		super(productName,price);
		this.genere = genere;
		this.author = author;
		this.publication = publication;
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
}
