package mx.com.telmexhub.microservicios.microprofile.rest;

public class Task {

	private int id;
	private String descripcion;

	public Task(){
		super();
	}

	public String toString(){
		return "ID: " + id + " Descripcion: "+ descripcion;
	}

	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id=id;
	}

	public String getDescripcion(){
		return descripcion;
	}

	public void setDescripcion(String descripcion){
		this.descripcion=descripcion;
	}
}
