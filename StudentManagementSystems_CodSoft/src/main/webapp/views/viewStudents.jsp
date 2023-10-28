<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<h1>Student Details</h1>
<table border="2" width="70%" cellpadding="2">
<tr>
<th>Id</th>
<th>Name</th>
<th>Password</th>
<th>Email</th>
<th>PhoneNo</th>
<th>Gender</th>
<th>Address</th>
<th>City</th>
<th>State</th>
</tr>
<c:forEach var="students" items="${students}">
<tr>
<td>${students.sid}</td>
<td>${students.name}</td>
<td>${students.password}</td>
<td>${students.email}</td>
<td>${students.phoneNo}</td>
<td>${students.gender}</td>
<td>${students.address}</td>
<td>${students.city}</td>
<td>${students.state}</td>
<td><a href="/delete/${students.sid}">Delete</a></td>
<td><a href="/studentsid/${students.sid}">Edit</a>
</td>
</tr>
</c:forEach>
</table>