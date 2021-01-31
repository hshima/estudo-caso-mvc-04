package org.example.controllers.projeto;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.models.projeto.Projeto;
import org.example.models.projeto.ProjetosGateway;

import java.util.List;

public class ListaProjetosServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ProjetosGateway pg = new ProjetosGateway();
			List<Projeto> projetos = pg.getAll();
			request.setAttribute("projetos", projetos);
			request.getRequestDispatcher("/WEB-INF/views/projetos/lista.jsp").forward(request, response);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}