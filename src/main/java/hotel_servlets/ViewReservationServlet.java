package hotel_servlets;

import java.io.IOException;
import java.sql.*;
import java.util.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import connection.Connector;

@WebServlet("/viewReservations")
public class ViewReservationServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        List<Map<String, Object>> data = new ArrayList<>();
        try (Connection con = Connector.createConnection();
             PreparedStatement ps = con.prepareStatement("SELECT * FROM reservations");
             ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Map<String, Object> row = new HashMap<>();
                row.put("id", rs.getInt(1));
                row.put("name", rs.getString(2));
                row.put("room", rs.getInt(3));
                row.put("contact", rs.getLong(4));
                row.put("date", rs.getDate(5));
                data.add(row);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.setAttribute("reservations", data);
        RequestDispatcher rd = req.getRequestDispatcher("viewReservations.jsp");
        rd.forward(req, resp);
    }
}
