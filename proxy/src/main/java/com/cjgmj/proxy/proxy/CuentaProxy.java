package com.cjgmj.proxy.proxy;

import com.cjgmj.proxy.inter.ICuenta;
import com.cjgmj.proxy.inter.impl.CuentaBancoAImpl;
import com.cjgmj.proxy.model.Cuenta;

public class CuentaProxy implements ICuenta {

	private ICuenta cuentaReal;

	public CuentaProxy(ICuenta cuentaReal) {
		this.cuentaReal = cuentaReal;
	}

	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		System.out.println("----Cuenta Proxy - Retirar Dinero----");
		if (cuentaReal == null) {
			cuentaReal = new CuentaBancoAImpl();
			return cuentaReal.retirarDinero(cuenta, monto);
		}
		return cuentaReal.retirarDinero(cuenta, monto);
	}

	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		System.out.println("----Cuenta Proxy - Depositar  Dinero----");
		if (cuentaReal == null) {
			cuentaReal = new CuentaBancoAImpl();
			return cuentaReal.depositarDinero(cuenta, monto);
		}
		return cuentaReal.depositarDinero(cuenta, monto);
	}

	public void mostrarSaldo(Cuenta cuenta) {
		System.out.println("----Cuenta Proxy - Mostrar  Dinero----");
		if (cuentaReal == null) {
			cuentaReal = new CuentaBancoAImpl();
		}
		cuentaReal.mostrarSaldo(cuenta);
	}

}
