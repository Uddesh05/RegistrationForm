<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Registration Page</title>
  <style>
    body {
      font-family: Arial, sans-serif;
      background-color: #f0f0f0;
      margin: 0;
      padding: 0;
    }
    .container {
      max-width: 400px;
      margin: 50px auto;
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    }
    h2 {
      text-align: center;
    }
    label {
      font-weight: bold;
    }
    input[type="text"],
    input[type="password"],
    input[type="email"] {
      width: 100%;
      padding: 10px;
      margin: 8px 0;
      box-sizing: border-box;
      border: 1px solid #ccc;
      border-radius: 4px;
    }
    input[type="submit"] {
      background-color: #4caf50;
      color: white;
      padding: 14px 20px;
      margin: 8px 0;
      border: none;
      border-radius: 4px;
      cursor: pointer;
      width: 100%;
    }
    input[type="submit"]:hover {
      background-color: #45a049;
    }
  </style>
</head>
<body>

<div class="container">
  <h2>Registration Form</h2>
  <form action="<%= request.getContextPath()%>/register" method="post">
    <label for="fname">First Name</label>
    <input type="text" id="fname" name="name" required>

    <label for="lname">Last Name</label>
    <input type="text" id="lname" name="lastname" required>

    <label for="username">Username</label>
    <input type="text" id="username" name="username" required>

    <label for="password">Password</label>
    <input type="password" id="password" name="password" required>

    <label for="contact">Contact</label>
    <input type="text" id="contact" name="contact" required>

    <input type="submit" value="Submit">
   
  </form>
  <a href="/login">
    <button>Login here</button>
    </a>
</div>

 
</body>
</html>