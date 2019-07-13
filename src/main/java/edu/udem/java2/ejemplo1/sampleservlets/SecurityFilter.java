package edu.udem.java2.ejemplo1.sampleservlets;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;


//@WebFilter("/SecurityFilter")
public class SecurityFilter implements Filter {

  
    public SecurityFilter() {
    }

	public void destroy() {
	}


	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		HttpSession session = httpRequest.getSession(false);
		
		String loginURI = httpRequest.getContextPath() + "/Login";
		
		boolean isLoggedIn = (session != null && session.getAttribute("user") != null);
		boolean isLoginPage =  httpRequest.getRequestURI().endsWith("login.jsp");
		boolean isLoginRequest = httpRequest.getRequestURI().equals(loginURI);
		
		if(isLoggedIn && (isLoginPage || isLoginRequest)) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/welcome.jsp");
			dispatcher.forward(request, response);
		}else if( isLoggedIn || isLoginRequest ) {
			chain.doFilter(request, response);
		}else{
			RequestDispatcher dispatcher = request.getRequestDispatcher("login.jsp");
			dispatcher.forward(request, response);
		}
		
		
		
	}


	public void init(FilterConfig fConfig) throws ServletException {
	}

}
