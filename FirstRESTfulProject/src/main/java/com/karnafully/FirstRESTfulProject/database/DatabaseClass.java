package com.karnafully.FirstRESTfulProject.database;

import java.util.HashMap;
import java.util.Map;

import com.karnafully.FirstRESTfulProject.model.Student_Info;


public class DatabaseClass {

	private static Map<Integer, Student_Info> students = new HashMap<>();
	
	public static Map<Integer, Student_Info> getAllStudents(){
		return students;
	}
}