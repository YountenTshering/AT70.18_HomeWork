<!DOCTYPE html>
<html lang="en">

<head>
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
                    <!-- <c:forEach items="${employeeList}" var="emp">
                        <tr>
                            <td scope="row"><c:out value="{emp.eid}"/></td>
                            <td><c:out value="{emp.name}"/></td>
                            <td><c:out value="{emp.gender}"/></td>
                            <td><c:out value="{emp.address}"/></td>
                            <td><c:out value="{emp.salary}"/></td>
                            <td><c:out value="{emp.value}"/></td>
                            <td><c:out value="{emp.netvalue}"/></td>
                            <td>
                                <button type="button" class="btn btn-primary">Edit</button>
                                <button type="button" class="btn btn-danger">Delete</button>
                            </td>
                        </tr>
                    </c:forEach> -->
                    <tr class="table-light">
                        <td scope="row">1</td>
                        <td>Younten</td>
                        <td>Male</td>
                        <td>AIT</td>
                        <td>12000</td>
                        <td>111000</td>
                        <td>99000</td>
                        <td>
                            <div class="row">
                                <form action="edit" method="GET">
                                    <button type="submit" class="btn btn-primary">Edit</button>
                                </form>
                                &nbsp;&nbsp;
                                <form action="employee" method="DELETE">
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                </form>
                            </div>

                        </td>
                    </tr>

                    <tr class="table-light">
                        <td scope="row">1</td>
                        <td>Sonam</td>
                        <td>Female</td>
                        <td>Bhutan</td>
                        <td>9000</td>
                        <td>9000</td>
                        <td>0</td>
                        <td>
                            <div class="row">
                                <form action="edit" method="GET">
                                    <button type="submit" class="btn btn-primary">Edit</button>
                                </form>
                                &nbsp;&nbsp;
                                <form action="employee" method="DELETE">
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                </form>
                            </div>

                        </td>
                    </tr>

                    <tr class="table-light">
                        <td scope="row">1</td>
                        <td>Sam</td>
                        <td>Female</td>
                        <td>England</td>
                        <td>1000</td>
                        <td>2000</td>
                        <td>1000</td>
                        <td>
                            <div class="row">
                                <form action="edit" method="GET">
                                    <button type="submit" class="btn btn-primary">Edit</button>
                                </form>
                                &nbsp;&nbsp;
                                <form action="employee" method="DELETE">
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                </form>
                            </div>

                        </td>
                    </tr>

                    <tr class="table-light">
                        <td scope="row">1</td>
                        <td>Jo</td>
                        <td>Female</td>
                        <td>High Land</td>
                        <td>12000</td>
                        <td>1000</td>
                        <td>-11000</td>
                        <td>
                            <div class="row">
                                <form action="edit" method="GET">
                                    <button type="submit" class="btn btn-primary">Edit</button>
                                </form>
                                &nbsp;&nbsp;
                                <form action="employee" method="DELETE">
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                </form>
                            </div>

                        </td>
                    </tr>

                    <tr class="table-light">
                        <td scope="row">1</td>
                        <td>Sad</td>
                        <td>Male</td>
                        <td>Japan</td>
                        <td>18000</td>
                        <td>9000</td>
                        <td>-9000</td>
                        <td>
                            <div class="row">
                                <form action="edit" method="GET">
                                    <button type="submit" class="btn btn-primary">Edit</button>
                                </form>
                                &nbsp;&nbsp;
                                <form action="employee" method="DELETE">
                                    <button type="submit" class="btn btn-danger">Delete</button>
                                </form>
                            </div>

                        </td>
                    </tr>
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