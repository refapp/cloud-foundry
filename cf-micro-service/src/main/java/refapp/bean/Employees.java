package refapp.bean;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="EMPLOYEES")
public class Employees 
{
	public List<Employee> employee;

	public List<Employee> getEmployee() 
	{
		return employee;
	}

	@XmlElement(name="EMPLOYEE")
	public void setEmployee(List<Employee> employee) 
	{
		this.employee = employee;
	}
}