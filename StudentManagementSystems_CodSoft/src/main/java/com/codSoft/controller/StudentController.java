package com.codSoft.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codSoft.entity.Student;
import com.codSoft.service.StudentService;

@Controller
public class StudentController {

	@Autowired
	private StudentService sService;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	@RequestMapping("/student")
	public String regPage(Model m) {
		Student stu=new Student();
		m.addAttribute("student",stu);
		return "stureg";
	}
	@RequestMapping("/register")
	public String saveModel(@ModelAttribute Student student,Model m)
	{
		Student s=sService.saveStudent(student);
		return "success";
	}
	@RequestMapping("/views")
	public String getStudents(Model m)
	{
		m.addAttribute("students",sService.getAll());
		return "viewStudents";
	}
	@RequestMapping("/delete/{sid}")
	public String deleteRecord(@PathVariable int sid)
	{
		sService.deleteStudent(sid);
		return "delete";
	}
	@RequestMapping(value="/studentsid/{sid}")
	public String edit(@PathVariable int sid,ModelMap map)
	{
		map.put("command",sService.getStudent(sid));
		return "editstudent";
	}
	@RequestMapping("/editu")
	public String eidtSave(@ModelAttribute Student student,Model model)
	{
		model.addAttribute("students",sService.updateStudent(student));
		return "editsuccess";
	}
}
