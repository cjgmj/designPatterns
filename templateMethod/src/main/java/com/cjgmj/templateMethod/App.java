package com.cjgmj.templateMethod;

import com.cjgmj.templateMethod.method.Cliente;
import com.cjgmj.templateMethod.method.Empleado;
import com.cjgmj.templateMethod.method.Persona;
import com.cjgmj.templateMethod.method.Socio;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Persona p = new Cliente(12121);
		System.out.println("El cliente dice: ");
		System.out.println(p.identificate());

		p = new Empleado("AD 41252");
		System.out.println("El empleado dice: ");
		System.out.println(p.identificate());

		p = new Socio(46232);
		System.out.println("El socio dice: ");
		System.out.println(p.identificate());
	}
}
