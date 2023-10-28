package com.codSoft.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codSoft.entity.Student;
import com.codSoft.repo.StudentRepo;

@Service
public class StudentServiceImp implements StudentService {

	@Autowired
	private StudentRepo sRepo;
	
	@Override
	public Student saveStudent(Student student) {
		return sRepo.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		return sRepo.save(student);
	}

	@Override
	public void deleteStudent(Integer sid) {
		sRepo.deleteById(sid);
	}

	@Override
	public List<Student> getAll() {
		List<Student> stu=(List<Student>)sRepo.findAll();
		return stu;
	}

	@Override
	public Student getStudent(Integer sid) {
		Student st=sRepo.findById(sid).get();
		return st;
	}

}
