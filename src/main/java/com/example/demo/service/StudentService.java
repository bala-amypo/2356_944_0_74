package com.example.demo.sercice;
import java.util.List;

import java.util.Optional;
import com.example.demo.entity.StudentEntity;

public interface StudentService{
    StudentEntity postdata(StudentEntity stu);
    List<StudentEntity> getdata();
    StudentEntity update(int id,StudentEntity std);
    void deletedata(int id);
}