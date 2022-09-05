package com.book.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.book.entity.Books;

public interface IBookRepository extends JpaRepository<Books, Integer>{
	
	
	@Query(value = "SELECT * FROM books.books WHERE email=?1", nativeQuery = true)
	public List<Books> findByemail(String email);
	
	
	

}
