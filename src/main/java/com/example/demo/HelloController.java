package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	 @RequestMapping("/")
	 @ResponseBody
	 String hello() {
		 return "Hello from my spring booot application!!";
	 }

	 @RequestMapping("/tools")
		String myTools() {
			return "Hello from my spring boot Tools application!";
		}
		
		@RequestMapping("/students/{name}/{id}")
		String myStudentIntro(@PathVariable String name,@PathVariable Long id) {
			return "Hello this is "+name +" and my id is "+id;
		}
		
		@RequestMapping("/calculator/{first_value}/{second_value}")
        String calculator(@PathVariable Double first_value,@PathVariable Double second_value) {
		double a = first_value+second_value;
		double b = first_value-second_value;
		double c = first_value*second_value;
		double d = first_value/second_value;
		return "addition =" +a +"subraction ="+b +" multiplication ="+c+"division ="+d;
		}
}
