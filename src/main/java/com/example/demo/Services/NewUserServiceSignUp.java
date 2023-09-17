package com.example.demo.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewUserServiceSignUp {

	@Autowired 
	NewUserRepositorySignUp repo;
	
	public String addNewUserMethod(NewUserRegisterPojoSignUp pojo) {
		System.out.println("I am in addNewUserMethod ");
		NewUserRegisterEntitySignUp entity = new NewUserRegisterEntitySignUp();
		assignPojoValuesToEntity(pojo,entity);
		System.out.println(entity +" ---------------------.");
		repo.save(entity);
		return "Successfully Register ";
	}

	private void assignPojoValuesToEntity(NewUserRegisterPojoSignUp pojo, NewUserRegisterEntitySignUp entity) {
		entity.setRollNo(pojo.getRollNo());
		entity.setFirstName(pojo.getFirstName());
		entity.setLastName(pojo.getLastName());
		entity.setDateOfBirth(pojo.getDateOfBirth());
		entity.setGender(pojo.getGender());
		entity.setEmail(pojo.getEmail());
		entity.setPassword(pojo.getPassword());
	}

	public NewUserRegisterPojoSignUp getUserDetailService(Integer rollno) {
		// TODO Auto-generated method stub
		System.out.println("I am in getUserDetailService ");
		Optional<NewUserRegisterEntitySignUp> optionalObject =repo.findById(rollno);
		if(optionalObject.isEmpty())
		{
			return null;
		}
		else
		{
			NewUserRegisterPojoSignUp pojo = new NewUserRegisterPojoSignUp();
			NewUserRegisterEntitySignUp entity = optionalObject.get();
			System.out.println(entity);
			return assignEntityValuesToPojo(pojo ,entity);
		}
		
		
	}

	private NewUserRegisterPojoSignUp assignEntityValuesToPojo(NewUserRegisterPojoSignUp pojo, NewUserRegisterEntitySignUp entity) {
		System.out.println("Iam in assignEntityValuesToPojo ");
		pojo.setDateOfBirth(entity.getDateOfBirth());
		pojo.setEmail(entity.getEmail());
		pojo.setFirstName(entity.getFirstName());
		pojo.setLastName(entity.getLastName());
		pojo.setGender(entity.getGender());
		pojo.setRollNo(entity.getRollNo());
		pojo.setPassword(entity.getPassword());
		return pojo;
		
	}

	public NewUserRegisterPojoSignUp getUserDetailByNameService(String firstName) {
		System.out.println("I am in getUserDetailByNameService ");
		NewUserRegisterEntitySignUp entity =repo.findByName(firstName);
		//Student s=studentRepository.findByName(name); // reference taken from class lecture 
			NewUserRegisterPojoSignUp pojo = new NewUserRegisterPojoSignUp();
			System.out.println(entity);
			return assignEntityValuesToPojo(pojo ,entity);
		}

	public NewUserRegisterPojoSignUp updatePasswordByIdService(Integer rollNo, String password) {
		System.out.println("I am in updatePasswordByIdService ");
		Optional <NewUserRegisterEntitySignUp > optionalObject = repo.findById(rollNo);
		if(optionalObject.isEmpty())
		{
			return null;
		}
		else
		{
			NewUserRegisterPojoSignUp pojo = new NewUserRegisterPojoSignUp();
			NewUserRegisterEntitySignUp entity = optionalObject.get();
			entity.setPassword(password);
			System.out.println(entity);
			return assignEntityValuesToPojo(pojo ,entity);
		}
		
	}

	public NewUserRegisterPojoSignUp updatePasswordByEmailService(String email, String password , String base) {
		System.out.println("i am in updatePasswordByEmailService ");
		NewUserRegisterEntitySignUp entity  =(NewUserRegisterEntitySignUp) repo.findByEmail(email, base);
				//findByColumnName(base, email); // small try 
		entity.setPassword(password);
		System.out.println(entity);
		NewUserRegisterPojoSignUp pojo = new NewUserRegisterPojoSignUp();
		return assignEntityValuesToPojo(pojo ,entity);
	}
		
		
}
	
	


