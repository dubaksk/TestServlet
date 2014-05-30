package dubakBeansPack;

//import java.io.IOException;

//import javax.servlet.ServletException;

public class IntegersModel {

	/**
	 * @param args
	 *
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
*/
	protected Double firstNumber, secondNumber;
		
	private Double result = 0.0;
	
	protected String operation;

	public IntegersModel() {
		
	}

	
	public boolean isValidOperation(String operation) 
	{
		Boolean bResult = false;
		
		if ( operation != null && !operation.trim().equals("") )
		{
			bResult = true;			
		}
		
		return bResult; 		
	}	

	
	public void setSecondNumber(String secondNumber) 
	{
		if ( this.isValidNumber( secondNumber ) )
		{
			this.secondNumber = Double.parseDouble(secondNumber);	
		}
		else {
			this.secondNumber = 0.0;
		}
		
		
	}

	
	public Double getSecondNumber() 
	{
		return this.secondNumber;	
	}

	
	public boolean isValidNumber(String number) 
	{
		Boolean bResult = false;
		
		if ( number != null && !number.trim().equals("") )
		{
			bResult = true;			
		}
		
		return bResult; 			
	}
	
	
	public void setFirstNumber(String firstNumber) 
	{
		if ( this.isValidNumber( firstNumber ) )
		{
			this.firstNumber = Double.parseDouble(firstNumber);	
		}
		else {
			this.firstNumber = 0.0;
		}
		
	}

	
	public Double getFirstNumber() 
	{		
		return this.firstNumber;
	}
	
	
	public void setResult ( String operation )
	{
		switch ( operation )
		{
			case "adding":
				
				this.result = (double)(this.firstNumber + this.secondNumber);	
				
			break;
			
			case "substraction":
				
				this.result = (double)(this.firstNumber - this.secondNumber);	
				
			break;
			
			case "multiplication":
				this.result = (double)(this.firstNumber * this.secondNumber);
			break;
			
			case "division":
				if ( this.secondNumber > 0 )
				{
					this.result = (double)(this.firstNumber / this.secondNumber);
				}	
			break;			
		}						
	}
	

	public Double getResult ( )
	{
		return this.result;
	}
	
	
	public void setOperation ( String operation )
	{
		if ( isValidOperation(operation) )
		{
			this.operation = operation;
		}			
	}

	
	public String getOperation ( )
	{
		return this.operation;
	}

	
}
