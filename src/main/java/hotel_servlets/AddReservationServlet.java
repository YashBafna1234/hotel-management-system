package hotel_servlets;

import java.io.IOException;
import java.sql.SQLException;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import hotel_Dao.Hotel_Dao;
import hotel_Reservation.Reservation;

@WebServlet("/addReservation")
public class AddReservationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        String name = req.getParameter("guest_name");
        int room = Integer.parseInt(req.getParameter("room_no"));
        long contact = Long.parseLong(req.getParameter("contact_no"));

        Reservation res = new Reservation(name, room, contact);
        try {
            Hotel_Dao.reserve_room(res);
            resp.sendRedirect("viewReservations");
        } catch (Exception e) {
            e.printStackTrace();
            resp.getWriter().println("Error: " + e.getMessage());
        }
    }
}
