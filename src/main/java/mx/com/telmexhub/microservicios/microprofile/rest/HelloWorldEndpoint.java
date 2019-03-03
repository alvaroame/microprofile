package mx.com.telmexhub.microservicios.microprofile.rest;


import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.ArrayList;

@Path("/task")
public class HelloWorldEndpoint {

	@GET
	@Produces("application/json")
	public List<Task> doGet() {
		Task t1 = new Task();
		t1.setId(1);
		t1.setDescripcion("Ingresar a Thortail para descargar el proyecto");

		Task t2 = new Task();
		t2.setId(2);
		t2.setDescripcion("Agregar la dependencia JAX-RS");

		List<Task> lista = new ArrayList<>();
		lista.add(t1);
		lista.add(t2);
		return lista;
	}

	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postTaskRecord(Task task){
		System.out.println(task.toString());
		return Response.status(201).entity(task).build();
	}
}
