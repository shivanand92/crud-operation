package com.example.demo.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

 
import com.example.demo.Exception.Resourse_Not_Found_Exception;
import com.example.demo.Repository.StudRepo;
import com.example.demo.Service.StudService;
import com.example.demo.entity.Student;

@Service   // this is used to perform a business logics
public class StudImpl implements StudService {

	
	@Autowired   // reference variables which stores the implementation class object
	private StudRepo studRepo;
	
	
	@Override
	public Student login(String email, String password) {


	Student s=	studRepo.findByEmail(email);
	
	if(s!=null)
	{
		if(s.getPassword().equals(password))
		{
			return s;
		}else 
		{
			throw new Resourse_Not_Found_Exception();
		}
		
	}
	else {
		throw new Resourse_Not_Found_Exception();
	}
		
		
	 
	}


	@Override
	public Student addStudent(Student student) {
		// TODO Auto-generated method stub
		return studRepo.save(student);
	}


	@Override
	public Student updateDb(String email, Student student) {
		 
		Student s2= studRepo.findByEmail(email);
		
				if(s2!=null) {
					
					s2.setName(student.getName());
					s2.setPhone(student.getPhone());
					s2.setPassword(student.getPassword());
					
					 return studRepo.save(s2);
				}
				else {
					throw new Resourse_Not_Found_Exception();
				}
				
	 
	}


	@Override
	public void deletedata(String email) {
		 
		
		
Student s3 = studRepo.findByEmail(email);
		
		if(s3!=null) {
			studRepo.delete(s3);
		}
		else {
			throw new Resourse_Not_Found_Exception();
		}
		
		
	}

	
	
	
}
