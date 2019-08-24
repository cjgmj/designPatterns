package com.cjgmj.mvcDaoFactory.controller;

import java.util.ArrayList;
import java.util.List;

import com.cjgmj.mvcDaoFactory.dao.PersonaDAOImpl;
import com.cjgmj.mvcDaoFactory.model.Persona;
import com.cjgmj.mvcDaoFactory.service.PersonaService;
import com.cjgmj.mvcDaoFactory.service.PersonaServiceImpl;

public class PersonaController {

	private List<Persona> lista;
	private PersonaService service;
	private String motor;

	public PersonaController() {
		motor = "MYSQL";
		lista = new ArrayList<Persona>();
		service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
		listar();
	}

	public void listar() {
		lista = service.listar();
	}

	public void seleccionar(String motor) {
		service = new PersonaServiceImpl(new PersonaDAOImpl(motor));
		listar();
	}

	public List<Persona> getLista() {
		return lista;
	}

	public void setLista(List<Persona> lista) {
		this.lista = lista;
	}

}
