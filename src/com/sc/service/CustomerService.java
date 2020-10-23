package com.sc.service;

import java.util.Scanner;
import com.sc.model.Complaints;
import com.sc.model.Customer;
import com.sc.repository.Database;

public class CustomerService 
{
	int c_id;
	int p_id;
	int complaintNo;
	Complaints complaints;
	Customer [] customerDB;
	Database database;
	
	public CustomerService()
	{
		super();
		 database=new Database();

	}
	public void showNames()
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Customer Id: ");
		c_id=sc.nextInt();
		switch(c_id)
		{
			case 1:
				System.out.println("The customer name is Sananda");
				break;
			case 2:
				System.out.println("The customer name is Priyanka");
				break;
			case 3:
				System.out.println("The customer name is Divya");
				break;
			default:
				System.out.println("No customer found for this customer Id.Kindly check and enter proper Id");
				break;
		}
		
	}
	public void showAllComplaints()
	{
			  	
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the customer id: ");
		p_id=sc.nextInt();
		System.out.println("your complaints are\n");
		switch(p_id)
		{
				case 1:
					System.out.println(database.customerDB[0]);
					break;
				case 2:
					System.out.println(database.customerDB[1]);
					break;
				case 3:
					System.out.println(database.customerDB[2]);
					break;
				default:
					System.out.println("No complaints found for this customer Id.Kindly check and enter proper Id");
					break;
		}
	}
	public void launchComplaint()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the complaint option: ");
		complaintNo=sc.nextInt();
		System.out.println("your complaint is: ");
		switch(complaintNo)
		{
			case 1:
					System.out.println("Refund not done");
					break;
			case 2:
					System.out.println("Damaged Product");
					break;
			case 3:
					System.out.println("Late Delivery");
					break;
			case 4:
					System.out.println("Missing Item");
					break;
			case 5:
					System.out.println("Return Issue");
					break;
			case 6:
					System.out.println("Others");
					System.out.println("Please visit your nearby Help Centre for the assistance.Thank You.");
					break;
			default:
					System.out.println("No complaint option found againt this Complaint Number.Kindly check and enter proper number.");
					break;
		}
		System.out.println("Your complaint is registered successfully");
		
	}
			
}


	

