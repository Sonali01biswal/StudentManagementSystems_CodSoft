package com.codSoft.service;

import java.util.List;
import com.codSoft.entity.Student;

public interface StudentService {

	public Student saveStudent(Student student);
	public Student updateStudent(Student student);
	public void deleteStudent(Integer sid);
	public List<Student>getAll();
	public Student getStudent(Integer sid);
}
