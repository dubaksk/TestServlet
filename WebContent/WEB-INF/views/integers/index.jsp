<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN">
<html>
	<head>
	<meta http-equiv="Content-type" content="text/html;charset=utf-8" />
	<title>Index | Integers Dubak</title>
	</head>
	
	<body>
	<b>Driven by Dubak Integers servlet</b>
		<form method="get">
			<p>
			    This is a simple HTML page that has a form in it.
			</p>
			<p>
			    The small number was received as: <b>${integersHelperData.firstNumber}</b>
			    <br />
			    The big number was received as: <b>${integersHelperData.secondNumber}</b>
			</p>
			<p>
                First number: <input type="text" name="firstNumber" value="${integersHelperData.firstNumber}" />
			    <br />
			    Second number: <input type="text" name="secondNumber" value="${integersHelperData.secondNumber}" />                
                			    
				<select name="operation">
				  <option value="adding">Adding</option> 
				  <option value="substraction" selected>Substraction</option>
				  <option value="multiplication" selected>Multiplication</option> 
				  <option value="division">Division</option>
				</select>                			                    			                   			   
                			    
			    <input type="submit" name="confirm" value="Confirm" />
			    
			</p>
		</form>
    </body>
</html>