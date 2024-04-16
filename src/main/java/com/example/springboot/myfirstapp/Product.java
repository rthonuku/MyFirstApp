package com.example.springboot.myfirstapp;

//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.NoArgsConstructor;
//@AllArgsConstructor
//@NoArgsConstructor

public class Product {
	
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the price
	 */
	public Double getPrice() {
		return Price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(Double price) {
		Price = price;
	}
/*	public Product(int id, String name, double price) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.name=name;
		this.Price=price;
	}
*/	
	private Integer id;
	private String name;
	private Double Price;
	
	
}
