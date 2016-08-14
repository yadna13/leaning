<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <header style="background-color: yellow;height: 20px;">
	  
  </header>
  		<h3>Online Fruit Store</h3>
  	<br/>
  	<br/>
  	<form action="checkFruit.do" method="get">
  		 Enter Your Fruit Name <input type="text" name="fruitName" style="background-color: white;"/>
  		 <input type="submit" value="Check"/>
  </form>

<hr/>
	<span style="font-size: 14px;color: blue;font-weight: bold;">
				${ApplicationMessage}
		</span>
</body>
</html>