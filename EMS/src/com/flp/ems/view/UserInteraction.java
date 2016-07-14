package com.flp.ems.view;
import java.util.*;
import java.util.Scanner;
import com.flp.ems.util.Validate;
public class UserInteraction {
	void AddEmployee(){
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the name of employee");
		String Name=sc.next();
		
		System.out.println("enter the kin_id of employee");
		int Kin_id=sc.nextInt();
	   
		System.out.println("enter the email_id of employee ");
		String Email_id=sc.next();
		
		System.out.println("enter the phone_no of employee ");
		int Phone_no=sc.nextInt();
		
		System.out.println("enter the address of employee ");
		String Address=sc.next();
	
		System.out.println(" enter the date of birth ");
		String date = sc.next();
		
		System.out.println(" enter the date of joining  "); 
		String da = sc.next();
		
		System.out.println("enter the department of employee ");
		String Department=sc.next();
		
		System.out.println("enter the project of employee ");
	    String Project=sc.next();
	    
	    System.out.println("enter the roles of employee ");
		String Roles=sc.next();
		
		HashMap hm = new HashMap(); 
		if(Validate.validateDate(date)&&Validate.validateDate(da))
		{
		    	hm.put(1, Name);
			    hm.put(2,Kin_id);
			    hm.put(3,Email_id );
			    hm.put(4, Phone_no);
				hm.put(5, Address);
				hm.put(6, date);
				hm.put(7,da);
				hm.put(8, Department);
				hm.put(9,Project);
				hm.put(10,Roles);
	}
	}
	void ModifyEmployee(){	
		
	}
	void SearchEmployee(){
		
	}
	void RemoveEmployee(){
	 
	}
	void getAllEmployee(){
		
	}
	public static void main(String[] agrs){
		
	}
}




