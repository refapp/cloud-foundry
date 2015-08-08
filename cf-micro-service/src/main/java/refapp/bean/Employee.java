package refapp.bean;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="EMPLOYEE")
public class Employee 
{
	public int id;
	public String name;
	
	public int getId() 
	{
		return id;
	}
	
	@XmlElement(name="EMPLOYEE_ID")
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getName() 
	{
		return name;
	}
	
	@XmlElement(name="EMPLOYEE_NAME")
	public void setName(String name) 
	{
		this.name = name;
	}
}