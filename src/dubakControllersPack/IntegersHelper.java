package dubakControllersPack;

//import java.io.Console;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dubakBeansPack.IntegersModel;

public class IntegersHelper 
{

	/** Instance of bean @type Object */
	protected IntegersModel data = new IntegersModel();
	
	/** Instance of Servlet request		@type Object */
	protected HttpServletRequest request;
	
	protected HttpServletResponse response;
	
	/**
	 * @		Constructor
	 * @param 	HttpServletRequest	request		URL request
	 * @param	HttpServletResponse	response	Servlet responce
	 * @return	void
	 */
	public IntegersHelper(HttpServletRequest request, HttpServletResponse response) 
	{
		//super (request, response);
		this.request = request;
		this.response = response;
	}	
	
	
	/**
	 * @param	void
	 * @return	Object  
	 */
	public Object getData() 
	{
		return this.data;
	}	
	
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet() throws ServletException, IOException 
	{
		// call mutators of bean
		this.data.setFirstNumber(this.request.getParameter("firstNumber"));
		this.data.setSecondNumber(this.request.getParameter("secondNumber"));		
				
System.out.println("IN Helper Integers doGet");		
		String address;

		if (this.request.getParameter("process") != null)
		{			
			this.data.setResult(this.request.getParameter("operation")); 			
			
		    address = jspLocation("process.jsp");
		}
		else if ( this.request.getParameter("confirm") != null )
		{
			this.data.setOperation(this.request.getParameter("operation"));
			this.data.setResult(this.request.getParameter("operation"));
			
			address = jspLocation("confirm.jsp");
		}
		// default page
		else {
		    address = jspLocation("index.jsp");
		}

		// set data into session, The second parameter is the bean, which contains the data; the first parameter is an arbitrary name
		this.request.getSession().setAttribute("integersHelperData", this.data);
		
		RequestDispatcher dispatcher = this.request.getRequestDispatcher(address);

		dispatcher.forward(this.request, this.response);
	}	
	
	/**
	 * 
	 * @param 	String	page
	 * @return	String	page	
	 */
	protected String jspLocation(String page) 
	{
		return "/WEB-INF/views/integers/" + page;
	}	
	
	
}
