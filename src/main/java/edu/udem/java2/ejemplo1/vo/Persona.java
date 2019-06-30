package edu.udem.java2.ejemplo1.vo;

public class Persona {
	private String nombre;
	private String apellido;
	private String usuario;
	private String password;
	
	public Persona() {
		super();
	}
	
	public Persona(String nombre, String apellido, String usuario, String password) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.usuario = usuario;
		this.password = password;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
