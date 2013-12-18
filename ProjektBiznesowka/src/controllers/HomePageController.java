package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomePageController {
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String start(ModelMap model){
		model.addAttribute("message", "Hello");
		return "hello";
	}
}
