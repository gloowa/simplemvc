package net.gloowa.tests.simplemvc.service;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;

@RestController
public class TestService {

	private class TestBean {
		public String name;
		public int value;
	}
	
	@RequestMapping(path = "/", produces = {MediaType.TEXT_PLAIN_VALUE})
	public String index() {
		return "index";
	}
	
	@RequestMapping(path = "/asdf", produces = {MediaType.APPLICATION_JSON_VALUE})
	public String asdf() {
		TestBean tb = new TestBean();
		tb.name = "ASDF";
		tb.value = 69;
		
		String result = null;
		try {
			result = JSONEncoder.toJSON(tb);
			throw new Exception("Fake excpetion");
		} catch (Exception e) {
			e.printStackTrace();
			try {
				result = JSONEncoder.toJSON(e);
			} catch (JsonProcessingException e1) {
				e1.printStackTrace();
				result = "{}";
			}
		} 
		
		return result;
		
	}
	
	
}
