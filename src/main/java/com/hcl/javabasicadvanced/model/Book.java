package com.hcl.javabasicadvanced.model;

import java.util.*;

public class Book {
	public int id;
	public String name, author, publisher;
	public int quantity;

	public Book(int id, String name, String author, String publisher, int quantity) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		this.quantity = quantity;
	}
}
