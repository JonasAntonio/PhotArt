/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Avaliacao;

/**
 *
 * @author jonas
 */
@WebServlet("/adicionar")
public class AdicionarAvaliacao extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher disp = req.getRequestDispatcher("/WEB-INF/views/add-comment.jsp");
        disp.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String titulo = (String) req.getParameter("titulo");
        String usuario = (String) req.getParameter("usuario");
        String texto = (String) req.getParameter("texto");
        int nota = (int) Integer.parseInt(req.getParameter("nota"));

        Avaliacao avaliacao = new Avaliacao(titulo, usuario, texto, nota);

        HttpSession session = req.getSession(true);
        List<Avaliacao> avaliacoes = (List<Avaliacao>) session.getAttribute("avaliacoes");
        avaliacoes.add(avaliacao);

        double media = 0;

        for (Avaliacao a : avaliacoes) {
            media += a.getNota() / (double) avaliacoes.size();
        }

        session.setAttribute("media", media);

        RequestDispatcher disp = req.getRequestDispatcher("/WEB-INF/views/index.jsp");
        disp.forward(req, resp);
    }

}
