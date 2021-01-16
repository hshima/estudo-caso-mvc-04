package org.example.controllers.departamento;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.models.departamento.Departamento;
import org.example.models.departamento.DepartamentoGateway;

import java.util.List;

public class ListaDepartamentosServlet extends HttpServlet {
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

      try {
        DepartamentoGateway dg = new DepartamentoGateway();
        List<Departamento> departamentos = dg.getAll();
        request.setAttribute("departamentos", departamentos);
        request.getRequestDispatcher("/WEB-INF/views/departamento/lista.jsp").forward(request, response);
      } catch(Exception e) {
        System.out.println(e);
      }
      
    }
}