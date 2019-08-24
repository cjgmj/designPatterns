package com.cjgmj.observer.observer;

public class LibraObservador extends Observador {

	private double valorCambio = 0.92;

	public LibraObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Libra: " + (sujeto.getEstado() * valorCambio));
	}
}
