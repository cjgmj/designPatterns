package com.cjgmj.abstractFactory;

import com.cjgmj.abstractFactory.inter.AbstractFactory;
import com.cjgmj.abstractFactory.inter.IConexionBD;
import com.cjgmj.abstractFactory.inter.IConexionREST;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractFactory factoryBD = FactoryProductor.getFactory("BD");
		IConexionBD cxBD1 = factoryBD.getBD("MYSQL");

		cxBD1.conectar();

		AbstractFactory factoryREST = FactoryProductor.getFactory("REST");
		IConexionREST cxRS1 = factoryREST.getREST("COMPRAS");

		cxRS1.leerURL("https://www.google.es/");
	}
}
