package com.cjgmj.abstractFactory.inter.impl;

import com.cjgmj.abstractFactory.inter.IConexionREST;

public class ConexionRESTCompras implements IConexionREST {

	public void leerURL(String url) {
		System.out.println("Conectándose a " + url);
	}

}
