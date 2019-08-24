package com.cjgmj.factory.inter.impl;

import com.cjgmj.factory.inter.IConexion;

public class ConexionSQLServer implements IConexion {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionSQLServer() {
		this.host = "localhost";
		this.puerto = "1433";
		this.usuario = "root";
		this.contrasena = "root";
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public String getPuerto() {
		return puerto;
	}

	public void setPuerto(String puerto) {
		this.puerto = puerto;
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

	public void conectar() {
		System.out.println("Conectado a SQLServer");
	}

	public void desconectar() {
		System.out.println("Desconectado de SQLServer");
	}

}
