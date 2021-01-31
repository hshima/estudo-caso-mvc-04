package org.example.controllers.funcionario;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.models.funcionario.Funcionario;
import org.example.models.funcionario.FuncionariosGateway;

import java.util.List;

public class ListaFuncionariosServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			FuncionariosGateway fg = new FuncionariosGateway();
			List<Funcionario> funcionarios = fg.getAll();
			request.setAttribute("funcionarios", funcionarios);
			request.getRequestDispatcher("/WEB-INF/views/funcionarios/lista.jsp").forward(request, response);
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}