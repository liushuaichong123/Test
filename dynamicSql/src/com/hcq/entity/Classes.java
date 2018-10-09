package com.hcq.entity;

import java.util.List;

public class Classes {
     private int cid;
     private String cname;
     private List<Student> list;
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Student> getList() {
		return list;
	}
	public void setList(List<Student> list) {
		this.list = list;
	}
	public Classes(int cid, String cname, List<Student> list) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.list = list;
	}
	public Classes() {
		super();
	}
	@Override
	public String toString() {
		return "Classes [cid=" + cid + ", cname=" + cname + ", list=" + list + "]";
	}
}
