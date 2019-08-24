package com.cjgmj.command;

import com.cjgmj.command.commands.Cuenta;
import com.cjgmj.command.commands.DepositarImpl;
import com.cjgmj.command.commands.Invoker;
import com.cjgmj.command.commands.RetirarImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Cuenta cuenta = new Cuenta(1, 200);

		DepositarImpl opDepositar = new DepositarImpl(cuenta, 100);
		RetirarImpl opRetirar = new RetirarImpl(cuenta, 50);

		Invoker ivk = new Invoker();
		ivk.recibirOperacion(opDepositar);
		ivk.recibirOperacion(opRetirar);

		ivk.realizarOperaciones();
	}
}
