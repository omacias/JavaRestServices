package com.service.rest;

import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class HelloServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 6022114461790281582L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		resp.setContentType("application/hal+json;charset=UTF-8");
		resp.getWriter().append("{\"msg\": \"Hello World\"}");
	}
}
