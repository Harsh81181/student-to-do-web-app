package com.ccs.student_to_do_web_app.service;

import java.time.LocalDate;
import java.util.List;

import com.ccs.student_to_do_web_app.dao.ToDoWebAppDao;
import com.ccs.student_to_do_web_app.dto.Student;
import com.ccs.student_to_do_web_app.dto.Task;

public class ToDoWebAppService {
	ToDoWebAppDao dao=new ToDoWebAppDao();
	
	public Student saveStudentService(Student student) {
		return dao.saveStudentDao(student);
	}
	public Student getStudentByIdService(int id,String spswrd) {
		return dao.getStudentByIdDao(id,spswrd);
	}
	
	public Task saveTaskService(Task task) {
		return dao.saveTaskDao(task);
	}
	
	public List<Task> getAllTaskService(int sid){
		return dao.getAllTaskByIdDao(sid);
	}
	public List<Task> getAllTaskByIdService(LocalDate date,int sid){
		return dao.getAllTaskByDateDao(date,sid);
	}
	
	public int deleteTaskByIdService(int tid) {
		return dao.deleteTaskById(tid);
	}
	
	public int updateTaskByIdService(Task task) {
		return dao.updateTaskByIdDao(task);
	}

	public Task getTaskByIdService(int tid){
		return dao.getTaskByIdDao(tid);
	}
}
