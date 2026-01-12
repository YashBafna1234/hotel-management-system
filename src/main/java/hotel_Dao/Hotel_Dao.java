package hotel_Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connection.Connector;
import hotel_Reservation.Reservation;

public class Hotel_Dao {
	
	public static void reserve_room(Reservation res) throws ClassNotFoundException, SQLException {
		Connection con = Connector.createConnection();
		
		String query = "insert into reservations (guest_name,room_no,contact_no) values (?,?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, res.getGuest_name());
		ps.setInt(2, res.getRoom_no());
		ps.setLong(3, res.getContact_no());
		
		boolean result = ps.execute();
		if(!result) {
			System.out.println("Values Inserted Successfully");
		}else {
			System.out.println("Values Not Inserted, Try Again !!...");
		}
	}
	public static void all_reservation() throws ClassNotFoundException, SQLException {
		Connection con = Connector.createConnection();
		String query = "select * from reservations";
		
		PreparedStatement ps = con.prepareStatement(query);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4)+" "+rs.getDate(5));
		}
	}
	
	public static void check_reservation(int id) throws ClassNotFoundException, SQLException {
		Connection con = Connector.createConnection();
		String query = "select * from reservations where guest_id = (?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getLong(4)+" "+rs.getDate(5));
		}
	}
	
	public static void get_room_no(String name) throws ClassNotFoundException, SQLException {
		Connection con = Connector.createConnection();
		String query = "select room_no from reservations where guest_name = (?)";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, name);
		ResultSet rs = ps.executeQuery();
		while(rs.next()) {
			System.out.println("Room No for "+name+" is "+rs.getInt(1));
		}
	}
	
	public static void update_reservation(int id,String name,int room,long contact,java.sql.Date date) throws ClassNotFoundException, SQLException {
		Connection con = Connector.createConnection();
		String query = "update reservations set guest_name = ?,room_no = ?,contact_no = ?,reservation_date = ? where guest_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setString(1, name);
		ps.setInt(2, room);
		ps.setLong(3, contact);
		ps.setDate(4, date);
		ps.setInt(5, id);
		
		boolean result = ps.execute();
		if(!result) {
			System.out.println("Date Updated Successfully for id: "+id);
		}else {
			System.out.println("Please Try Again !!...");
		}
	}
	
	public static void delete_reservation(int id) throws ClassNotFoundException, SQLException {
		Connection con = Connector.createConnection();
		String query = "delete from reservations where guest_id = ?";
		PreparedStatement ps = con.prepareStatement(query);
		ps.setInt(1, id);
		boolean result = ps.execute();
		if(!result) {
			System.out.println("Data Deleted for id: "+id);
		}else {
			System.out.println("Please Try Again !!...");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
