package ie.nuig.cs.ct545rest;

import java.util.ArrayList;

import jakarta.inject.Singleton;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;
import jakarta.ws.rs.core.Response.Status;


/**
 * EmployeeService.java is the JAX-RS resource class 
 * that will handle all incoming HTTP requests. 
 * Note that this class contains three different Java methods, 
 * that are available at different URLs:
 * @author jiarongli
 *
 */

@jakarta.ws.rs.Path("/employees")
@Singleton
public class EmployeeService {

	Employees list;
	
	public EmployeeService() {
		list = new Employees();
		list.setEmployeeList(new ArrayList<Employee>());
		list.getEmployeeList().add(new Employee(1, "Joe Smith"));
		list.getEmployeeList().add(new Employee(2, "Jane Doe"));
		list.getEmployeeList().add(new Employee(3, "Jack White"));
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employees getAllEmployees() 
	{
		return list;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Employee addEmployee(Employee e) 
	{
		list.getEmployeeList().add(e);
		return e;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{id}")
	public Response getEmployee(@PathParam("id") int id) 
	{
		for(Employee e : list.getEmployeeList()) {
			if(e.getId() == id) {
				return Response.ok(e).build();
			}
		}		
		return Response.status(Status.NOT_FOUND).build();
	}
	
}  
