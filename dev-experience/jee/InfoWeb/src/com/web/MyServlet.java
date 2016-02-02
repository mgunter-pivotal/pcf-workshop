package com.web;

import java.io.IOException;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.beans.MyInfoLocal;

/**
 * Servlet implementation class MyServlet
 */
@WebServlet("/info")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@EJB
	private MyInfoLocal myInfo;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MyServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		execute(request, response);
	}

	private void execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
//		ServletOutputStream out = response.getOutputStream();
//		response.setContentType("text/plain");
//		out.println("LocalBean EJB");
//        out.println("@EJB=" + myInfo);
		
		request.setAttribute("infoEjb", myInfo);
		request.setAttribute("printInfo", myInfo.getMyInfo());
		request.getRequestDispatcher("/infoEjb3.jsp").forward(request,
				response);
	}
}
