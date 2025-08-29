package com.tss.hibernate.config;

import java.beans.JavaBean;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;


public class AppConfig {

	@Bean
	ModelMapper mapper() {
		return new ModelMapper();
	}
}
