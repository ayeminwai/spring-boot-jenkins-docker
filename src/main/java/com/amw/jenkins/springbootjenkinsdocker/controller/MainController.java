package com.amw.jenkins.springbootjenkinsdocker.controller;

import java.util.HashMap;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/main")
@SuppressWarnings("rawtypes")
public class MainController {
	
	@GetMapping(value = "/getMessage", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<HashMap> getMessage(){
		HashMap<String,String> map = new HashMap<String,String>();
		map.put("code", "000");
		map.put("message", "Success");
		
		return new ResponseEntity<HashMap>(map, HttpStatus.OK);
	}
}
