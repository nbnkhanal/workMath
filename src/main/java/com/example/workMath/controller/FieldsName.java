package com.example.workMath.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.workMath.Entity.Fields;
import com.example.workMath.Repository.FieldNameRepository;
import com.example.workMath.saveName.SaveName;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class FieldsName {
	
	@Autowired
	private ObjectMapper mapper;
	
	@Autowired
	FieldNameRepository fieldNameRepository;
	
//	@RequestMapping(value = "/npb/saveName", method = RequestMethod.POST)
//	public void create(@RequestBody Fields field) {
//		fieldNameRepository.save(field);
//	}
	
	@RequestMapping(value = "/npb/saveName", method = RequestMethod.POST)
	public ResponseEntity<Object> create(@RequestBody Fields field) throws Exception{
		String result = null;
		result = mapper.writeValueAsString(fieldNameRepository.save(field));
		return SaveName.responseStripXss(result);
		
		
//		return null;
	}

}

