package com.demo.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DemoResponse {

	@Getter
	@Setter
	private int status;
	
	@Getter
	@Setter
	private String message;
}
