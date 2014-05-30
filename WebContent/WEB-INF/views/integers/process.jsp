<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-type" content="text/html;charset=utf-8" />
    <title>Process Page</title>
</head>
<body>
    <b>Driven by Dubak Integers servlet</b>
    <p>
        Thank you for your information. 
    </p>
    <p>    
        The small number was received as: <b>${integersHelperData.firstNumber}</b>
        <br />
        The big number was received as: <b>${integersHelperData.secondNumber}</b>
        <br />
        The result is: <b>${integersHelperData.result}</b>                
    </p>

	<form action="#" method="get">
	           
        First number: <input type="text" name="firstNumber" value="${integersHelperData.firstNumber}" />
        <br />
        Second number: <input type="text" name="secondNumber" value="${integersHelperData.secondNumber}" />                
        <br />
		<input type="submit" name="editButton" value="Edit" />
	</form>


<!--
<c:forEach items="${integersHelperData}" var="myItem" varStatus="myItemStat">
    <c:out value="${myItem}"/> ${myItemStat}<br />
</c:forEach>  
-->

</body>
</html>