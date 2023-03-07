<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Form</title>
</head>
<body>
<div class="container">
    <h1>Enter Your Details</h1>
    <form id="myForm" action="RegisterServlet" method="post">
        <table>
            <td>Enter your Name: </td>
            <td><input type="text" name="user_name" placeholder="Your Name"></td>
            <td>Enter your Number : </td>
            <td><input type="number" name="phone_number" placeholder="00000000"></td>
            <td>Enter your City: </td>
            <td><input type="text" name="user_city" placeholder="Patna"></td>
            <td><button type="submit">Submit</button></td>
        </table>
    </form>
</div>
</body>
</html>