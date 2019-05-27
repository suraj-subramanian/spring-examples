package com.jpm.jaxws;//soap webservice using JAX-WS

import javax.jws.WebService;
import javax.jws.WebMethod;

import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

//Service Endpoint Interface
@WebService
@SOAPBinding(style = Style.RPC)
public interface Greeting {

	@WebMethod
	String getGreetingAsString(String name);

}
/*
 * the @WebService and @WebMethod annotations on a service endpoint
 * implementation to specify Java methods that you want to expose as Java API
 * for XML-Based Web Services (JAX-WS) web services.
 */
/*
 * JAX-WS technology enables the implementation of web services based on both
 * the standard service endpoint interface and a Provider interface. When
 * developing a JAX-WS Web service starting from existing Java classes, known as
 * the bottom-up approach, you must annotate the class with either
 * the @WebService or @WebServiceProvider annotation to initially define the
 * class as a web service.
 */