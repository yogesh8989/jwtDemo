package com.springboot.altimetric.demo.message;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class MessageController {

	@GetMapping(path = "/message")
	public String helloWorld() {
		return "Welcome World";
	}
	
	@GetMapping(path = "/message/{name}")
	public MessageBean helloWorldPathVariable(@PathVariable String name) {
		return new MessageBean(String.format("Hello World, %s", name));
	}
}
