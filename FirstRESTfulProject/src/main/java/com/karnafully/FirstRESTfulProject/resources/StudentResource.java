package com.karnafully.FirstRESTfulProject.resources;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.karnafully.FirstRESTfulProject.model.Student_Info;
import com.karnafully.FirstRESTfulProject.service.StudentService;

@Path("/students")
public class StudentResource {
	
	StudentService service = new StudentService();
	
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<Student_Info> GetStudentInfo(){
		return service.getAllStudents();
	}
}
