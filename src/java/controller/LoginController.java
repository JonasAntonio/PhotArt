/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Usuario;

/**
 *
 * @author jonas
 */
@WebServlet("/login")
public class LoginController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(true);

        String email = req.getParameter("email");
        String password = req.getParameter("password");

        if (email.equals("admin") && password.equals("admin")) {
            Usuario usuario = new Usuario(email, password);
            session.setAttribute("usuario", usuario);
            RequestDispatcher dis = req.getRequestDispatcher("avaliacoes");
            dis.forward(req, resp);
        } else {
            session.setAttribute("erro", "Usuário ou senha inválidos!");
            RequestDispatcher dis = req.getRequestDispatcher("/WEB-INF/views/login.jsp");
            dis.forward(req, resp);
        }
    }

}
