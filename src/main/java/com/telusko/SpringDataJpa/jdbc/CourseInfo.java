package com.telusko.SpringDataJpa.jdbc;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name="Course")
public class CourseInfo {
	
	@Id
	private Integer id;

	@Column
	private String cname;

	public CourseInfo() {

	}

	public CourseInfo(Integer id, String cname) {
		super();
		this.id = id;
		this.cname = cname;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	@Override
	public String toString() {
		return "CourseInfo [id=" + id + ", cname=" + cname + "]";
	}


}
