package Entitites;

import java.util.Objects;

public class Seat {
	private int seat_id;
	private String seatcode;
	private String seatType;
	private boolean availability;
	public Seat(int seat_id, String seatcode, String seatType, boolean availability) {
		super();
		this.seat_id = seat_id;
		this.seatcode = seatcode;
		this.seatType = seatType;
		this.availability = availability;
	}
	@Override
	public String toString() {
		return "Seat [seat_id=" + seat_id + ", seatcode=" + seatcode + ", seatType=" + seatType + ", availability="
				+ availability + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(seat_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Seat other = (Seat) obj;
		return seat_id == other.seat_id;
	}
	
	
}
