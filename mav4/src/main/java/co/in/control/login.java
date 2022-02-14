package co.in.control;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import co.in.bean.regisbean;
import co.in.model.regismodel;
@WebServlet("/login")

public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		try {	
	
			response.setContentType("text/html");
		
	String login=	request.getParameter("userid");
	String pwd=request.getParameter("password");
	String id = request.getParameter("id");
	
	
	
	regisbean bean = new regisbean();
	
	bean.setId("1");
	
	regismodel model = new regismodel();
	

	model.register(bean);
} catch (ClassNotFoundException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
} catch (SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	
	
	
		PrintWriter out = response.getWriter();
		
		out.print("login successful");
		
		out.close();
	}

}
