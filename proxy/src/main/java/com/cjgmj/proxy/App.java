package com.cjgmj.proxy;

import com.cjgmj.proxy.inter.ICuenta;
import com.cjgmj.proxy.inter.impl.CuentaBancoBImpl;
import com.cjgmj.proxy.model.Cuenta;
import com.cjgmj.proxy.proxy.CuentaProxy;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "John", 100);

		ICuenta cuentaProxy = new CuentaProxy(new CuentaBancoBImpl());
		cuentaProxy.mostrarSaldo(c);
		c = cuentaProxy.depositarDinero(c, 50);
		c = cuentaProxy.retirarDinero(c, 20);
		cuentaProxy.mostrarSaldo(c);
	}
}
