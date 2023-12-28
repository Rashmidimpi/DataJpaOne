package com.mb.repo;

import org.springframework.data.repository.CrudRepository;

import com.mb.entity.Book;

public interface BookRepository extends CrudRepository<Book, Integer>{

}
