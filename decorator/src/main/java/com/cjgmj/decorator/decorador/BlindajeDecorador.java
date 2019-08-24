package com.cjgmj.decorator.decorador;

import com.cjgmj.decorator.interf.ICuentaBancaria;
import com.cjgmj.decorator.model.Cuenta;

public class BlindajeDecorador extends CuentaDecorador {

	public BlindajeDecorador(ICuentaBancaria cuentaDecorada) {
		super(cuentaDecorada);
	}

	@Override
	public void abrirCuenta(Cuenta c) {
		cuentaDecorada.abrirCuenta(c);
		agregarSeguridad(c);
	}

	public void agregarSeguridad(Cuenta c) {
		System.out.println("Se agregó seguridad a la cuenta del cliente " + c.getCliente());
	}

}
