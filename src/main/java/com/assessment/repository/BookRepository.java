package com.assessment.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.entity.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {
	
	Book findByBookName(String bookName);
	
}
