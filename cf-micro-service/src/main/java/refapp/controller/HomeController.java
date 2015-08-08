package refapp.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
	@RequestMapping(value="/employees", method=RequestMethod.GET)
	@ResponseStatus(HttpStatus.OK)
	public String getEmployees(@RequestHeader("Accept") String acceptType, HttpServletResponse response)
	{
		if (acceptType.equalsIgnoreCase(MediaType.APPLICATION_XML_VALUE))
		{
			response.setContentType(MediaType.APPLICATION_XML_VALUE);
			return getEmployeesXML();
		}
		
		response.setContentType(MediaType.APPLICATION_JSON_VALUE);
		return getEmployeesJSONFromXML();
	}
	
	@RequestMapping(value="/employees", method=RequestMethod.POST, produces=MediaType.APPLICATION_JSON_VALUE)
	@ResponseStatus(HttpStatus.OK)
	public String addEmployee(@RequestHeader("Content-Type") String contentType)
	{
		if (contentType.equalsIgnoreCase(MediaType.APPLICATION_XML_VALUE))
		{
			System.out.println();
		}
		else if (contentType.equalsIgnoreCase(MediaType.APPLICATION_JSON_VALUE))
		{
			
		}
		
		return "JSON Value";
	}
	
	private static String getEmployeesXML()
	{
		return "<EMPLOYEES>"
					+ "<EMPLOYEE>"
						+ "<EMPLOYEE_ID>110011</EMPLOYEE_ID>"
						+ "<EMPLOYEE_NAME>ABC DEF</EMPLOYEE_NAME>"
					+ "</EMPLOYEE>"
						+ "<EMPLOYEE_ID>110012</EMPLOYEE_ID>"
						+ "<EMPLOYEE_NAME>PQR XYZ</EMPLOYEE_NAME>"
					+ "<EMPLOYEE>"
					+ "</EMPLOYEE>"
				+ "</EMPLOYEES>";
	}
	
	private static String getEmployeesJSONFromXML()
	{
		// TODO
		return getEmployeesXML();
	}
}