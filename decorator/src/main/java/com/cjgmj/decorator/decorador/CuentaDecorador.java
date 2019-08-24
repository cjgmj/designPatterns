package com.cjgmj.decorator.decorador;

import com.cjgmj.decorator.interf.ICuentaBancaria;
import com.cjgmj.decorator.model.Cuenta;

public abstract class CuentaDecorador implements ICuentaBancaria {

	protected ICuentaBancaria cuentaDecorada;

	public CuentaDecorador(ICuentaBancaria cuentaDecorada) {
		this.cuentaDecorada = cuentaDecorada;
	}

	public void abrirCuenta(Cuenta c) {
		this.cuentaDecorada.abrirCuenta(c);
	}

}
