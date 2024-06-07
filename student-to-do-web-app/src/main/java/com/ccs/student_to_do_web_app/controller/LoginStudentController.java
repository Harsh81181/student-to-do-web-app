package com.ccs.student_to_do_web_app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccs.student_to_do_web_app.dto.Student;
import com.ccs.student_to_do_web_app.service.ToDoWebAppService;
@WebServlet(value = "/Login")
public class LoginStudentController extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("sid"));
		String spswrd=req.getParameter("spswrd");
		PrintWriter pw=resp.getWriter();
		ToDoWebAppService service= new ToDoWebAppService();
		Student st=service.getStudentByIdService(id, spswrd);
		RequestDispatcher rd=null;
		if(st!=null) {
			req.setAttribute("student",st.getSid());
			rd= req.getRequestDispatcher("StudentHomePage.jsp");
		}
		else {
			pw.write("<Html><body><center><h3>Given Id/Password is wrong.</h3></center</body></html>");
			rd= req.getRequestDispatcher("Home.jsp");
		}
		
		  rd.include(req, resp);
	}

}
