package com.hcq.entity;

public class Student {
    private int sid;
    private String sname;
    private Classes cla;
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
	public Classes getCla() {
		return cla;
	}
	public void setCla(Classes cla) {
		this.cla = cla;
	}
	public Student(int sid, String sname, Classes cla) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.cla = cla;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", cla=" + cla + "]";
	}
	public Student() {
		super();
	}
}
