package com.example.workMath.util;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class DataSanitazationUtil {

	public static ResponseEntity<Object> invalidPayloadRequest(){
		return new ResponseEntity<>("{\"code\":\"INVALID_PAYLOAD\",\"message\":\"invalid payload Request\"} ",
				HttpStatus.BAD_REQUEST);
	}

}
