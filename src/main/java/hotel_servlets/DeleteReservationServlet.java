package hotel_servlets;

import java.io.IOException;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import connection.Connector;

@WebServlet("/deleteReservation")
public class DeleteReservationServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        try (Connection con = Connector.createConnection()) {
            PreparedStatement ps = con.prepareStatement("DELETE FROM reservations WHERE guest_id=?");
            ps.setInt(1, id);
            ps.executeUpdate();
            resp.sendRedirect("viewReservations");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
