package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.Services.NewUserRegisterPojoSignUp;
import com.example.demo.Services.NewUserServiceSignUp;

@Controller
@RequestMapping("/newUser")
public class SignUpPageController {
	
	@Autowired
	NewUserServiceSignUp service;
	//welcome page 
	@RequestMapping("/welcome")
	public String welcome()
	{
		return "homepage";
	}
	
	@RequestMapping("/SignupPage")
	public String signUpPage()
	{
		return "SignupPage";
	}
	


	// 1. user give input as parameters 
	@RequestMapping("/addNewUserByParameter")
	@ResponseBody
	public String  addNewUserByParameter(Integer rollNo, String  firstName , String lastName , String gender , String dateOfBirth , String  email , String password )
	{
		System.out.println("I am in SignUp Controller ");
		NewUserRegisterPojoSignUp pojo = new  NewUserRegisterPojoSignUp(rollNo, firstName ,lastName ,gender , dateOfBirth ,email ,password);
		System.out.println(pojo);
		return service.addNewUserMethod(pojo);
	}
	
	// 2. data given in body 
	@PostMapping("/addNewUserByBody")
	@ResponseBody
	public String addNewUserByBody(@RequestBody NewUserRegisterPojoSignUp pojo)
	{
		System.out.println("I am in addNewUserByBody ");
		return service.addNewUserMethod(pojo);
	}
	
	// 1. retrieval of data based on id by parameter 
	@RequestMapping("/getUserDetailsById")
	@ResponseBody
	public NewUserRegisterPojoSignUp getUserDetailsBasedOnId(Integer rollno)
	{
		System.out.println("I am in getUserDetails ");
		return  service.getUserDetailService(rollno);
	}
	
	// 2. retrival of data based on firstName by parameter 
	@RequestMapping("/getUserDetailsByFirstName")
	@ResponseBody
	public NewUserRegisterPojoSignUp getUserDetailsBasedOnFirstName(String  firstName)
	{
		System.out.println("I am in getUserDetails ");
		return  service.getUserDetailByNameService(firstName);
	}
	
//	// 3.  retrieval of data based on id by body 
//	@PostMapping("/getUserDetailsByIdBody")
//	public NewUserRegisterPojoSignUp getUserDetailsBasedOnIdBody(@RequestBody Integer rollNo)
//	{
//		System.out.println(rollNo+"    -------------------------------- ");
//		System.out.println("I am in getUserDetails ");
//		return  service.getUserDetailService(rollNo);
//	}
	
	//4. update data based on id by parameter 
	@PutMapping("/updatePasswordById")
	@ResponseBody
	public NewUserRegisterPojoSignUp updatePasswordById(Integer rollNo , String password )
	{
		System.out.println("I am in updatePasswordById ");
		return service.updatePasswordByIdService(rollNo , password );
	}
	
	// 5. update data based on email by parameter 
	@PutMapping("/updatePasswordByBase")
	@ResponseBody
	public NewUserRegisterPojoSignUp updatePasswordByEmail(String email , String password , String base )
	{
		System.out.println("I am in updatePasswordByEmail ");
		return service.updatePasswordByEmailService(email , password ,base );
	}
	
	
}
