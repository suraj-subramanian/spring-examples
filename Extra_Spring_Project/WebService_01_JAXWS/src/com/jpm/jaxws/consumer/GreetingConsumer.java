/**
 * 
 */
package com.jpm.jaxws.consumer;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

import com.jpm.jaxws.Greeting;
/**
 * @author Smita B Kumar
 *
 */
public class GreetingConsumer {
	public static void main(String[] args) throws MalformedURLException {
		URL wsdl = new URL("http://localhost:5555/ws/greet?wsdl");
		QName endPointName = 
			        new QName("http://jaxws.jpm.com/", 
			        		"GreetingImplService"); 
	    Service service = Service.create(wsdl, endPointName);
		//1st argument service URL, refer to wsdl document above
	   //2nd argument is service name, refer to wsdl document above
	  
        Greeting greetObj = service.getPort(Greeting.class);
      //proxy object for published service by passing wsdl  and Qname
        //greetingService object 
        
        System.out.println(greetObj.getGreetingAsString("Smita"));
 //calling the actual method
	
	}
}








