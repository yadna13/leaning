<%@ taglib uri="http://www.springframework.org/tags/form" prefix="ff"%>
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
  	<ff:form action="uploadFruit.do" method="post" commandName="fruit">
  	     <table cellpadding="10">
  	     <tr> 
  	      <td>
  		 Name  :
  		 </td>
  		 <td>  <input type="text" name="name" style="background-color: white;width: 300px;"/></td>
  		 </tr>
  		 
  		  <tr> 
  	      <td>
  		 price  :
  		 </td>
  		 <td>  <input type="text" name="price" style="background-color: white;width: 300px;"/></td>
  		 </tr>
  		 
  		   <tr> 
  	      <td>
  		 Taste  :
  		 </td>
  		 <td>  
  		 	<select name="Taste" style="width: 100px;">
  		 			<option>Sweet</option>
  		 			<option>Sour</option>
  		 	</select>
  		 
  		 </td>
  		 </tr>
  		 
  		 
  		 <tr> 
  	      <td>
  		 Email  :
  		 </td>
  		 <td>  <input type="text" name="email" style="background-color: white;width: 300px;"/></td>
  		 </tr>
  		 
  		 
  		 <tr> 
  	      <td>
  		 Mobile  :
  		 </td>
  		 <td>  <input type="text" name="mobile" style="background-color: white;width: 300px;"/></td>
  		 </tr>
  		 
  		 
  		 
  		  <tr> 
  	      <td>
  		   :
  		 </td>
  		 <td>   <input type="submit" value="Upload"/></td>
  		 </tr>
  		
  		
  		
 </table>
  </ff:form>

<hr/>
	<span style="font-size: 14px;color: blue;font-weight: bold;">
				${ApplicationMessage}
		</span>
</body>
</html>