<%@ page language="java" import="java.io.*,java.util.*, javax.servlet.*, java.text.*" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN">
<html>
<head>
    <meta http-equiv="Content-type" content="text/html;charset=utf-8" />
    <title>Confirmation Page with Edit Option</title>
</head>
<body>
    <b>Driven by Dubak Integers servlet</b>

    <p>    
        The small number was received as: <b>${integersHelperData.firstNumber}</b>
        <br />
        The big number was received as: <b>${integersHelperData.secondNumber}</b>
        <br />
        The result is: <b>${integersHelperData.result}</b>                        
    </p>

	<form method="get">
		<p>
			If there is an error, please select <i>Edit</i>. <br /> 
			
			<input type="hidden" name="firstNumber" value="${integersHelperData.firstNumber}" />
            <input type="hidden" name="secondNumber" value="${integersHelperData.secondNumber}" />
            <input type="hidden" name="operation" value="${integersHelperData.operation}" />			
			<br /> 
			<input type="submit" name="edit" value="Edit" />
			 
            <input type="submit" name="process" value="Process" />			
		</p>		
	</form>
	
	
</body>
</html>