package com.cjgmj.dependencyInjection.dao;

public class ConexionPostgre implements IConexion {

	private String usuario;
	private String clave;
	private String host;

	public ConexionPostgre(String usuario, String clave, String host) {
		this.usuario = usuario;
		this.clave = clave;
		this.host = host;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void conectar() {
		System.out.println("Conectando a PostgreSQL");
	}

}
