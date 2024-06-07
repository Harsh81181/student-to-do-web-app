package com.ccs.student_to_do_web_app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccs.student_to_do_web_app.dto.Task;
import com.ccs.student_to_do_web_app.service.ToDoWebAppService;
@WebServlet(value = "/DeleteDateTask")
public class DeleteTaskDateController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ToDoWebAppService service=new ToDoWebAppService();
	PrintWriter pw= resp.getWriter();
	int id=Integer.parseInt(req.getParameter("tid"));
	Task t=service.getTaskByIdService(id);
	if(service.deleteTaskByIdService(id)!=1) {
		pw.write("<html><body>"
				+ "<center><h2 style='color:red'> Due to some reason data has not deleted.Please contact with developer </h2></center>"
				+ "</body></html>");
	}
	else {
		pw.write("<html><body>"
				+ "<center><h2 style='color:red'> Task has deleted.</h2></center>"
				+ "</body></html>");
	}
	req.setAttribute("sid", t.getTsid());
	RequestDispatcher rd= req.getRequestDispatcher("DisplayDate.jsp");
	rd.include(req, resp);
}
}