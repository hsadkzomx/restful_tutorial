package ie.nuig.cs.ct545rest;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

@Path("/helloaccepttypes")
public class HelloAcceptTypes {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHelloPlain() {
		return "Hello World!";
	} 

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHelloHTML() {
		return "<html><body><h1>Hello World!</h1></body></html>";
	}
}