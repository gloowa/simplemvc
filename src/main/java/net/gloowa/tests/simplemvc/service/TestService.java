package net.gloowa.tests.simplemvc.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestService {

	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/asdf")
	public String asdf() {
		return "asdf";
	}
	
	
}
