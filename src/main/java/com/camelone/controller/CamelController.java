package com.camelone.controller;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CamelController {

	@Autowired
	ProducerTemplate producerTemplate;

	@RequestMapping(value = "/")
	public void sendWithCamel() {
		this.producerTemplate.sendBody("direct:firstRoute", "Called using spring boot rest controller");
	}
}
