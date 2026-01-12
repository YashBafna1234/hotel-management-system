<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Update Reservation</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<header>
    <h1>Update Reservation</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="viewReservations.jsp">View All</a></li>
        </ul>
    </nav>
</header>

<main>
    <form action="updateReservation" method="post">
        <label>Guest ID:</label>
        <input type="number" name="guest_id" required>

        <label>Updated Name:</label>
        <input type="text" name="guest_name" required>

        <label>Updated Room No:</label>
        <input type="number" name="room_no" required>

        <label>Updated Contact No:</label>
        <input type="tel" name="contact_no" required>

        <label>Updated Date (yyyy-mm-dd):</label>
        <input type="text" name="reservation_date" required>

        <button type="submit">Update</button>
    </form>
</main>

<footer>
    <p>© 2025 Hotel Management System</p>
</footer>
</body>
</html>
