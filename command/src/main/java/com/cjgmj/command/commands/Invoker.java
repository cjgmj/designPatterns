package com.cjgmj.command.commands;

import java.util.ArrayList;
import java.util.List;

public class Invoker {

	private List<IOperacion> operaciones = new ArrayList<IOperacion>();

	public void recibirOperacion(IOperacion operacion) {
		this.operaciones.add(operacion);
	}

	public void realizarOperaciones() {
		for (IOperacion operacion : this.operaciones) {
			operacion.execute();
		}

		this.operaciones.clear();
	}
}
