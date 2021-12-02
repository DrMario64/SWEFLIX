package com.bce.demo;
import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface GreetingRepository extends 
	CrudRepository<Account, Long> {

		  List<Account> findByContent(String content);

		  Optional<Account> findById(Long id);
}
