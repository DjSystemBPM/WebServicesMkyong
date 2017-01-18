package com.therabyte.ws;

import javax.jws.WebService;

//Service Implementation
@WebService(endpointInterface = "com.therabyte.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	@Override
	public String getHelloWorldAsString(String name) {
		return "Hola Mundo JAX-WS " + name;
	}

}