package com.ivo.helloworldweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class HelloController {

  public String sayHello() {
    return "hello";
  }
  
  @RequestMapping(value = "hello", method = RequestMethod.GET)
  public String test(Model model) {
    model.addAttribute("name", "Ivo");
    return "hello";
  }
}
