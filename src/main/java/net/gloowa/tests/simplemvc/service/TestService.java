package net.gloowa.tests.simplemvc.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class TestService {

	private class TestBean {
		public String name;
		public int value;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/asdf")
	public String asdf() {
		TestBean tb = new TestBean();
		tb.name = "ASDF";
		tb.value = 69;
		
		ObjectMapper om = new ObjectMapper();
		
		String result = null;
		try {
			result = om.writeValueAsString(tb);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			try {
				result = om.writeValueAsString(e);
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
				result = e1.getMessage();
			}
		} 
		
		return result;
		
	}
	
	
}
