package com.cjgmj.facade;

import com.cjgmj.facade.facade.CheckFacade;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		CheckFacade cli1 = new CheckFacade();
		cli1.buscar("24/08/2019", "27/08/2019", "Sevilla", "Valencia");

		CheckFacade cli2 = new CheckFacade();
		cli2.buscar("01/09/2019", "12/09/2019", "Murcia", "Palencia");
	}
}
