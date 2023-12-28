package com.mb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.mb.entity.Book;
import com.mb.repo.BookRepository;

@SpringBootApplication
public class DataJpaOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DataJpaOneApplication.class, args);
		 BookRepository bookRepo = context.getBean(BookRepository.class);
		 System.out.println(bookRepo.getClass().getName());
		 Book b = new Book();
		 b.setBookId(103);
		 b.setBookName("Devops");
		 b.setBookPrice(105.00);
		 bookRepo.save(b); //UPSERT
	}

}
