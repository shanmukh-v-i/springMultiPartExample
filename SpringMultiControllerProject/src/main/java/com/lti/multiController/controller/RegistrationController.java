package com.lti.multiController.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.lti.multiController.model.Customer;

@Controller
public class RegistrationController {
	
	 @RequestMapping(value = "/register", method = RequestMethod.GET)
	    public String viewRegistrationPage(Model model) {
	      Customer customer = new Customer();
	        model.addAttribute("customer", customer);
	        return "register";
	    }
	
	 @RequestMapping(value = "/doRegister", method = RequestMethod.POST)
	    public String doLogin(@Valid Customer customer, BindingResult result,Model model,RedirectAttributes redirectAttributes) {
		 model.addAttribute("customer",customer);
	      //Do the Registration logic and then redirect to home page without using action for home page
		 
		 //redirectAttributes.addFlashAttribute("customerEmail", customer.getEmailId());
	      return "redirect:/home";
	    }

}
