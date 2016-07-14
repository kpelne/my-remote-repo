package com.flp.ems.view;

import java.util.Scanner;

import com.flp.ems.view.UserInteraction;

public class BootClass {
	 
//	 private static final int Employee = 0;
		 public static void main (String[] agrs)
		 {
		 	Scanner scanner = new Scanner(System.in);
		     System.out.println("AddEmployee");
		     System.out.println("ModifyEmployee");
		     System.out.println("SearchEmployee");
		 	System.out.println("RemoveEmployee");
		 	System.out.println("getAllEmployee");
		 	int n=scanner.nextInt();
		 }
		 	void menuSelection(int n)
		 	{
		 switch (n) 
		 {
		 case 1:  UserInteraction u1=new UserInteraction();
		 u1.AddEmployee();
		 break;
		 case 2:  UserInteraction u2=new UserInteraction();
		 u2.ModifyEmployee();
		 break;
		 case 3:  UserInteraction u3=new UserInteraction();
		 u3.SearchEmployee();
		 break;
		 case 4:  UserInteraction u4=new UserInteraction();
		 u4.RemoveEmployee();
		 break;
		 case 5:  UserInteraction u5=new UserInteraction();
		 u5.getAllEmployee();
		 break;
		 default:  System.out.println("the value is default");
		 break;
		 }

		 }

		 }



