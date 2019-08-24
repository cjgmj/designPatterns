package com.cjgmj.mvc.controller;

import java.util.ArrayList;
import java.util.List;

import com.cjgmj.mvc.dao.PersonaDAOImpl;
import com.cjgmj.mvc.model.Persona;

public class PersonaController {

	private List<Persona> lista;
	private PersonaDAOImpl dao;

	public PersonaController() {
		lista = new ArrayList<Persona>();
		dao = new PersonaDAOImpl();
		this.listar();
	}

	public void listar() {
		lista = dao.listar();
	}

	public List<Persona> getLista() {
		return lista;
	}

	public PersonaDAOImpl getDao() {
		return dao;
	}

	public void setDao(PersonaDAOImpl dao) {
		this.dao = dao;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

}
