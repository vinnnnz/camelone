package com.camelone.processor;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class OneProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
		String bodyText = exchange.getIn().getBody(String.class);
		System.out.println("Processor: " + bodyText);
		exchange.getIn().setBody(bodyText.toUpperCase(), String.class);
		throw new Exception("Playing with fire!!!");
	}
}
