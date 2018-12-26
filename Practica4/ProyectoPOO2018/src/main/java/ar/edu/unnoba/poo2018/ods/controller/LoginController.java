package ar.edu.unnoba.poo2018.ods.controller;

import java.io.IOException;
//import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginController extends HttpServlet {

    private static final long serialVersionUID = 1L;

    public LoginController() {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");
        //PrintWriter out = resp.getWriter();

        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        if (Validate.checkUser(email, pass)) {

            RequestDispatcher rs = req.getRequestDispatcher("welcome.jsp");
            rs.forward(req, resp);

        } else {

            resp.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            RequestDispatcher rs = req.getRequestDispatcher("error.jsp");
            rs.include(req, resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp); //Llamada al metodo DoPost
    }
}
