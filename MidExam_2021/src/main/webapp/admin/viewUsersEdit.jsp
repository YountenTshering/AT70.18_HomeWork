<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin user/employee List</title>
</head>
<body>
<h3>User Management</h3>

<a href="/admin/addUser">Add Employee</a>

<br><br>
<a href="logout">Logout</a>

<br><br>
<table class="table" border="2">
    <thead>
    <tr>
        <th scope="col">ID</th>
        <th scope="col">Name</th>
        <th scope="col">Level</th>
        <th scope="col">DOB</th>
        <th scope="col">Action</th>

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${employees}" var="employee">
        <tr>
            <th scope="row">${employee.id}</th>
            <td>${employee.name}</td>
            <td>${employee.level}</td>
            <td>${employee.birthday}</td>
            <td>
                <form action="/admin/editEmployee/${employee.id}" method="get">
                    <input type="submit" value="Edit">
                </form>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>

</body>
</html>