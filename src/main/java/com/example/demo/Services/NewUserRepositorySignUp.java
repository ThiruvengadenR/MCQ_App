package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import jakarta.transaction.Transactional;

public interface NewUserRepositorySignUp extends CrudRepository <NewUserRegisterEntitySignUp , Integer > {

	//  @Transactional
	//  @Modifying
	@Query(value =" select entity from NewUserRegisterEntitySignUp entity  where entity.firstName = ?1 ")
	public NewUserRegisterEntitySignUp findByName(String firstName);

	
	// update query for password by email
	@Query(value =" select entity from NewUserRegisterEntitySignUp entity  where entity.email = ?1 ")
	public NewUserRegisterEntitySignUp findByEmail( String email , @Param("base")String base);
	
//	@Query("SELECT entity FROM NewUserRegisterEntitySignUp entity WHERE entity.columnName = :value")
//	List<NewUserRegisterEntitySignUp> findByColumnName(@Param("columnName") String base, @Param("value") String email);

}
