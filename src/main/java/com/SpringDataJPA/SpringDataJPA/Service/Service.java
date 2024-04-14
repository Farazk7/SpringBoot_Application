package com.SpringDataJPA.SpringDataJPA.Service;

import com.SpringDataJPA.SpringDataJPA.DAO.StudentRequest;
import com.SpringDataJPA.SpringDataJPA.Entity.Student;

import java.util.List;

public interface Service {

    public Student saveStudent(StudentRequest stdRequest);


    public  List<Student> getStudentByCourse(String CourseName);

   public void deleteStudent(int id);

   public List<Student> getAllStudent();

public Student updateStudent(Student std);
}
