<!DOCTYPE html>
<html lang="en">

<head>

    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Main Page</title>
        <link href="css\bootstrap.min.css" rel="stylesheet">
</head>

<body>
    <div class="container" align="center">
        <h2>List of Employees</h2>
        <div>
            <table class="table table-hover">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Name</th>
                        <th>Gender</th>
                        <th>Address</th>
                        <th>Salary</th>
                        <th>Value</th>
                        <th>Net Value</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${employeeList}" var="emp">
                        <tr>
                            <td scope="row">
                                <c:out value="${emp.eid}" />
                            </td>
                            <td>
                                <c:out value="${emp.name}" />
                            </td>
                            <td>
                                <c:out value="${emp.gender}" />
                            </td>
                            <td>
                                <c:out value="${emp.address}" />
                            </td>
                            <td>
                                <c:out value="${emp.salary}" />
                            </td>
                            <td>
                                <c:out value="${emp.value}" />
                            </td>
                            <td>
                                <c:out value="${emp.netValue}" />
                            </td>
                            <td>
                                <button type="button" class="btn btn-primary">Edit</button>
                                <button type="button" class="btn btn-danger">Delete</button>
                            </td>
                        </tr>
                    </c:forEach> 
                   
                </tbody>
            </table>
        </div>
        <div>
            <form action="add" method="GET">
                <button type="submit" class="btn btn-success">Add New Employee</button>
            </form>
        </div>
    </div>
</body>

</html>