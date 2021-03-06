package org.example.controllers.departamento;

import org.example.models.departamento.Departamento;
import org.example.models.departamento.DepartamentoGateway;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CadastraDepartamentosServlet extends HttpServlet {

    static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            DepartamentoGateway dg = new DepartamentoGateway();
            List<Departamento> departamentos = dg.getAll();
            request.setAttribute("departamentos", departamentos);
            request.getRequestDispatcher("/WEB-INF/views/departamento/cadastra.jsp").forward(request, response);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}