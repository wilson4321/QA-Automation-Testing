package com.sophossolutions.models;

public class UserCredentials {
	
	String usuarios;
	String contraseña;
	public UserCredentials(String usuarios, String contraseña) {
		super();
		this.usuarios = usuarios;
		this.contraseña = contraseña;
	}
	public String getUsuarios() {
		return usuarios;
	}
	public void setUsuarios(String usuarios) {
		this.usuarios = usuarios;
	}
	public String getContraseña() {
		return contraseña;
	}
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return usuarios+contraseña;
	}
	
	

}
