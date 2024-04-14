package com.SpringDataJPA.SpringDataJPA.Controller;

import com.SpringDataJPA.SpringDataJPA.DAO.StudentRequest;
import com.SpringDataJPA.SpringDataJPA.Entity.Student;
import com.SpringDataJPA.SpringDataJPA.Repository.StudentRepo;
import com.SpringDataJPA.SpringDataJPA.Service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/std")
public class StudentController {
    @Autowired
    Service service;

    @GetMapping("/get_std/{CourseName}")
    public List<Student> getStudentByCourse(@PathVariable String CourseName) {
        List<Student> stByCourse = service.getStudentByCourse(CourseName);
        return stByCourse;
    }

    @PostMapping("/save_std")
    public Student saveStudent(@RequestBody StudentRequest stdRequest) {

        return service.saveStudent(stdRequest);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        service.deleteStudent(id);
    }

    @GetMapping("/getAllStd")
    public List<Student> getAllStudent() {
        List<Student> allStudent = service.getAllStudent();
        return allStudent;
    }



    @PutMapping("/update_std")
    public Student updateStudent(@RequestBody Student std) {
        return service.updateStudent(std);
    }


}