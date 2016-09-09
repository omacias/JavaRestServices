package com.service.rest;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.object.Person;

@RestController
@RequestMapping("/Home")
public class HelloController {

	@RequestMapping(value="/getJson/{name}", method= RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> getJson(@PathVariable(value="name")String name, HttpServletRequest req, HttpServletResponse res){
		return new ResponseEntity<>("{\"message\": \"Hello World\", \"name\": \""+name+"\"}", HttpStatus.OK);
	}
	
	@RequestMapping(value="/getPerson", method= RequestMethod.GET, produces = "application/json")
	public ResponseEntity<Person> getPerson(HttpServletRequest req, HttpServletResponse res){
		return new ResponseEntity<Person>(new Person("Oscar", "Macias", 25), HttpStatus.OK);
	}
	
	@RequestMapping(value="/insertPerson", method= RequestMethod.POST, produces = "application/json")
	public ResponseEntity<Person> insertPerson(@RequestBody Person p){
		return new ResponseEntity<Person>(p, HttpStatus.OK);
	}
	
	@RequestMapping(value="/putList", method= RequestMethod.PUT, produces = "application/json")
	public ResponseEntity<List<Integer>> putListValues(@RequestBody List<Integer> l){
		return new ResponseEntity<List<Integer>>(l, HttpStatus.OK);
	}
}
