<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Add Reservation</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<header>
    <h1>Add New Reservation</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="viewReservations.jsp">View All</a></li>
        </ul>
    </nav>
</header>

<main>
    <form action="addReservation" method="post">
        <label>Guest Name:</label>
        <input type="text" name="guest_name" required>

        <label>Room Number:</label>
        <input type="number" name="room_no" required>

        <label>Contact Number:</label>
        <input type="tel" name="contact_no" required>

        <button type="submit">Add Reservation</button>
    </form>
</main>

<footer>
    <p>© 2025 Hotel Management System</p>
</footer>
</body>
</html>
