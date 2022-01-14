package ie.nuig.cs.ct545rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@Path("/hello")
public class HelloName {
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello World!";
	}

	@GET
	@Path("/name/{value}")
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello(@PathParam("value") String value) {
		return "Hello " + value + "!";
	}
	
}
