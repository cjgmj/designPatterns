package com.cjgmj.factory;

import com.cjgmj.factory.inter.IConexion;
import com.cjgmj.factory.inter.impl.ConexionMySQL;
import com.cjgmj.factory.inter.impl.ConexionOracle;
import com.cjgmj.factory.inter.impl.ConexionPostgreSQL;
import com.cjgmj.factory.inter.impl.ConexionSQLServer;
import com.cjgmj.factory.inter.impl.ConexionVacia;

public class ConexionFactory {

	public IConexion getConexion(String motor) {
		if (motor == null) {
			return new ConexionVacia();
		}

		if ("MYSQL".equalsIgnoreCase(motor)) {
			return new ConexionMySQL();
		} else if ("ORACLE".equalsIgnoreCase(motor)) {
			return new ConexionOracle();
		} else if ("POSTGRE".equalsIgnoreCase(motor)) {
			return new ConexionPostgreSQL();
		} else if ("SQL".equalsIgnoreCase(motor)) {
			return new ConexionSQLServer();
		}

		return new ConexionVacia();
	}

}
