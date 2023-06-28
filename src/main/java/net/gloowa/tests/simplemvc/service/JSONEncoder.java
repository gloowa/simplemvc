package net.gloowa.tests.simplemvc.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONEncoder {
	
	private static ObjectMapper mapper = new ObjectMapper();
	
	public static String toJSON(Object o) throws JsonProcessingException {
		return mapper.writeValueAsString(o);
	}

}
