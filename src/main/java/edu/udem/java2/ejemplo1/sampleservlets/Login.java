package edu.udem.java2.ejemplo1.sampleservlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.udem.java2.ejemplo1.vo.Persona;

import java.util.HashMap;
import java.util.Map;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;


@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 Map<String, Persona> usersMap;

    
    public Login() {
        super();
    }

	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init();
		
		usersMap = new HashMap<>();
		usersMap.put("tstark", new Persona("Tony", "Stark", "tstark", "1234"));
		usersMap.put("srogers", new Persona("Steven", "Rogers", "srogers", "1234"));
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String usuario = request.getParameter("login");
		String password = request.getParameter("pwd");
		
		if(usersMap.get(usuario) != null && usersMap.get(usuario).getPassword().equals(password)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome.jsp");
			
			request.setAttribute("message", "Bienvenido "+  usersMap.get(usuario).getNombre() + " " + usersMap.get(usuario).getApellido());

			dispatcher.forward(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("/login.jsp");
			dispatcher.forward(request, response);
		}
	}
}
