package com.cjgmj.factory.inter.impl;

import com.cjgmj.factory.inter.IConexion;

public class ConexionVacia implements IConexion {

	public void conectar() {
		System.out.println("No se encuentra la base de datos");
	}

	public void desconectar() {
		System.out.println("No se encuentra la base de datos");
	}

}
