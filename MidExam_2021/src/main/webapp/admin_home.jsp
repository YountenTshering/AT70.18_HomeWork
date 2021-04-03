<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Admin Home</title>
</head>
<body>
    <a href="logout">Logout</a>
    
<script>
    function myFunction() {
        alert("Mail Sent !");
    }
</script>
<br><br>
<h3>Admin</h3>

<a href="admin/viewUserEdit">View User and add & edit</a>
<br><br>

<table class="table" border="2">
    <thead>
    <tr>
        <th scope="col">Employee ID</th>
        <th scope="col">Name</th>
        <th scope="col">Level</th>
        <th scope="col">Action</th>
        

    </tr>
    </thead>
    <tbody>
    <c:forEach items="${users}" var="user">
        <tr>
            <th scope="row">${user.id}</th>
            <td>${user.emp.name}</td>
            <th>${user.emp.level}</th>
            <td>
                <form action="admin/sendMail/${user.id}" method="post" onclick="myFunction()">
                             <input type="submit" value="Send Mail">
                    </form>
                
            </td>
            <td>
            </td>
        </tr>
    </c:forEach>

    </tbody>
</table>

</body>
</html>