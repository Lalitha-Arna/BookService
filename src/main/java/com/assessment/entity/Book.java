package com.assessment.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="book",schema="accolite_book")
public class Book {
	@Id
	@SequenceGenerator(
			name="book_sequence",
			sequenceName="book_sequence",
			allocationSize=1
			)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator = "book_sequence")
	private Integer bookId;
	
	@Column(name="bookName")
	private String bookName;
	
	@Column(name="bookCost")
	private Double bookCost;
	
	public Integer getBookId() {
		return bookId;
	}
	public void setBookId(Integer bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public Double getBookCost() {
		return bookCost;
	}
	public void setBookCost(Double bookCost) {
		this.bookCost = bookCost;
	}
	
}
