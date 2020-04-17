package com.example.workMath.saveName;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.google.json.JsonSanitizer;

public class SaveName {
	
//	public static ResponseEntity<Object> responseStripXss(String value){
//		String sanitizedResp = null;
//		Object sanitizedRespData = null;
//		if(value != null) {
//			value = org.owasp.esapi.ESAPI.encoder().canonicalize(value);
//			value = value.replaceAll("\0", "");
//			value = org.jsoup.Jsoup.clean(value, org.jsoup.safety.Whitelist.none());
//			sanitizedResp = JsonSanitizer.sanitize(value).replaceAll("&amp;", "&");
//			sanitizedRespData = sanitizedResp;
//		}
//		return new ResponseEntity<>(sanitizedRespData, HttpStatus.OK);
//	}
	
	public static ResponseEntity<Object> responseStripXss(String value){
		String sanitizedResp = null;
		String sanitizedRespData = null;
		if(value != null) {
			value = org.owasp.esapi.ESAPI.encoder().canonicalize(value);
			value = value.replaceAll("\0", "");
			value = org.jsoup.Jsoup.clean(value, org.jsoup.safety.Whitelist.none());
			sanitizedResp = JsonSanitizer.sanitize(value).replaceAll("&amp;", "&");
			sanitizedResp = JsonSanitizer.sanitize(value).replaceAll("&", "");
			sanitizedResp = JsonSanitizer.sanitize(value).replaceAll("quot;", "");
			sanitizedRespData = sanitizedResp;
		}
		return new ResponseEntity<>(sanitizedRespData, HttpStatus.OK);
	}

}
