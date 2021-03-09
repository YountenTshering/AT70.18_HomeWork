<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Edit Employee</title>
  </head>
  <body>
    <h2>Edit Employee</h2>

    <br />

    <form method="post" action="editemployee">
      <label for="Id">User ID</label>
      <input name="id" type="text" id="Id" readonly value="${employee.id}" />
      <br /><br />

      <label for="name">Name</label>
      <input
        name="name"
        type="text"
        id="name"
        required
        value="${employee.name}"
      />
      <br /><br />

      <label for="level">Level</label>

      <select name="level" id="level">
        <c:forEach items="${level}" var="level">
          <c:choose>
            <c:when test="${employee.level == level}">
              <option value="${level}" selected="selected">${level}</option>
            </c:when>
            <c:otherwise>
              <option>${level}</option>
            </c:otherwise>
          </c:choose>
        </c:forEach>
      </select>

      <br /><br />

      <label for="birthday">DOB</label>
      <input
        name="birthday"
        type="date"
        id="birthday"
        value="${Employee.birthday}"
      />
      <br />
      <br />
      <input type="submit" value="Update" />
    </form>
  </body>
</html>
