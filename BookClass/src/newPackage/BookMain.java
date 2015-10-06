package newPackage;
import java.util.Scanner;

import newPackage.BookClass;
public class BookMain {
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		String book_author, book_title, book_description;
		int quantinstock, noofcopies;
		double pricepercopy, totalprice;
		BookClass b;
		System.out.println("Name of Author");
		book_author = keyboard.nextLine();
		System.out.println("Book Title");
		book_title = keyboard.nextLine();
		System.out.println("Genre");
		book_description = keyboard.nextLine();
		System.out.println("Total Number of copies available");
		quantinstock = keyboard.nextInt();
		System.out.println("Price per copy of book");
		pricepercopy=keyboard.nextDouble();
		b = new BookClass (book_author, book_title,book_description,quantinstock,pricepercopy);
		System.out.println("How many copies do you want to buy?");
		noofcopies = keyboard.nextInt();
		totalprice = b.getTotalPrice(noofcopies);
		System.out.println("The following is the result of the toal price call request\n"+totalprice);
		
	}

	}

