<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Delete Reservation</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<header>
    <h1>Delete Reservation</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="viewReservations.jsp">View All</a></li>
        </ul>
    </nav>
</header>

<main>
    <form action="deleteReservation" method="post">
        <label>Enter Guest ID to Delete:</label>
        <input type="number" name="guest_id" required>

        <button type="submit">Delete</button>
    </form>
</main>

<footer>
    <p>© 2025 Hotel Management System</p>
</footer>
</body>
</html>
