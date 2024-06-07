package com.ccs.student_to_do_web_app.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.ccs.student_to_do_web_app.dto.Task;
import com.ccs.student_to_do_web_app.service.ToDoWebAppService;
@WebServlet(value = "/UpdateTask")
public class UpdateTaskController extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	ToDoWebAppService service =new ToDoWebAppService();
	String tname=req.getParameter("tname");
	String tinfo=req.getParameter("tinfo");
	LocalDate date=LocalDate.parse(req.getParameter("tdate"));
	int tid=Integer.parseInt(req.getParameter("tid"));
	int sid=Integer.parseInt(req.getParameter("sid"));
	int up =service.updateTaskByIdService(new Task(tid, tname, date, tinfo, sid));
	 PrintWriter pw=resp.getWriter();
	if(up!=1) { pw.write("<html><Body><center><h2>Data has not updated contact with developer</h2><");
	}
		 
	 req.getRequestDispatcher("Display.jsp").include(req, resp);
}
}
