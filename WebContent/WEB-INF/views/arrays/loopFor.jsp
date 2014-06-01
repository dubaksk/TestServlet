<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01//EN">
<html>
	<head>
	<meta http-equiv="Content-type" content="text/html;charset=utf-8" />
	<title>Loop For | Arrays | Dubak</title>
	</head>
	
	<body>
	<p><b>Driven by Dubak Arrays servlet</b></p>

	<div><a href="/testServlet/arrays">Back to Arrays homepage</a></div>
    <br />
    <div>
	    Simple for each loop:<br />
	    <c:forEach var="i" begin="1" end="${loopLimit}">  
	      This is entry ${i}<br />  
	    </c:forEach>  
    </div>
    <br />
    Simple for each loop with data from session:<br />
	<c:forEach items="${arrayInts}" var="item">
	    <tr>      
	        <td>${item}</td>  
	    </tr>
	</c:forEach>	

    </body>
</html>