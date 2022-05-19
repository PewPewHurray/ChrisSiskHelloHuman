package com.codingdojo.hellohuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHuman {
	@RequestMapping("/")
	public String hello(@RequestParam(value="first_name", required=false) String firstName, @RequestParam(value="last_name", required=false) String lastName, @RequestParam(value="times", required=false) Integer times) {
		String sentence = "Hello";
		String results = "";
		if(firstName != null) {
			sentence = sentence + " " + firstName;
		}
		if(lastName != null) {
			sentence = sentence + " " + lastName;
		}
		if(firstName == null && lastName == null) {
			sentence = sentence + " Human";
		}
		
		if(times != null) {
			for(int i=0;i<times;i++) {
				results = results + sentence + " ";
			}
			return results;
		}
		return sentence;
//		if(firstName != null && lastName != null) {
//			return "Hello " + firstName + lastName;
//		} else if(firstName != null) {
//			return "Hello " + firstName;
//		} else if(lastName != null) {
//			return "Hello... " + lastName + ", thats all I get is your last name?";
//		}
//		return "Hello Human";
	}
}
