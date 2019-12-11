package com.microservice.Clients.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

//import com.fasterxml.jackson.annotation.JsonPropertyOrder;



@Document(collection = "clients")
//@JsonPropertyOrder({"id","name","lastname","dni","numcuentaahorro","cuentacredito"})
public class Client {
	@Id
	private String id;

	@Field("name")
	private String name;

	@Field("lastname")
	private String lastName;
	
	@Field("dni")
	private String dni;
	
	@Field("numcuentaahorro")
	private String numcuentaahorro;
	
	@Field("cuentacredito")
	private String cuentacredito;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNumcuentaahorro() {
		return numcuentaahorro;
	}

	public void setNumcuentaahorro(String numcuentaahorro) {
		this.numcuentaahorro = numcuentaahorro;
	}

	public String getCuentacredito() {
		return cuentacredito;
	}

	public void setCuentacredito(String cuentacredito) {
		this.cuentacredito = cuentacredito;
	}
	
	
	

	
	
}
