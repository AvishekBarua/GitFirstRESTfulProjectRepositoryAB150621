package com.karnafully.FirstRESTfulProject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.karnafully.FirstRESTfulProject.database.DatabaseClass;
import com.karnafully.FirstRESTfulProject.model.Student_Info;

public class StudentService {
	
	private Map<Integer, Student_Info> students = DatabaseClass.getAllStudents(); 
	
	
	public List<Student_Info> getAllStudents() {
		return new ArrayList<Student_Info>(students.values());
	}
	
	public Student_Info getStudent(Integer id) {
		return students.get(id);
	}
}
