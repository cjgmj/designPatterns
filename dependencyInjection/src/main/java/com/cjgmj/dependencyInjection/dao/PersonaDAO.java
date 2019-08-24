package com.cjgmj.dependencyInjection.dao;

import com.cjgmj.dependencyInjection.model.Persona;

public interface PersonaDAO extends CRUD<Persona> {

	void mostrarNombre();

	void setConexion(IConexion conexion);

}
