package com.cjgmj.mvc;

import com.cjgmj.mvc.controller.PersonaController;
import com.cjgmj.mvc.model.Persona;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		PersonaController controller = new PersonaController();

		for (Persona persona : controller.getLista()) {
			System.out.println(persona.getNombre());
		}
	}
}
