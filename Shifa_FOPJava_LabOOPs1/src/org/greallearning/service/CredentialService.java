package org.greallearning.service;
import java.util.Random;

import org.greallearning.model.Employee;

public class CredentialService {
	public String generatePassword() 
	{
	 
		      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
		      String specialCharacters = "!@#$%^&*()_+?<>";
		      String numbers = "1234567890";
		      
		      //Getting a single string of Upper case, Lower case Special characters and numbers
		      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
		      Random random=new Random();
		      
		      //Hard-coding Password length to 8
		      int length=8;
		      String finalPassword= "I";
		      char[] passwords = new char[8];
		      
		      //Logic to store the randomly generated characters and storing them 
			  for (int i=0;i<length;i++) {
		    	  passwords[i]= combinedChars.charAt(random.nextInt(combinedChars.length()));
		    	  finalPassword = finalPassword + passwords[i];
			  }
			  return finalPassword;
		   
		      
	}
	
	public String generateEmailAddress(String firstName, String lastName, String department) 
	{
		return firstName+lastName+"@"+department+".xyz.com" ;
		
	}
	public void showCredentials(Employee e, String email, String password) 
	{
		System.out.println("\n"+ "Dear "+e.getFirstName()+", your generated credentials are as follows");
		System.out.println("Email : " + email );
		System.out.println("Password : " + password);
		
	}

}
