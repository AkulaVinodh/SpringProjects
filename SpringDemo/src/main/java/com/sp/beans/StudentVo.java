package com.sp.beans;

public class StudentVo {
	private int id;
	private String name;
	private String adrs;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdrs() {
		return adrs;
	}
	public void setAdrs(String adrs) {
		this.adrs = adrs;
	}
	@Override
	public String toString() {
		return "StudentVo [id=" + id + ", name=" + name + ", adrs=" + adrs + "]";
	}

}
