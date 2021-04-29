package com.infotecquest.app01.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@RequestMapping(value= "/helloworld")
	public String sayHello(@RequestParam(value = "name", defaultValue = " Anonymous")String name){
			return "Hello World " + name;
	}
}
