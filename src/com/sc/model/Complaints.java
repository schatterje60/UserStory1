package com.sc.model;

public class Complaints
{
	int p_id;
	int c_id;
	String c_title;
	String status;
	
	public Complaints() 
	{
		
	}
	public Complaints(int p_id,int c_id, String c_title, String status) 
	{
		super();
		this.p_id=p_id;
		this.c_id = c_id;
		this.c_title = c_title;
		this.status = status;
	}
	
	public int getP_id()
	{
		return p_id;
	}
	public void setP_id(int p_id) 
	{
		this.p_id = p_id;
	}
	public int getC_id() 
	{
		return c_id;
	}
	public void setC_id(int c_id) 
	{
		this.c_id = c_id;
	}
	public String getC_title() 
	{
		return c_title;
	}
	public void setC_title(String c_title) 
	{
		this.c_title = c_title;
	}
	public String getStatus() 
	{
		return status;
	}
	public void setStatus(String status) 
	{
		this.status = status;
	}
	
	@Override
	public int hashCode() 
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + c_id;
		result = prime * result + ((c_title == null) ? 0 : c_title.hashCode());
		result = prime * result + p_id;
		result = prime * result + ((status == null) ? 0 : status.hashCode());
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
		Complaints other = (Complaints) obj;
		if (c_id != other.c_id)
			return false;
		if (c_title == null) {
			if (other.c_title != null)
				return false;
		} else if (!c_title.equals(other.c_title))
			return false;
		if (p_id != other.p_id)
			return false;
		if (status == null) {
			if (other.status != null)
				return false;
		} else if (!status.equals(other.status))
			return false;
		return true;
	}
	@Override
	public String toString()
	{
		return "Complaints [Customer Id=" + p_id + ", Complaint Id=" + c_id + ", Complaint Title=" + c_title + ",Complaint Status=" + status + "]";
	}
				
}




