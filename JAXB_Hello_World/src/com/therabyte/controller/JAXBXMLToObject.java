package com.therabyte.controller;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.therabyte.pojo.Customer;

public class JAXBXMLToObject {
	public static void main(String[] args) {

		 try {

			File file = new File("/home/acuevas/jaxB.xml");
			JAXBContext jaxbContext = JAXBContext.newInstance(Customer.class);

			Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
			Customer customer = (Customer) jaxbUnmarshaller.unmarshal(file);
			System.out.println(customer.toString());

		  } catch (JAXBException e) {
			e.printStackTrace();
		  }

		}
}
