package com.cjgmj.factory;

import com.cjgmj.factory.inter.IConexion;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ConexionFactory factory = new ConexionFactory();

		IConexion cx1 = factory.getConexion("ORACLE");
		cx1.conectar();
		cx1.desconectar();

		IConexion cx2 = factory.getConexion("MYSQL");
		cx2.conectar();
		cx2.desconectar();

		IConexion cx3 = factory.getConexion("H2");
		cx3.conectar();
		cx3.desconectar();
	}
}
