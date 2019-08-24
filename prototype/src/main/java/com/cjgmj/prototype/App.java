package com.cjgmj.prototype;

import com.cjgmj.prototype.model.CuentaAHImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		CuentaAHImpl cuentaAhorro = new CuentaAHImpl();
		cuentaAhorro.setMonto(200);

		CuentaAHImpl cuentaAhorro2 = new CuentaAHImpl();

		CuentaAHImpl cuentaClonada = (CuentaAHImpl) cuentaAhorro.clonar();

		System.out.println(cuentaAhorro);
		System.out.println(cuentaAhorro2);
		System.out.println(cuentaClonada);
	}
}
