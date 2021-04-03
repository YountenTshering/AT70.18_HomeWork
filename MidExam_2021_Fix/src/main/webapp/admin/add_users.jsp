<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>Add User</title>
  </head>
  <body>
    <h2>Add Users</h2>
    <br /><br />
    <a href="logout">Logout</a>
    <br />
    <br /><br />
    <form method="post" action="addUser">
      <label for="name">Name</label>
      <input name="name" type="text" id="name" required />
      <br /><br />

      <label for="level">Level</label>
      <select name="level" id="level">
        <option value="C1">C1</option>
        <option value="C2">C2</option>
        <option value="C3">C3</option>
      </select>
      <br /><br />

      <label for="birthday">DOB</label>
      <input name="birthday_" type="date" id="birthday" />
      <br />
      <br />
      <input type="submit" value="Add" />
    </form>
  </body>
</html>
