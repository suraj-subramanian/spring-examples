package com.jpm.jaxws.provider;
import javax.xml.ws.Endpoint;

import com.jpm.jaxws.Greeting;
import com.jpm.jaxws.GreetingImpl;
//Endpoint com.syntel.jaxws.publisher
public class GreetingPublisher{
 
	public static void main(String[] args) {
		Greeting g1 = new GreetingImpl();
	   Endpoint.publish("http://localhost:5555/ws/greet", g1);
	   System.out.println("Greeting Service Published....");
    }
 
}//GreetingImplService
//localhost:5555/ws/greet?wsdl
