package com.sc.repository;
import java.util.ArrayList;
import java.util.List;

import com.sc.model.Complaints;
import com.sc.model.Customer;

public class Database 
{
	public static Customer [] customerDB;
	Complaints complaints;
	public List<String> complaintList;
	
	

	
	  public Database()
	  {
		  Complaints [] complaints1= {new Complaints(1,1,"Refund not done","In Process"),new Complaints(1,2,"Late Delivery","Initiated"),new Complaints(1,3,"Return Issue","Completed")}; 
		  Complaints [] complaints2=	{new Complaints(2,1,"Late Delivery","Completed"),new Complaints(2,2,"Return Issue","In Process"),new Complaints(3,3,"Refund not done","Initiated")}; 
		  Complaints [] complaints3= {new Complaints(3,1,"Damaged Product","Initiated"),new Complaints(3,2,"Return Issue","Initiated")};
	  
	  
		  customerDB=new Customer[3]; 
		  customerDB[0]=new Customer(1,"Sananda",complaints1);
		  customerDB[1]=new Customer(2,"Priyanka",complaints2); 
		  customerDB[2]=new Customer(3,"Divya",complaints3); 
		  

			complaintList=new ArrayList<String>();
			complaintList.add("1.Refund not done");
			complaintList.add("2.Damaged Product");
			complaintList.add("3.Late Delivery");
			complaintList.add("4.Missing Item");
			complaintList.add("5.Return Issue");
			complaintList.add("6.Others");
			
			

	  }
	  public void chooseComplaint()
		{
			System.out.println(complaintList);
		}
}

	