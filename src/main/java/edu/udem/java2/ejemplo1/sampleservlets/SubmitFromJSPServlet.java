package edu.udem.java2.ejemplo1.sampleservlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SubmitFromJSPServlet
 */
@WebServlet("/SubmitFromJSPServlet")
public class SubmitFromJSPServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
    public SubmitFromJSPServlet() {
        super();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("message", "Hello!!" + request.getParameter("fName")+ " "+request.getParameter("lName") );
        RequestDispatcher dispacher = request.getRequestDispatcher("/welcome.jsp");
        dispacher.forward(request, response);
    }

}
