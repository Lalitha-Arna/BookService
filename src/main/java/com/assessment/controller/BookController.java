package com.assessment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.assessment.entity.Book;
import com.assessment.repository.BookRepository;

@RestController
@RequestMapping(value="/bookservice")
public class BookController {

	@Autowired
	private BookRepository bookRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/getbookcost/{bookname}")
	public Book getbook(@PathVariable("bookname") String bookName) {
		return bookRepository.findByBookName(bookName);
	}
	
}
