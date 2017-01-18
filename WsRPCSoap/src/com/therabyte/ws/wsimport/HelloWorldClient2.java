package com.therabyte.ws.wsimport;

public class HelloWorldClient2{

	public static void main(String[] args) {

		HelloWorldImplService helloService = new HelloWorldImplService();
		HelloWorld hello = helloService.getHelloWorldImplPort();

		System.out.println(hello.getHelloWorldAsString("Whats App Nigga"));

    }

}