<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<h1>Users</h1>

<ul>
  <c:forEach var="user" items="${users}">
    <li>${user.fullName}[${user.email}]</li>
  </c:forEach>
</ul>

<br>

<a href="/users/register">Register</a>