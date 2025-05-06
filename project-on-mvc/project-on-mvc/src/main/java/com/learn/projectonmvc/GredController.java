package com.learn.projectonmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GredController {
	
	@GetMapping("/greds")
	public String getGrade(Model model) {
		Grade grade = new Grade("Harry", "Developer", "A");
		model.addAttribute("grade", grade);
		return "grade";
		
	}

}
