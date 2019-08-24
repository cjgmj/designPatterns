package com.cjgmj.command.commands;

public class DepositarImpl implements IOperacion {

	private Cuenta cuenta;
	private double monto;

	public DepositarImpl(Cuenta cuenta, double monto) {
		this.cuenta = cuenta;
		this.monto = monto;
	}

	public void execute() {
		this.cuenta.depositar(this.monto);
	}

}
