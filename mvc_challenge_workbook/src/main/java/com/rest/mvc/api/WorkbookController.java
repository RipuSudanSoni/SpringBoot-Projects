package com.rest.mvc.api;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkbookController {
	
	List<Records> records = Arrays.asList(
	        new Records("Chair", 20.99, 5.99),
	        new Records("Table", 40.99, 8.99),
	        new Records("Couch", 100.99, 105.99),
	        new Records("Fridge", 200.99, 59.99),
	        new Records("Bed", 150.99, 205.99)  
	    );
	
	@GetMapping("/")
	public String getShow(Model model) {
		model.addAttribute("records", records);
		return "records";
	}
}
