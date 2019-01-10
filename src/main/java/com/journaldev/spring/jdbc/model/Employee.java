package com.journaldev.spring.jdbc.model;

import java.io.Serializable;

public class Employee implements Serializable{

	private static final long serialVersionUID = -7788619177798333712L;
	
	private int id;
	private String usuario;
	private String contrasena;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getContrasena() {
		return contrasena;
	}
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	
	

	
	
}
