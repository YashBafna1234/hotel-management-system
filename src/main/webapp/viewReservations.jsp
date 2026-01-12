<%@ page language="java" import="java.sql.*,connection.*,hotel_Dao.Hotel_Dao" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Reservations</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
</head>
<body>
<header>
    <h1>All Reservations</h1>
    <nav>
        <ul>
            <li><a href="index.jsp">Home</a></li>
            <li><a href="addReservation.jsp">Add New</a></li>
        </ul>
    </nav>
</header>

<main>
    <table>
        <tr>
            <th>ID</th>
            <th>Guest Name</th>
            <th>Room No</th>
            <th>Contact No</th>
            <th>Date</th>
        </tr>
        <%
            try {
                Connection con = connection.Connector.createConnection();
                PreparedStatement ps = con.prepareStatement("select * from reservations");
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
        %>
        <tr>
            <td><%=rs.getInt(1)%></td>
            <td><%=rs.getString(2)%></td>
            <td><%=rs.getInt(3)%></td>
            <td><%=rs.getLong(4)%></td>
            <td><%=rs.getDate(5)%></td>
        </tr>
        <%
                }
                con.close();
            } catch(Exception e){
                out.println("Error: " + e.getMessage());
            }
        %>
    </table>
</main>

<footer>
    <p>© 2025 Hotel Management System</p>
</footer>
</body>
</html>
