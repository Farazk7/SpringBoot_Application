package com.SpringDataJPA.SpringDataJPA.Repository;

import com.SpringDataJPA.SpringDataJPA.Entity.Student;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepo extends CrudRepository<Student,Integer> {
    public List<Student> findByCourse(String course);

    @Query(value = "select * from student", nativeQuery = true)
    public List<Student> getAllStudent();

}



