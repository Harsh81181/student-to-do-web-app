package com.ccs.student_to_do_web_app.controller;

import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ccs.student_to_do_web_app.dto.Task;
import com.ccs.student_to_do_web_app.service.ToDoWebAppService;
@WebServlet(value = "/DisplayDate")
public class DisplayDateController extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	LocalDate date=LocalDate.parse(req.getParameter("tdate"));
	int id=Integer.parseInt(req.getParameter("sid"));
	ToDoWebAppService service= new ToDoWebAppService();
	List<Task> task=service.getAllTaskByIdService(date, id);
	req.setAttribute("list", task);
	req.getRequestDispatcher("DisplayDate.jsp").include(req, resp);
}
}
