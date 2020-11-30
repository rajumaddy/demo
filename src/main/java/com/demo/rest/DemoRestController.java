package com.demo.rest;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.response.DemoResponse;
import com.demo.service.DemoResponseService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class DemoRestController {

	
	private final DemoResponseService responseService;
	
	private final DemoResponse response;
	
	@GetMapping(path="/demo", produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<DemoResponse> demo() {
		return ResponseEntity.ok(response);
	}
}
