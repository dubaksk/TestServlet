package dubakControllersPack;

//import java.io.Console;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class ArraysHelper 
{	
	/** Instance of Http request		@type Object */
	protected HttpServletRequest request;

	/** Instance of Http response		@type Object */	
	protected HttpServletResponse response;
	
	
	/**
	 * Constructor
	 * 
	 * @param 	HttpServletRequest	request		URL request
	 * @param	HttpServletResponse	response	Servlet responce
	 * @return	void
	 */
	public ArraysHelper(HttpServletRequest request, HttpServletResponse response) 
	{
		this.request = request;
		this.response = response;
	}
	
	
	/**
	 * Generate view based on Http request
	 * 
	 * @param 	void
	 * @return	String	address	
	 */	
	protected String getView ( )
	{
		// default page
		String address = jspLocation("index.jsp");
		
		if (this.request.getParameter("submit") != null)
		{
		    if ( this.request.getParameter("loop") != null )
		    {	
		    	switch (this.request.getParameter("loop")) 
		    	{
					case "for":
						address = jspLocation("loopFor.jsp");			
					break;
					
					case "do-while":
						address = jspLocation("loopDoWhile.jsp");
					break;	
				}		    	
		    }
		}		
		
		return address;
	}
	
	
	/**
	 * Generate path to view
	 * @param 	String	page
	 * @return	String	page	
	 */
	protected String jspLocation(String page) 
	{
		return "/WEB-INF/views/arrays/" + page;
	}	
	
	
}
