package com.cjgmj.proxy.inter.impl;

import com.cjgmj.proxy.inter.ICuenta;
import com.cjgmj.proxy.model.Cuenta;

public class CuentaBancoAImpl implements ICuenta {

	public Cuenta retirarDinero(Cuenta cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() - monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	public Cuenta depositarDinero(Cuenta cuenta, double monto) {
		double saldoActual = cuenta.getSaldoInicial() + monto;
		cuenta.setSaldoInicial(saldoActual);
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
		return cuenta;
	}

	public void mostrarSaldo(Cuenta cuenta) {
		System.out.println("Saldo actual: " + cuenta.getSaldoInicial());
	}

}
