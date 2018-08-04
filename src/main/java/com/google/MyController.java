package com.google;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MyController {
	@RequestMapping(value="/welcome", method=RequestMethod.GET)
	public ModelAndView openWelcome() {
		ModelAndView m =new ModelAndView("welcome");
		m.addObject("username", "Ved Prakash Arya!");
		return m;
	}

}
