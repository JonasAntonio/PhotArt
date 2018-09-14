/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Avaliacao;
import java.io.PrintWriter;

/**
 *
 * @author jonas
 */
@WebServlet("/avaliacoes")
public class AvaliacaoController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        processRequest(req, resp);
    }

    private void processRequest(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        HttpSession session = req.getSession(true);
        List<Avaliacao> avaliacoes = (List<Avaliacao>) session.getAttribute("avaliacoes");

        if (avaliacoes == null) {
            avaliacoes = new ArrayList<>();
            session.setAttribute("avaliacoes", avaliacoes);
        }

        req.setAttribute("avaliacoes", avaliacoes);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/index.jsp");
        dispatcher.forward(req, resp);
    }

}
