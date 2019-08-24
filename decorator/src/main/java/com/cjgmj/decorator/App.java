package com.cjgmj.decorator;

import com.cjgmj.decorator.decorador.BlindajeDecorador;
import com.cjgmj.decorator.interf.ICuentaBancaria;
import com.cjgmj.decorator.interf.impl.CuentaAhorro;
import com.cjgmj.decorator.model.Cuenta;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Cuenta c = new Cuenta(1, "John");

		ICuentaBancaria cuenta = new CuentaAhorro();
		ICuentaBancaria cuentaBlindada = new BlindajeDecorador(cuenta);

		cuentaBlindada.abrirCuenta(c);
	}
}
