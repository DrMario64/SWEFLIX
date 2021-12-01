package com.example.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloControlle {
	private final AccountRepository repository;
	
    @Autowired
    AccountService srvc;
	
    public HelloControlle(AccountRepository repository) {
    	this.repository = repository;
    }
    
    @RequestMapping("/")
    public String viewHome() {
        return "index";
    }

	@GetMapping("/login")
	public String getHello(Model model) {
		model.addAttribute("hello","Hello Spring Boot User");
		return "hello";
	}
	
	@GetMapping("/signup")
	public String greetingForm(Model model) {
		model.addAttribute("account", new Account());
	  	return "account";
	}
	
	@PostMapping("/signup")
	public String greetingSubmit(@ModelAttribute Account account, Model model) {
		model.addAttribute("account", account);
		
	    for (Account acc : repository.findAll()) {
	    	if (acc.getContent().equals(account.getContent())) {
	    		return "DiffUsername";
	    	}
	    	//System.out.println(acc.toString());
		}
		srvc.saveAccount(account);
	      
	    return "result";
	}
}
