package com.cjgmj.templateMethod.method;

public class Cliente extends Persona {

	private int numeroDeCliente;

	public Cliente(int numeroDeCliente) {
		this.numeroDeCliente = numeroDeCliente;
	}

	@Override
	protected String getIdentificacion() {
		return String.valueOf(numeroDeCliente);
	}

	@Override
	protected String getTipoId() {
		return "número de cliente";
	}

	public int getNumeroDeCliente() {
		return numeroDeCliente;
	}

	public void setNumeroDeCliente(int numeroDeCliente) {
		this.numeroDeCliente = numeroDeCliente;
	}

}
