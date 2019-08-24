package com.cjgmj.mvcDaoFactory.dao;

import java.util.ArrayList;
import java.util.List;

import com.cjgmj.mvcDaoFactory.model.Persona;

public class PersonaDAOImpl implements PersonaDAO {

	private Conexion conexion;
	private String motor;

	public PersonaDAOImpl(String motor) {
		this.motor = motor;

		if (motor.equals("MYSQL")) {
			conexion = new MySQL();
		} else if (motor.equals("POSTGRESQL")) {
			conexion = new PostgreSQL();
		}
		conexion.conectar();
	}

	public List<Persona> listar() {
		List<Persona> lista = new ArrayList<Persona>();

		if (motor.equals("MYSQL")) {
			Persona per = new Persona();
			per.setId(1);
			per.setNombre("Janie");
			per.setEdad(32);
			lista.add(per);

			per = new Persona();
			per.setId(2);
			per.setNombre("Phillip");
			per.setEdad(45);
			lista.add(per);

		} else if (motor.equals("POSTGRESQL")) {
			Persona per = new Persona();
			per.setId(1);
			per.setNombre("Richard");
			per.setEdad(61);
			lista.add(per);

			per = new Persona();
			per.setId(2);
			per.setNombre("Ralph");
			per.setEdad(19);
			lista.add(per);

		}

		return lista;
	}

}
