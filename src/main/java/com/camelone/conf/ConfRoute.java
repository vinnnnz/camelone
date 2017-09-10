package com.camelone.conf;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.camelone.processor.OneProcessor;

@Component
public class ConfRoute extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("direct:firstRoute")
		.doTry()
		.process(new OneProcessor())
		.doCatch(Exception.class)
		.log(exceptionMessage().toString())
		.doFinally()
		.end()
		.log("Camel Body: ${body}");
	}
}
