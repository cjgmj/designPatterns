package com.cjgmj.strategy;

import com.cjgmj.strategy.strategy.AntivirusAvanzado;
import com.cjgmj.strategy.strategy.Contexto;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Contexto contexto = new Contexto(new AntivirusAvanzado());
		contexto.ejecutar();
	}
}
