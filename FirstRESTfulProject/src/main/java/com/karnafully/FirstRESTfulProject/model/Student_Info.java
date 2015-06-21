package com.karnafully.FirstRESTfulProject.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student_Info {

	private int rollNo;
	private String name;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
