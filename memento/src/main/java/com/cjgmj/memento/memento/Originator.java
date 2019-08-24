package com.cjgmj.memento.memento;

public class Originator {

	private Juego estado;

	public Juego getEstado() {
		return estado;
	}

	public void setEstado(Juego estado) {
		this.estado = estado;
	}

	public Memento guardar() {
		return new Memento(this.estado);
	}

	public void restaurar(Memento m) {
		this.estado = m.getEstado();
	}

}
