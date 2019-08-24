package com.cjgmj.observer.observer;

public class DolarObservador extends Observador {

	private double valorCambio = 1.12;

	public DolarObservador(Subject sujeto) {
		this.sujeto = sujeto;
		this.sujeto.agregar(this);
	}

	@Override
	public void actualizar() {
		System.out.println("Dolar: " + (sujeto.getEstado() * valorCambio));
	}
}
