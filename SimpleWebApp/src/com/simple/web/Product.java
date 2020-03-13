package com.simple.web;

public class Product {
	private String code;
	private String ProductName;
	private float price;
	
	public Product()
	{
		
	}
	public Product(String ProductName, String code,float price)
	{
		this.code=code;
		this.ProductName=ProductName;
		this.price=price;
	}
	public String getCode()
	{
		return code;
	}
	public void setCode(String code)
	{
		this.code=code;
	}
	public String getProductName()
	{
		return ProductName;
	}
	public void setProductName(String ProductName)
	{
		this.ProductName=ProductName;
	}
	public float getPrice()
	{
		return price;
	}
	public void setPrice(float price)
	{
		this.price=price;
	}
	

}
