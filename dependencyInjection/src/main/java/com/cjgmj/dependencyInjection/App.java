package com.cjgmj.dependencyInjection;

import com.cjgmj.dependencyInjection.dao.ConexionMySQL;
import com.cjgmj.dependencyInjection.dao.ConexionPostgre;
import com.cjgmj.dependencyInjection.dao.IConexion;
import com.cjgmj.dependencyInjection.dao.PersonaDAO;
import com.cjgmj.dependencyInjection.dao.PersonaDAOImpl;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		IConexion cx1 = new ConexionMySQL("root", "root", "localhost");
		IConexion cx2 = new ConexionPostgre("root", "root", "localhost");

		PersonaDAO dao = new PersonaDAOImpl();
		dao.setConexion(cx1);

		dao.listarTodos();
	}
}
