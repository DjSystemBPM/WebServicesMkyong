package com.therabyte.client;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import com.therabyte.ws.HelloWorld;

public class HelloWorldClient{

	public static void main(String[] args) throws Exception {

	URL url = new URL("http://localhost:9999/ws/hello?wsdl");
        QName qname = new QName("http://ws.therabyte.com/", "HelloWorldImplService");

        Service service = Service.create(url, qname);

        HelloWorld hello = service.getPort(HelloWorld.class);

         System.out.println(hello.getHelloWorldAsString("Piato y Quantize"));

    }

}