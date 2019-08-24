package com.cjgmj.abstractFactory;

import com.cjgmj.abstractFactory.inter.AbstractFactory;
import com.cjgmj.abstractFactory.inter.IConexionBD;
import com.cjgmj.abstractFactory.inter.IConexionREST;
import com.cjgmj.abstractFactory.inter.impl.ConexionBDMySQL;
import com.cjgmj.abstractFactory.inter.impl.ConexionBDOracle;
import com.cjgmj.abstractFactory.inter.impl.ConexionBDPostgreSQL;
import com.cjgmj.abstractFactory.inter.impl.ConexionBDSQLServer;
import com.cjgmj.abstractFactory.inter.impl.ConexionBDVacia;

public class ConexionBDFactory implements AbstractFactory {

	public IConexionBD getBD(String motor) {
		if (motor == null) {
			return new ConexionBDVacia();
		}

		if ("MYSQL".equalsIgnoreCase(motor)) {
			return new ConexionBDMySQL();
		} else if ("ORACLE".equalsIgnoreCase(motor)) {
			return new ConexionBDOracle();
		} else if ("POSTGRE".equalsIgnoreCase(motor)) {
			return new ConexionBDPostgreSQL();
		} else if ("SQL".equalsIgnoreCase(motor)) {
			return new ConexionBDSQLServer();
		}

		return new ConexionBDVacia();
	}

	public IConexionREST getREST(String area) {
		return null;
	}

}
