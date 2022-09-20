import java.util.Scanner;
import org.greallearning.model.*;
import org.greallearning.service.*;

public class Driver 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		int choice;
		String email;
		String password;
		String dept = null;
		CredentialService cred= new CredentialService();
		Employee emp = new Employee();
		
		// UI for Employee starts here
		System.out.print("Please enter your First name : ");
		emp.setFirstName(scan.next());
		System.out.print("Please enter your Last name : ");
		emp.setLastName(scan.next());
			  System.out.println("\n"+"Please Select the number associated with the Department that suits you:  ");
			  System.out.println("1. Technical");
			  System.out.println("2. Admin");
			  System.out.println("3. Human Resource");
			  System.out.println("4. Legal");
			  choice = scan.nextInt();
			  if (choice ==1)
				dept ="Technical";
			  else if (choice ==2)
				dept = "Admin";
			  else if (choice == 3)
				dept = "Human Resources";
			  else if (choice == 4)
				dept = "Legal";
			  else
				  System.out.println("Incorrect Department choice");
				  
			  
			  //Looping through the choice only once since credentials should be generated only once
			  if (choice<5) 
			  {
			
			     switch (choice) 
			    {
			     case 1: email = cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), dept);
			             password = cred.generatePassword();
			             cred.showCredentials(emp, email, password);
			             break;
			     case 2: email = cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), dept);
	                     password = cred.generatePassword();
	                     cred.showCredentials(emp, email, password);
	                     break;
			     case 3: email = cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), dept);
                         password = cred.generatePassword();
                         cred.showCredentials(emp, email, password);
                         break;  
			     case 4:  email = cred.generateEmailAddress(emp.getFirstName(), emp.getLastName(), dept);
                          password = cred.generatePassword();
                          cred.showCredentials(emp, email, password);
                          break;  
                 default: System.out.println("Credentials could not be generated!! Please Restart");         
                         
			
			    }
			 }
		
		}
		
	}


