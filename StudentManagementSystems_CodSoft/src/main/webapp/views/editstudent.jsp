<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<body>
<h1>Edit Student Data</h1>
<form:form method="POST" action="/editu">
<table>
       <tr>
       <td>Enter Your Id:</td>
       <td><form:input path="sid"/> </td>
       </tr>
       <tr>
       <td>Enter Your Name:</td>
       <td><form:input path="name"/> </td>
       </tr>
       <tr>
       <td>Enter Your Password:</td>
       <td><form:input path="password"/> </td>
       </tr>
       <tr>
       <td>Enter Your Email:</td>
       <td><form:input path="email"/> </td>
       </tr>
       <tr>
       <td>Enter Your PhoneNo:</td>
       <td><form:input path="phoneNo"/> </td>
       </tr>
       <tr>
       <td>Enter Your Gender:</td>
       <td><form:input path="gender"/> </td>
       </tr>
       <tr>
       <td>Enter Your Address:</td>
       <td><form:input path="address"/> </td>
       </tr>
       <tr>
       <td>Enter Your City:</td>
       <td><form:input path="city"/> </td>
       </tr>
       <tr>
       <td>Enter Your State:</td>
       <td><form:input path="state"/> </td>
       </tr>
<td></td>
<tr>
<td><input type="submit" value="EditSave"/></td>
</tr>
</table>
</form:form>
<a href="/views">View All Student Details</a><p></p>
<a href="/">Add New Students Here</a>
</body>