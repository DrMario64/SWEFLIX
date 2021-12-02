package com.bce.demo;

import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GreetingController {
	////THIS WAS KEY  https://www.moreofless.co.uk/spring-mvc-java-autowired-component-null-repository-service/
	// was trying to set a service using New - which threw an repository is null error
    @Autowired
    GreetingService srvc;

  @GetMapping("/greeting")
  public String greetingForm(Model model) {
    model.addAttribute("greeting", new Account());
    return "greeting";
  }

  @PostMapping("/greeting")
  public String greetingSubmit(@ModelAttribute Account greeting, Model model) {
    model.addAttribute("greeting", greeting);

    //test new service where it will get output
    //this is convenient place as right after submit
    //but not right place if need to do manipulations
    //but as service, can now put anywhere greeting is used
       srvc.saveGreeting(greeting);
    

  
    return "result";
  }

}
