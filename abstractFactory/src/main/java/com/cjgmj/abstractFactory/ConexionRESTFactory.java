package com.cjgmj.abstractFactory;

import com.cjgmj.abstractFactory.inter.AbstractFactory;
import com.cjgmj.abstractFactory.inter.IConexionBD;
import com.cjgmj.abstractFactory.inter.IConexionREST;
import com.cjgmj.abstractFactory.inter.impl.ConexionRESTCompras;
import com.cjgmj.abstractFactory.inter.impl.ConexionRESTNoArea;
import com.cjgmj.abstractFactory.inter.impl.ConexionRESTVentas;

public class ConexionRESTFactory implements AbstractFactory {

	public IConexionBD getBD(String motor) {
		return null;
	}

	public IConexionREST getREST(String area) {
		if (area == null) {
			return new ConexionRESTNoArea();
		}

		if ("COMPRAS".equalsIgnoreCase(area)) {
			return new ConexionRESTCompras();
		} else if ("VENTAS".equalsIgnoreCase(area)) {
			return new ConexionRESTVentas();
		}

		return new ConexionRESTNoArea();
	}

}
