package com.example.hello;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@Controller
public class HelloControlle {	
    @Autowired
    AccountService srvc;
    
    @RequestMapping("/")
    public String viewHome() {
        return "homepage";
    }
    
	@GetMapping("/accounts")
	public ResponseEntity<List<Account>> getAllAccounts() {
		List<Account> list = srvc.getAccounts();
		return new ResponseEntity<List<Account>>(list, HttpStatus.OK);
	}	

	@GetMapping("/login")
	public String loginForm(Model model) {
		model.addAttribute("account", new Account());
	  	return "login";
	}
	
	@PostMapping("/login")
	public String Login(@ModelAttribute Account account, Model model) {
		model.addAttribute("account", account);
		
		List<Account> accList = srvc.getAccounts();
	    for (Account acc : accList) {
	    	System.out.println(acc.toString());
	    	if (acc.getContent().equals(account.getContent()) && acc.getPassword().equals(account.getPassword())) {
	    		return "loginSuccess";
	    	}
	    }
	    return "loginFail";
	}
	
	@GetMapping("/signup")
	public String signupForm(Model model) {
		model.addAttribute("account", new Account());
	  	return "signup";
	}
	
	@PostMapping("/signup")
	public String signup(@ModelAttribute Account account, Model model) {
		model.addAttribute("account", account);
		
		if (account.getPassword().equals("")) {
			return "EmptyPassword";
		}
		System.out.println("password:" + account.getPassword());
		List<Account> accList = srvc.getAccounts();
	    for (Account acc : accList) {
	    	if (acc.getContent().equals(account.getContent())) {
	    		return "DiffUsername";
	    	}
		}
		srvc.saveAccount(account);
	      
	    return "result";
	}
}
