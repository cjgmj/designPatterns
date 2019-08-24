package com.cjgmj.abstractFactory.inter;

public interface AbstractFactory {

	IConexionBD getBD(String motor);

	IConexionREST getREST(String area);

}
