package ie.nuig.cs.ct545rest;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

interface CalculateInt {
	@GET
	@Path("/add/{value1}/{value2}")
	@Produces(MediaType.TEXT_HTML)
	public Response calcAddTwoValues(@PathParam("value1")  double value1, @PathParam("value2")  double value2);

	@GET
	@Path("/subtract/{value1}/{value2}")
	@Produces(MediaType.TEXT_HTML)
	public Response calcSubTwoValues(@PathParam("value1")  double value1, @PathParam("value2")  double value2);

	@GET
	@Path("/squareroot/{value}")
	@Produces(MediaType.TEXT_HTML)
	public Response calcSqrtHTML(@PathParam("value") double value);
}
