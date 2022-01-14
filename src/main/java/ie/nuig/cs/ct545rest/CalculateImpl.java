package ie.nuig.cs.ct545rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/calculateimpl")
public class CalculateImpl implements CalculateInt{

	@GET
	@Path("/add/{value1}/{value2}")
	@Produces(MediaType.TEXT_HTML)
	public Response calcAddTwoValues(@PathParam("value1")  double value1, @PathParam("value2")  double value2) {
		double answer = value1 + value2;
		String msg = String.format("calcAddTwoValues==> value1: %10.4f, value2: %10.4f, answer: %10.4f", value1, value2, answer);    
		return Response.status(200).entity(msg).build();
	}

	@GET
	@Path("/subtract/{value1}/{value2}")
	@Produces(MediaType.TEXT_HTML)
	public Response calcSubTwoValues(@PathParam("value1")  double value1, @PathParam("value2")  double value2) {
		double answer = value1 - value2;
		String msg = String.format("calcSubTwoValues==> value1: %10.4f, value2: %10.4f, answer: %10.4f", value1, value2, answer);    
		return Response.status(200).entity(msg).build();
	}

	@GET
	@Path("/squareroot/{value}")
	@Produces(MediaType.TEXT_HTML)
	public Response calcSqrtHTML(@PathParam("value") double value) {
		double answer = Math.sqrt(value);
		String msg = String.format("calcSqrt==> value: %f, answer: %10.4f", value, answer);    
		return Response.status(200).entity(msg).build();
	}

}
