package com.lti.multiController.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.support.RequestContextUtils;

@Controller
public class HomeController {
	
	 @RequestMapping(value = "/home", method = RequestMethod.GET)
	    public String doLogin(HttpServletRequest request,Model model) {
		/* String emailId1 = (String)model.asMap().get("customerEmail");
	      System.out.println(emailId1);
	      Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
	      String emailId2 =  (String) flashMap.get("customerEmail"); 
	      System.out.println(emailId2);*/
//		 Map<String, ?> flashMap = RequestContextUtils.getInputFlashMap(request);
//		 if(flashMap != null){
//			 String emailId =  (String) flashMap.get("customerEmail");
//			 System.out.println(emailId);
			 return "home";
		// }
//		 else{
//			 return "refreshNotAllowed";
//		 }
	      
	    }

}
