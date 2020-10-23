package com.sc.main;
import java.util.Scanner;
import com.sc.repository.Database;
import com.sc.service.CustomerService;

public class CustomerUser
{
	public static void main(String[] args)
	{
		int menu;
		CustomerService service=new CustomerService();
		
		do {
		System.out.println("\nHELLO CUSTOMER!!\n");
		System.out.println("PRESS 1 FOR LAUNCHING A NEW COMPLAINT \n"
				+"PRESS 2 FOR SEARCHING THE CUSTOMER'S NAME BY CUSTOMER ID \n"
				+ "PRESS 3 FOR CHECKING ALL COMPLAINTS LODGED BY THE SAME CUSTOMER\n"
				+"PRESS 4 FOR EXIT\n");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the the option of menu: ");
		menu=sc.nextInt();
		System.out.println("your chosen option is: "+menu);
		
		while(menu<1||menu>4)
		{
			System.out.println("PLEASE SELECT A VALID OPTION FROM THE GIVEN MENU");
			System.out.println("PRESS 1 FOR LAUNCHING A NEW COMPLAINT \n"
					+"PRESS 2 FOR SEARCHING THE CUSTOMER'S NAME BY CUSTOMER ID \n"
					+ "PRESS 3 FOR CHECKING ALL COMPLAINTS LODGED BY THE SAME CUSTOMER\n"
					+"PRESS 4 FOR EXIT\n");
			menu=sc.nextInt();
			System.out.println("you have entered" +menu);
		}
		switch(menu)
		{
			case 1:
			
				System.out.println("you want to launch a new complaint");
				System.out.println("Choose an option from the list below");
				Database db=new Database();
				db.chooseComplaint();
				service.launchComplaint();
				break;
			
			case 2:
			
				System.out.println("you want to search the customer's name by customer id");
				service.showNames();
				break;
			
			case 3:
			
				System.out.println("you want to check all your complaints");
				service.showAllComplaints();
				break;
			case 4:
				System.out.println("\nWE ARE HAPPY TO HELP YOU \nTHANK YOU FOR VISITING");
				return;
			
			default:
				System.exit(menu);
				return;
			
			}
			
		}
		while(true);
	}
}



