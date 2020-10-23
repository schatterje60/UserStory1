package com.sc.model;
import java.util.Arrays;

import com.sc.service.CustomerInterface;

public class Customer implements CustomerInterface
{
	int p_id;
	String pname;
	Complaints [] complaints;
	
	public Customer()
	{
		
	}
	public Customer(int p_id, String pname, Complaints[] complaints)
	{
		super();
		this.p_id = p_id;
		this.pname = pname;
		this.complaints = complaints;
	}

	
	public int getP_id()
	{
		return p_id;
	}

	public void setP_id(int p_id) 
	{
		this.p_id = p_id;
	}

	public String getPname() 
	{
		return pname;
	}

	public void setPname(String pname) 
	{
		this.pname = pname;
	}

	public Complaints[] getComplaints()
	{
		return complaints;
	}

	public void setC(Complaints[] complaints) 
	{
		this.complaints = complaints;
	}
	

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(complaints);
		result = prime * result + p_id;
		result = prime * result + ((pname == null) ? 0 : pname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (!Arrays.equals(complaints, other.complaints))
			return false;
		if (p_id != other.p_id)
			return false;
		if (pname == null) {
			if (other.pname != null)
				return false;
		} else if (!pname.equals(other.pname))
			return false;
		return true;
	}
	@Override
	public String toString() 
	{
		return "Customer [Customer Id=" + p_id + ", Customer Name="+ pname + ", Complaint List=" + Arrays.toString(complaints) + "]";
	}
	@Override
	public void launchComplaint()
	{
		// TODO Auto-generated method stub
		System.out.println("You have lodged a complaint: ");
		
	}
	
}
