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
@WebServlet(value = "/RegisterStudent")
public class RegisterStudentController extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	int sid=Integer.parseInt(req.getParameter("sid"));
	String sname=req.getParameter("sname");
	String semail=req.getParameter("semail");
	String spswrd=req.getParameter("spswrd");
	String sgender=req.getParameter("gender");
	
	PrintWriter pw=resp.getWriter();
	ToDoWebAppService service=new ToDoWebAppService();
	Student st=	service.saveStudentService(new Student(sid, sname, semail, spswrd, sgender));
	if(st!=null) {
		pw.write("<Html><body><center><h3>Registered Successfully</h3></center</body></html>");
	}
	else {
		pw.write("<Html><body><center><h3>Some Error occurs</h3></center</body></html>");
	}
	RequestDispatcher rd= req.getRequestDispatcher("Student-Register.jsp");
	  rd.include(req, resp);
}
}
