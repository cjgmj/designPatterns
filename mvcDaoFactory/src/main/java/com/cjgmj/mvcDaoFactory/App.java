package com.cjgmj.mvcDaoFactory;

import com.cjgmj.mvcDaoFactory.controller.PersonaController;
import com.cjgmj.mvcDaoFactory.model.Persona;

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
