package com.SpringDataJPA.SpringDataJPA.Utils;

import com.SpringDataJPA.SpringDataJPA.DAO.StudentRequest;
import com.SpringDataJPA.SpringDataJPA.Entity.Student;

public class Utility {

    public static Student Mapper(StudentRequest stdRequest){
        Student  std = new Student();
        std.setName(stdRequest.getName());
        std.setCourse(stdRequest.getCourse());
        std.setAddress(stdRequest.getAddress());
        return std;
    }

}
