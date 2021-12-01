package com.example.hello;
//https://www.codejava.net/frameworks/spring/understand-spring-data-jpa-with-simple-example
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service("AccountService")
public class AccountService {
    @Autowired
    AccountRepository Arepository;
    
    public void saveAccount (Account newAccount)
    {
    	Arepository.save(newAccount);
	
    }
}
