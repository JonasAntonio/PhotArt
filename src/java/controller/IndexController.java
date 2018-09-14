/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author jonas
 */
@WebServlet(name = "IndexController", urlPatterns = {"/index"})
public class IndexController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        if (session != null && session.getAttribute("usuario") != null) {
            RequestDispatcher dis = req.getRequestDispatcher("avaliacoes");
            dis.forward(req, resp);
        } else {
            session.setAttribute("erro", "Realize o login antes de continuar");
            RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/views/login.jsp");
            dis.forward(req, resp);
        }
    }

}
