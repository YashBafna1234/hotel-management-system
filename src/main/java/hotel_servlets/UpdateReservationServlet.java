package hotel_servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import connection.Connector;

import hotel_Dao.Hotel_Dao;

@WebServlet("/UpdateServlet")
public class UpdateReservationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        int room = Integer.parseInt(request.getParameter("room"));
        long contact = Long.parseLong(request.getParameter("contact"));
        String dateStr = request.getParameter("date");
        java.sql.Date date = java.sql.Date.valueOf(dateStr);

        try {
            Hotel_Dao.update_reservation(id, name, room, contact, date);
            out.println("<h3>Reservation Updated Successfully!</h3>");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            out.println("<h3>Error updating reservation: " + e.getMessage() + "</h3>");
        }
    }
}
	