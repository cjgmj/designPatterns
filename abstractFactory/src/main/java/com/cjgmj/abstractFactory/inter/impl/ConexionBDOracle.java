package com.cjgmj.abstractFactory.inter.impl;

import com.cjgmj.abstractFactory.inter.IConexionBD;

public class ConexionBDOracle implements IConexionBD {

	private String host;
	private String puerto;
	private String usuario;
	private String contrasena;

	public ConexionBDOracle() {
		this.host = "localhost";
		this.puerto = "1521";
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
		System.out.println("Conectado a Oracle");
	}

	public void desconectar() {
		System.out.println("Desconectado de Oracle");
	}

}
