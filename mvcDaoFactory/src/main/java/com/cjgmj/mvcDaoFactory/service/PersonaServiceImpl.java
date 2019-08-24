package com.cjgmj.mvcDaoFactory.service;

import java.util.List;

import com.cjgmj.mvcDaoFactory.dao.PersonaDAO;
import com.cjgmj.mvcDaoFactory.model.Persona;

public class PersonaServiceImpl implements PersonaService {

	private PersonaDAO dao;

	public PersonaServiceImpl(PersonaDAO dao) {
		this.dao = dao;
	}

	public List<Persona> listar() {
		return dao.listar();
	}

}
