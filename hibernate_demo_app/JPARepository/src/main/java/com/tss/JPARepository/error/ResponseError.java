package com.tss.JPARepository.error;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class ResponseError {

	private int status;
	private long timeStamp;
	private String message;
	
}
