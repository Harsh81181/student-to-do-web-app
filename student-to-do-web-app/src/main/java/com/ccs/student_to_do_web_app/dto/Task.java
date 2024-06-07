package com.ccs.student_to_do_web_app.dto;

import java.time.LocalDate;

public class Task {
	int tid;
	String tname;
	LocalDate date;
	String tinfo;
	int tsid;
	public Task(int tid, String tname, LocalDate date, String tinfo, int tsid) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.date = date;
		this.tinfo = tinfo;
		this.tsid = tsid;
	}
	
	
	//alt+s+a
	
	//alt+s+r
	public String getTname() {
		return tname;
	}
	
	public void setTname(String tname) {
		this.tname = tname;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public String getTinfo() {
		return tinfo;
	}
	public void setTinfo(String tinfo) {
		this.tinfo = tinfo;
	}
	public int getTsid() {
		return tsid;
	}
	public void setTsid(int tsid) {
		this.tsid = tsid;
	}


	public int getTid() {
		return tid;
	}


	public void setTid(int tid) {
		this.tid = tid;
	}
	
	
}
