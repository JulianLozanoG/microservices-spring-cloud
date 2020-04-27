package com.jlozano.restwebservicemicro.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(path = "/hellow")
	public String helloWorld() {
		return "Hellow MDF";
	}
	
	//hello-world-bean
	@GetMapping(path = "/hello-world-bean")
	public HelloWorldBean helloWorldBean() {
		return new HelloWorldBean("Hellow MDF");
	}
	
	//hello-world/path-variable/JulianLozano
	@GetMapping(path = "/hello-world/path-variable/{name}")
	public HelloWorldBean helloWorlPathVariable(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hellow MDF, %s", name));
	}
}
