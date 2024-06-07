package com.ccs.student_to_do_web_app.dto;

public class Student {
	int sid;
	String sname;
	String spswrd;
	String semail;
	String sgender;
	
	public Student(int sid, String sname, String semail, String spswrd, String sgender) {
		this.sid = sid;
		this.sname = sname;
		this.semail = semail;
		this.spswrd = spswrd;
		this.sgender = sgender;
	}
	

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public String getSemail() {
		return semail;
	}

	public void setSemail(String semail) {
		this.semail = semail;
	}

	public String getSpswrd() {
		return spswrd;
	}

	public void setSpswrd(String spswrd) {
		this.spswrd = spswrd;
	}

	public String getSgender() {
		return sgender;
	}

	public void setSgender(String sgender) {
		this.sgender = sgender;
	}


	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", spswrd=" + spswrd + ", semail=" + semail + ", sgender="
				+ sgender + "]";
	}

}
