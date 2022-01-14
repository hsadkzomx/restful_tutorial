package ie.nuig.cs.ct545rest;

import jakarta.inject.Singleton;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@Path("/hellosingleton")
@Singleton
public class HelloSingleton {

	int timesCalled = 0;
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		timesCalled++;
		return "Hello World number: " + timesCalled;
	}
}