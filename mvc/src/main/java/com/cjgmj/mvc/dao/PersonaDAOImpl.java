package com.cjgmj.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import com.cjgmj.mvc.model.Persona;

public class PersonaDAOImpl implements PersonaDAO {

	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<Persona>();
		Persona per = new Persona();
		per.setId(1);
		per.setNombre("Joe");
		per.setEdad(30);

		lista.add(per);

		per = new Persona();
		per.setId(2);
		per.setNombre("Linus");
		per.setEdad(42);

		lista.add(per);

		return lista;
	}
}
