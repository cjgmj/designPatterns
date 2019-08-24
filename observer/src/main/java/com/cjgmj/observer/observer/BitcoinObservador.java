package com.cjgmj.observer.observer;

public class BitcoinObservador extends Observador {

	private double valorCambio = 0.00011;

	public BitcoinObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Bitcoin: " + (sujeto.getEstado() * valorCambio));
	}
}
