package com.bce.demo;
//https://www.codejava.net/frameworks/spring/understand-spring-data-jpa-with-simple-example
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
 
@Service("greetingService")
public class GreetingService {
    @Autowired
    GreetingRepository grepository;
    
public void saveGreeting (Account newGreeting)
{
	
	grepository.save(newGreeting);
	
}
}
