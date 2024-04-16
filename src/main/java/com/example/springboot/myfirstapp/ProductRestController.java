package com.example.springboot.myfirstapp;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
  
	@PostMapping("/Product")
	public String saveProduct(@RequestBody Product p)
	{
		System.out.println(p);
		return "Product Saved";
	}

	@GetMapping("/Product/{pid}")
	public Product getProduct(@PathVariable Integer pid)
	{   
		//Product P= null;
		Product P1= new Product();
		Product P2 = new Product();
		if(pid==100)
		{
		P1.setName("Laptop");
		P1.setId(100);
		P1.setPrice(1000.00);
		
		//P = new Product(100,"Laptop",1000.00);
		}
		else if(pid==101)
		{
			P2.setName("Mouse");
			P2.setId(101);
			P2.setPrice(30.00);
		}
		/*
		else if(pid==101)
		{
		P = new Product(101,"Mouse",30.00);
		}
		else if(pid==102)
		{
		P = new Product(102, "Keyboard", 40.00);
		}
		else if(pid==103)
		{
		P = new Product(103, "BackPack", 80.00);
		}
		else if(pid==104)
		{
		P = new Product(104, "Monitor", 200.00);
		}
		else if(pid==105)
		{
		P = new Product(105,"HDMI Cable", 25.00);
		}
		*/
		return P1;
		

		
	
	}

	
	@GetMapping("/Products")
	public List<Product> getProducts()
	{ 
		
		
		/*
		Product p1=  new Product(100,"Laptop",1000.00);
		Product p2 = new Product(101,"Mouse",30.00);
		Product p3= new Product(102, "Keyboard", 40.00);
		Product p4 = new Product(103, "BackPack", 80.00);
		Product p5 = new Product(104, "Monitor", 200.00);
		Product p6 = new Product(105,"HDMI Cable", 25.00);
		*/
		Product p1 = new Product();
		p1.setName("Laptop");
		p1.setId(100);
		p1.setPrice(1000.00);
		Product p2 = new Product();
		p2.setName("Mouse");
		p2.setId(101);
		p2.setPrice(30.00);
		Product p3 = new Product();
		p3.setName("Keyboard");
		p3.setId(102);
		p3.setPrice(40.00);
		List<Product> products = Arrays.asList(p1,p2,p3);
		return products;
		
		
	}
	
	
}