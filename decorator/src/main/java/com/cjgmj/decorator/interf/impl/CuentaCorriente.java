package com.cjgmj.decorator.interf.impl;

import com.cjgmj.decorator.interf.ICuentaBancaria;
import com.cjgmj.decorator.model.Cuenta;

public class CuentaCorriente implements ICuentaBancaria {

	public void abrirCuenta(Cuenta c) {
		System.out.println("=======================================");
		System.out.println("Se abrió una cuenta corriente");
		System.out.println("Cliente: " + c.getCliente());
	}

}
