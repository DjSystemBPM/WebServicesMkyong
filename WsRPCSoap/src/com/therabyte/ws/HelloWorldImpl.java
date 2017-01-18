package com.therabyte.ws;

import javax.jws.WebService;

/**
 * Implementacion del Servicio Hola Mundo
 * @author acuevas
 */
@WebService(endpointInterface = "com.therabyte.ws.HelloWorld")
public class HelloWorldImpl implements HelloWorld{

	/**
	 * @param = name
	 */
	@Override
	public String getHelloWorldAsString(String name) {
		return "Hello World JAX-WS " + name;
	}

}