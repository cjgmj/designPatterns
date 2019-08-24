package com.cjgmj.strategy.strategy;

public abstract class AnalisisAvanzado implements IEstrategia {

	public void analizar() {
		iniciar();
		analizarMemoria();
		analizarKeyLoggers();
		analizarRootKits();
		descomprimirZip();
		detener();
	}

	abstract void iniciar();

	abstract void analizarMemoria();

	abstract void analizarKeyLoggers();

	abstract void analizarRootKits();

	abstract void descomprimirZip();

	abstract void detener();

}
