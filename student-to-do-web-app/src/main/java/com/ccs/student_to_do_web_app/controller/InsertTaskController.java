package com.ccs.student_to_do_web_app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccs.student_to_do_web_app.dto.Task;
import com.ccs.student_to_do_web_app.service.ToDoWebAppService;
@WebServlet(value = "/AddTask")
public class InsertTaskController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ToDoWebAppService service=new ToDoWebAppService();
	PrintWriter pw=resp.getWriter();
	RequestDispatcher rd=null;
	if(service.saveTaskService(new Task(0,req.getParameter("tname"),
								LocalDate.parse(req.getParameter("tdate")),
								req.getParameter("tinfo"),
								Integer.parseInt(req.getParameter("sid"))))!=null) {
		pw.write("<html><body><center><h2>Task added successfully.</h2></center></body></html>");
		rd=req.getRequestDispatcher("StudentHomePage.jsp");
	}
	else {
		pw.write("<html><body><center><h2>Something wrong happens.</h2></center></body></html>");
		rd=req.getRequestDispatcher("TAsk.jsp");
	}
	req.setAttribute("student", req.getParameter("sid"));
	rd.include(req, resp);
}
}
