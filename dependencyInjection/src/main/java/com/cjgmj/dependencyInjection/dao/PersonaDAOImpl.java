package com.cjgmj.dependencyInjection.dao;

import java.util.List;

import com.cjgmj.dependencyInjection.model.Persona;

public class PersonaDAOImpl implements PersonaDAO {

	private IConexion conexion;

	public List<Persona> listarTodos() {
		this.conexion.conectar();
		System.out.println("Listando...");
		return null;
	}

	public Persona leerPorId(int id) {
		return null;
	}

	public void registrar(Persona t) {
		System.out.println("Persona " + t.getNombre() + " registrada");

	}

	public void actualizar(Persona t) {
		System.out.println("Persona " + t.getNombre() + " actualizada");

	}

	public void eliminar(int id) {
		System.out.println("id " + id + "eliminado");
	}

	public void mostrarNombre() {
	}

	public void setConexion(IConexion conexion) {
		this.conexion = conexion;
	}

}
