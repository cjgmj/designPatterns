package com.cjgmj.abstractFactory.inter.impl;

import com.cjgmj.abstractFactory.inter.IConexionBD;

public class ConexionBDVacia implements IConexionBD {

	public void conectar() {
		System.out.println("No se encuentra la base de datos");
	}

	public void desconectar() {
		System.out.println("No se encuentra la base de datos");
	}

}
