package com.cjgmj.singleton.model;

public class Conexion {

	private static Conexion instancia;

	// Para evitar instancias mediante "new" se pone el constructor privado
	private Conexion() {
	}

	// Solo se va a poder obtener la instancia por este método
	public static Conexion getInstancia() {
		if (instancia == null) {
			instancia = new Conexion();
		}
		return instancia;
	}

	// Métodos de prueba
	public void conectar() {
		System.out.println("Conectado a la base de datos");
	}

	public void desconectar() {
		System.out.println("Desconectado a la base de datos");
	}

}
