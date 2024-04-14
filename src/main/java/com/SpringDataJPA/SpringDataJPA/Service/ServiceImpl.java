package com.SpringDataJPA.SpringDataJPA.Service;

import com.SpringDataJPA.SpringDataJPA.DAO.StudentRequest;
import com.SpringDataJPA.SpringDataJPA.Entity.Student;
import com.SpringDataJPA.SpringDataJPA.Repository.StudentRepo;
import com.SpringDataJPA.SpringDataJPA.Utils.Utility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class ServiceImpl implements com.SpringDataJPA.SpringDataJPA.Service.Service {
    @Autowired
    StudentRepo stRepo;


    public Student saveStudent(StudentRequest stdRequest) {
        return stRepo.save(Utility.Mapper(stdRequest));
    }

    @Override
    public List<Student> getStudentByCourse(String CourseName) {
        return stRepo.findByCourse(CourseName);
    }

    @Override
    public void deleteStudent(int id) {
        stRepo.deleteById(id);
    }

    @Override
    public List<Student> getAllStudent() {
        return stRepo.getAllStudent();
    }

    @Override
    public Student updateStudent(Student student) {

        return stRepo.save(student);
        }

    }


