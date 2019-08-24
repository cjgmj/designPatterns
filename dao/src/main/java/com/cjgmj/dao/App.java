package com.cjgmj.dao;

import com.cjgmj.dao.dao.CRUD;
import com.cjgmj.dao.dao.PersonaDAOImpl;
import com.cjgmj.dao.model.Persona;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		CRUD<Persona> dao = new PersonaDAOImpl();

		for (Persona persona : dao.listarTodos()) {
			System.out.println(persona.getNombre());
		}

		Persona per = new Persona();
		per.setNombre("John");
		dao.registrar(per);
	}
}
