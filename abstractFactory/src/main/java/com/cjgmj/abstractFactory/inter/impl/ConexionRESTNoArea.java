package com.cjgmj.abstractFactory.inter.impl;

import com.cjgmj.abstractFactory.inter.IConexionREST;

public class ConexionRESTNoArea implements IConexionREST {

	public void leerURL(String url) {
		System.out.println("Área no elegida");
	}

}
