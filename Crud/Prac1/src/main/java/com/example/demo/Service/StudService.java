package com.example.demo.Service;

import com.example.demo.entity.Student;

public interface StudService {

 Student login(String email , String password);

  Student addStudent(Student student);

Student updateDb(String email, Student student);

void deletedata(String email);
 
}
