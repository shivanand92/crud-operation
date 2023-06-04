package com.example.demo.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class Resourse_Not_Found_Exception extends RuntimeException {

	public Resourse_Not_Found_Exception() {
		super("Ïnvalid credentials");
		// TODO Auto-generated constructor stub
	}

	
	
}
