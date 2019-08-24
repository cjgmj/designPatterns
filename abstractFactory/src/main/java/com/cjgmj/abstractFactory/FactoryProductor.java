package com.cjgmj.abstractFactory;

import com.cjgmj.abstractFactory.inter.AbstractFactory;

public class FactoryProductor {

	public static AbstractFactory getFactory(String tipoFactory) {
		if ("BD".equals(tipoFactory)) {
			return new ConexionBDFactory();
		} else if ("REST".equalsIgnoreCase(tipoFactory)) {
			return new ConexionRESTFactory();
		}

		return null;
	}

}
