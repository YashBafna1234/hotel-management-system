<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Hotel Management System</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<header>
    <h1>🏨 Hotel Management System</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li> 
            <li><a href="addReservation.jsp">Add Reservation</a></li>
            <li><a href="viewReservations.jsp">View All</a></li>
            <li><a href="updateReservation.jsp">Update</a></li>
            <li><a href="deleteReservation.jsp">Delete</a></li>
        </ul>
    </nav>
</header>

<main>
    <h2>Welcome to Hotel Management System</h2>
    <p>Manage your hotel’s reservations quickly and efficiently.</p>
    <button onclick="window.location.href='addReservation.jsp'">Add New Reservation</button>
</main>

<footer>
    <p>© 2025 Hotel Management System | Designed by Yash Bafna</p>
</footer>
</body>
</html>
