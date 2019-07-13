package edu.udem.java2.ejemplo1.sampleservlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import edu.udem.java2.ejemplo1.vo.Persona;

/**
 * Servlet implementation class FirstServlet
 */
//@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try(PrintWriter out = response.getWriter()){
			out.println(Page.html);
		}catch(Exception e) {
			System.out.println("Error: " + e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		  Persona persona = new Persona();
		  persona.setNombre(request.getParameter("name"));
		  persona.setUsuario(request.getParameter("email"));
		  persona.setPassword(request.getParameter("psw"));
		  
		  String personaToJson = new Gson().toJson(persona);
		  
		  try(PrintWriter out = response.getWriter()) {
			  
			  response.setContentType("application/json");
			  response.setCharacterEncoding("UTF-8");
			  out.println(personaToJson);
			  out.flush();
			  
		  }catch(Exception e) {
			  System.out.println(e.getMessage());
		  }
	}

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
    }
    
  
}
