package com.cjgmj.dao.dao;

import java.util.ArrayList;
import java.util.List;

import com.cjgmj.dao.model.Persona;

public class PersonaDAOImpl implements PersonaDAO {

	public List<Persona> listarTodos() {
		List<Persona> lista = new ArrayList<Persona>();
		Persona per = new Persona();
		per.setId(1);
		per.setNombre("Joe");

		lista.add(per);

		per = new Persona();
		per.setId(2);
		per.setNombre("Linus");

		lista.add(per);

		return lista;
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

}
