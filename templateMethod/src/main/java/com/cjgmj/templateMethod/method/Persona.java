package com.cjgmj.templateMethod.method;

public abstract class Persona {

	private String nombre;
	private String DNI;

	public String identificate() {
		String frase = "Me identifico con: ";
		frase += getTipoId();
		frase += ". El número es: ";
		frase += getIdentificacion();

		return frase;
	}

	protected abstract String getIdentificacion();

	protected abstract String getTipoId();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDNI() {
		return DNI;
	}

	public void setDNI(String dNI) {
		DNI = dNI;
	}

}
