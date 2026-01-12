package hotel_Reservation;

public class Reservation {
	private String guest_name;
	private int room_no;
	private long contact_no;
	
	
	
	public Reservation(String guest_name, int room_no, long contact_no) {
		this.guest_name = guest_name;
		this.room_no = room_no;
		this.contact_no = contact_no;
	}


	public String getGuest_name() {
		return guest_name;
	}



	public void setGuest_name(String guest_name) {
		this.guest_name = guest_name;
	}



	public int getRoom_no() {
		return room_no;
	}



	public void setRoom_no(int room_no) {
		this.room_no = room_no;
	}



	public long getContact_no() {
		return contact_no;
	}



	public void setContact_no(long contact_no) {
		this.contact_no = contact_no;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
