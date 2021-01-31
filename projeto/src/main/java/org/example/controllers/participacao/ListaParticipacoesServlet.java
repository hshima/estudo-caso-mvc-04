package org.example.controllers.participacao;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.models.participacao.Participacao;
import org.example.models.participacao.ParticipacoesGateway;

import java.util.List;

public class ListaParticipacoesServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			ParticipacoesGateway pg = new ParticipacoesGateway();
			List<Participacao> participacoes = pg.getAll();
			request.setAttribute("participacoes", participacoes);
			request.getRequestDispatcher("/WEB-INF/views/participacoes/lista.jsp").forward(request, response);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}