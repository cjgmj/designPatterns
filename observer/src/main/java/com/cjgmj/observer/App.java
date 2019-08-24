package com.cjgmj.observer;

import com.cjgmj.observer.observer.BitcoinObservador;
import com.cjgmj.observer.observer.DolarObservador;
import com.cjgmj.observer.observer.LibraObservador;
import com.cjgmj.observer.observer.Subject;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		Subject subject = new Subject();

		new BitcoinObservador(subject);
		new DolarObservador(subject);
		new LibraObservador(subject);

		System.out.println("Si desea cambiar 10 euros obtendrá: ");
		subject.setEstado(10);
		System.out.println("Si desea cambiar 100 euros obtendrá: ");
		subject.setEstado(100);
	}
}
