package com.service.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Home")
public class HelloController {

	@RequestMapping(value="/getJson", method= RequestMethod.GET)
	public ResponseEntity<?> getJson(HttpServletRequest req, HttpServletResponse res){
		res.setContentType("application/hal+json;charset=UTF-8");
		return new ResponseEntity<>("{\"message\": \"Hello World\"}", HttpStatus.OK);
	}
}