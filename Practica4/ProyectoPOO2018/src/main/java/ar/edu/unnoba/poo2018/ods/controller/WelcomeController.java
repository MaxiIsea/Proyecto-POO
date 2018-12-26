package ar.edu.unnoba.poo2018.ods.controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/welcome")
public class WelcomeController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public WelcomeController() {
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("email");

        HttpSession session = req.getSession();

        if (session == null) {

            session.invalidate();
            RequestDispatcher rs = req.getRequestDispatcher("index.jsp");
            rs.forward(req, resp);

        }
        if (session.getAttribute("email") != null && session.getAttribute("email") == "maxi") {

            RequestDispatcher rs = req.getRequestDispatcher("welcome.jsp");
            rs.include(req, resp);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp); //Llamada al metodo anterior
    }
}
