
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LOGIN PAGE</title>
<script type="text/javascript" src="loginvalidation.js"></script>
</head>
<body>
<jsp:useBean id="login" class="userlogin.LoginBean" scope="request" />

<form name="login" action="LoginServlet"  onsubmit="return loginvalidation(this)" method="post">

FristName:<input type="text" name="Firstname" value=
<c:if test="${not empty message}">
${login.getFirstName()} </c:if>><br>
LastName:<input type="text" name="Lastname" value=<c:if test="${not empty message}">
${login.getLastName()} </c:if>><br>
USERNAME:<input type="text" name="Uname">
<c:if test="${not empty message}">
  <font color="red"   >${message}</font>
</c:if><br>
PassWord:
<input type="password" name="pswd1"  ><br>
Confirm Password:
<input type="password" name="pswd2" ><br>
BirthDay: MONTH
<select name="MONTH">
<option value="JANUARY">January</option>
<option value="FEB">February</option>
<option value="MARCH">March</option>
<option value="APRIL">April</option>
<option value="May">May</option>
<option value="June">June</option>
<option value="July">July</option>
<option value="August ">August </option>
<option value="September ">September </option>
<option value="October ">October </option>
<option value="November ">November </option>
<option value="December ">December </option></select>
DAY<input type="text" name="DAY"><br>
YEAR
<select name="YEAR">
<option value="1985">1985</option>
<option value="1986">1986</option>
<option value="1987">1987</option>
<option value="1988">1988</option>
<option value="1989">1989</option>
<option value="1990">1990</option>
<option value="1991">1991</option>
<option value="1992">1992 </option>
<option value="1993">1993 </option>
<option value="1994">1994 </option>
<option value="1995">1995 </option>
<option value="1996">1996 </option></select><br>
MOBILE PHONE:<input type="text" name="phonenumber" value=<c:if test="${not empty message}">
${login.getPhonenumber()}</c:if>><br>
<input type="checkbox" name="terms&conditions" value="true">I agree terms and conditions........<br>
<input type="submit" name="register" value="REGISTER">
</form>
</body>
</html>