package com.ccs.student_to_do_web_app.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.ccs.student_to_do_web_app.connection.MyConnection;
import com.ccs.student_to_do_web_app.dto.Student;
import com.ccs.student_to_do_web_app.dto.Task;

public class ToDoWebAppDao {
Connection connection=MyConnection.getStudentConnection();

public Student saveStudentDao(Student student) {
	String inset_query="insert into student value(?,?,?,?,?)";
	try {
		PreparedStatement ps= connection.prepareStatement(inset_query);
		ps.setInt(1, student.getSid());
		ps.setString(2, student.getSname());
		ps.setString(3, student.getSemail());
		ps.setString(4, student.getSpswrd());
		ps.setString(5, student.getSgender());
		ps.execute();
		return student;
	
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
return null;
}

public Student getStudentByIdDao(int id,String spswrd) {
	String read="select * from student where sid=? AND spswrd=?";
	try {
		PreparedStatement ps=connection.prepareStatement(read);
		ps.setInt(1, id);
		ps.setString(2, spswrd);
		ResultSet rs=ps.executeQuery();
		if(rs.next()) {
			return new Student(rs.getInt("sid"), rs.getString("sname"), rs.getString("semail"), rs.getString("spswrd"),rs.getString("sgender"));
		}
	} catch (SQLException e) {
		// TODO: handle exception\
		e.printStackTrace();
	}
	return null;
}
public Task saveTaskDao(Task task) {
	String save="insert into task(tname,tinfo,tdate,sid) values(?,?,?,?)";
	try {
		PreparedStatement ps= connection.prepareStatement(save);
		ps.setString(1, task.getTname());
		ps.setString(2, task.getTinfo());
		ps.setObject(3, task.getDate());
		ps.setInt(4, task.getTsid());
		ps.execute();
		return task;
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return null;
}


public List<Task> getAllTaskByIdDao(int sid){
	List<Task> l=new ArrayList<Task>();
	String read="Select * from task where sid=?";
	try {
		PreparedStatement ps= connection.prepareStatement(read);
		ps.setInt(1, sid);
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			l.add(new Task(rs.getInt("tid"),rs.getString("tname"),rs.getDate("tdate").toLocalDate() , rs.getString("tinfo"),  rs.getInt("sid")));
		}
		return l;
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return null;
}
public List<Task> getAllTaskByDateDao(LocalDate date,int sid){

	List<Task> l=new ArrayList<Task>();
	String read="Select * from task where tdate=? and sid=?";
	try {
		PreparedStatement ps= connection.prepareStatement(read);
		ps.setObject(1, date);
		ps.setInt(2, sid);
		ResultSet rs= ps.executeQuery();
		while(rs.next()) {
			l.add(new Task(rs.getInt("tid"),rs.getString("tname"),rs.getDate("tdate").toLocalDate() , rs.getString("tinfo"),  rs.getInt("sid")));
		}
		return l;
	} catch (SQLException e) {e.printStackTrace();}
	return null;
}
public int deleteTaskById(int tid) {
	String delete="delete from task where tid=?";
	try {
		PreparedStatement ps= connection.prepareStatement(delete);
		ps.setInt(1, tid);
		return ps.executeUpdate();
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return 0;
}
public int updateTaskByIdDao(Task task) {
	String update="update task set tname=?,tinfo=?,tdate=? where tid=?";
	try {
		PreparedStatement ps= connection.prepareStatement(update);
		ps.setString(1, task.getTname());
		ps.setString(2, task.getTinfo());
		ps.setObject(3, task.getDate());
		ps.setInt(4, task.getTid());
		return ps.executeUpdate();
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}return 0;
}

public Task getTaskByIdDao(int tid){
	String read="Select * from task where tid=?";
	try {
		PreparedStatement ps= connection.prepareStatement(read);
		ps.setInt(1, tid);
		ResultSet rs= ps.executeQuery();
		if(rs.next()) {
			return new Task(rs.getInt("tid"),rs.getString("tname"),rs.getDate("tdate").toLocalDate() , rs.getString("tinfo"),  rs.getInt("sid"));
		}
	} catch (SQLException e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	return null;
}
}
