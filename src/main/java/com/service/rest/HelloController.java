package com.service.rest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Home")
public class HelloController {

	@RequestMapping(value="/getJson/{name}", method= RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> getJson(@PathVariable(value="name")String name, HttpServletRequest req, HttpServletResponse res){
		final HttpHeaders httpHeaders= new HttpHeaders();
	    httpHeaders.setContentType(MediaType.APPLICATION_JSON);
		return new ResponseEntity<>("{\"message\": \"Hello World\", \"name\": \""+name+"\"}", httpHeaders, HttpStatus.OK);
	}
}
