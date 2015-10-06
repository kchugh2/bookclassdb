package newPackage;

import java.util.Scanner;


public class BookClass {
	private String author, title, description;
	private int quantity;
	private double price;
	private boolean isInStock; 
	/*variable declaration*/
	public BookClass( String aut, String tit, String descript, int stk, double cost)
	{
	setAuthor(aut);
	setTitle(tit);
	setDescription(descript);
	quantity =stk;
	price =cost;
	if (stk > 0)
		isInStock = true;
	else 
		isInStock = false;
	}
	public BookClass()
	{
	setAuthor("");
	setTitle("");
	setDescription("");
	quantity = 0;
	price = 0;
	isInStock = false;
	}
	
	
	public double getTotalPrice (int reqQuantity)
	{
		double totalcost =0 ;
		if(isInStock)
		{	if(this.quantity >= reqQuantity)
			totalcost = this.quantity * this.price;
			else
			System.out.println("Quantity not available ");
			
		}
		else
			{
			System.out.println("Not in Stock");
			totalcost=0;
			}
		return totalcost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
		
	
	
		
	}


