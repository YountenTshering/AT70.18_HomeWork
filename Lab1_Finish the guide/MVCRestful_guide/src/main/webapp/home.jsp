<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1" />
    <title>Add User and Get User</title>
  </head>
  <body>
    <label>Add User</label>
    <form action="addUser">
      UID: <input type="text" name="eid" /><br />
      Name: <input type="text" name="name" /><br />
      Nationality: <input type="text" name="nationlity" /><br />
      <input type="submit" />
    </form>

    <label>Get User by specifying ID</label>
    <form action="getUser">
      UID: <input type="text" name="eid" /><br />
      <input type="submit" />
    </form>
  </body>
</html>
