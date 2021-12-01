package com.example.hello;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface AccountRepository extends 
	CrudRepository<Account, Long> {

		  List<Account> findByContent(String content);

		  Optional<Account> findById(Long id);
}
