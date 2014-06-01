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
    	
		// set data into session, The second parameter is the bean (which contains the data) or value; the first parameter is an arbitrary name
		request.getSession().setAttribute("loopLimit", 5);

		// declares an array of integers and assign their values
		int arrayInts[] = {10,9,8,7,6,5,4,3,2,1};
		request.getSession().setAttribute("arrayInts", arrayInts);
		
		// declares an two-dimensional array of floats and assign their values
		float arrayOfInts[][] = {{1.1f,1.2f,1.3f},{2.1f,2.2f,3.2f},{3.1f,3.2f,3.3f}};

		int rows = 3;
 
		for (  int iCounter = 0;  iCounter < rows ; iCounter++ )
		{
			for ( int i = 0;  i < arrayOfInts[iCounter].length ; i++ ) {
				System.out.println("Row is: " + iCounter + " , columns is: " + i  + " and value of matrix is: " + arrayOfInts[iCounter][i] );
			}
			
		}
		
		
		// declares an array of strings and allocates memory for 2 strings
		String[][] arrayOfStrings = new String[2][2];
		
		arrayOfStrings[0][0] = "string at position [1][1]";
		arrayOfStrings[0][1] = "string at position [1][2]";
		arrayOfStrings[1][0] = "string at position [2][1]";
		arrayOfStrings[1][1] = "string at position [2][2]";
						
    	
		RequestDispatcher dispatcher = request.getRequestDispatcher(this.address);

		dispatcher.forward(request, response);    	    	
    }
    
    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
