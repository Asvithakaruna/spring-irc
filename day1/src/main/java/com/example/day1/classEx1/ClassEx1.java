package com.example.day1.classEx1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ClassEx1 {
 
	@GetMapping("/hi")
	@ResponseBody
	public String display()
	{
		return "Heyy";
	}
}
