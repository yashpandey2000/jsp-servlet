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

@WebServlet("/Registration")

public class registration extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		try {

			

			response.setContentType("text/html");
			String fullname = request.getParameter("fullname");
			String email = request.getParameter("emailid");
			String contact = request.getParameter("contact");
			String password = request.getParameter("password");
			String cp = request.getParameter("confirmpassword");

			regisbean user = new regisbean();

			user.setFullname(fullname);
			user.setEmailid(email);
			user.setContact(contact);
			user.setPassword(password);
			user.setConfirmpassword(cp);

			regismodel model = new regismodel();

			model.register(user);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

//		PrintWriter out = response.getWriter();
//		
//		out.println("data has been saved successfuly");
//		
//		out.close();

	}

}
