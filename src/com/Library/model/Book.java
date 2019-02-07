package com.Library.model;

public class Book {
	private int bookId;
	private String title;
	private Author author;
	private Publisher publisher;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisher) {
		this.publisher = publisher;
	}
	
	@Override
	public String toString() {
		return "bookId is "+ bookId+ " title is "+ title+" author is "+ author.toString() + " publisher is " +publisher.toString();
	}
	
}