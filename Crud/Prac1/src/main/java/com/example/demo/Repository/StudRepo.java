package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.yaml.snakeyaml.events.Event.ID;

import com.example.demo.entity.Student;

public interface StudRepo extends JpaRepository<Student, Integer> {

	@Query(value =  "select * from Student where email =?" ,nativeQuery = true)
	Student findByEmail(String email);

 
	

}
