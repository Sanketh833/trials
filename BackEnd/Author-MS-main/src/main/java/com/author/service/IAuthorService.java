package com.author.service;


import java.util.List;
import java.util.Optional;

import com.author.dto.AuthorDTO;
import com.author.entity.Author;


public interface IAuthorService {

	String saveAuthor(Author author);

	Author getbook(String email);

	boolean login(AuthorDTO authorDTO);

//	List<Books> getallBooks();
//	
//	public Optional<Books> getBook(Integer id);
//
//	void deleteBook(Integer id);
//
//	void deleteallBooks();
//
//	Books updateAuthor(Books book, Integer id);
}
