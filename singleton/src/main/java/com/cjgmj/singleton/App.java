package com.cjgmj.singleton;

import com.cjgmj.singleton.model.Conexion;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Conexion c = Conexion.getInstancia();
		c.conectar();
		c.desconectar();

		boolean rpta = c instanceof Conexion;
		System.out.println(rpta);
	}
}
