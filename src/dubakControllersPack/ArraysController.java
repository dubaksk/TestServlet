package dubakControllersPack;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class Controller
 */
public class ArraysController extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	
	public static double iVersion = 0.1;
	
	private String address = "";
    
	
    /**
     * Constructor
     */
    public ArraysController() 
    {
    	// invoke the parent class's constructor
        super();
    }

    
    /**
     * processing GET method sent to controller 
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
    	ArraysHelper helper = new ArraysHelper(request, response);
    	
    	this.address = helper.getView();
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher(this.address);

		dispatcher.forward(request, response);
    	    	
    }
    
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
