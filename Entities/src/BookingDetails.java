import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BookingDetails {

	@Id
	@Column(name="booking_id")
	private int bookingId;
	@Column(name="bus_id")
	private int busId;
	@Column(name="passenger_id")
	private int passengerId;
	@Column(name="booking_date")
	private Date bookingDate;
	@Column(name="Bus_departure_date")
	private Date busDepartureDate;
	
	
	public BookingDetails() {
		super();
	}
	
	
	
	public BookingDetails(int bookingId, int busId, int passengerId, Date bookingDate, Date busDepartureDate) {
		super();
		this.bookingId = bookingId;
		this.busId = busId;
		this.passengerId = passengerId;
		this.bookingDate = bookingDate;
		this.busDepartureDate = busDepartureDate;
	}



	public int getBookingId() {
		return bookingId;
	}



	public void setBookingId(int bookingId) {
		this.bookingId = bookingId;
	}



	public int getBusId() {
		return busId;
	}



	public void setBusId(int busId) {
		this.busId = busId;
	}



	public int getPassengerId() {
		return passengerId;
	}



	public void setPassengerId(int passengerId) {
		this.passengerId = passengerId;
	}



	public Date getBookingDate() {
		return bookingDate;
	}



	public void setBookingDate(Date bookingDate) {
		this.bookingDate = bookingDate;
	}



	public Date getBusDepartureDate() {
		return busDepartureDate;
	}



	public void setBusDepartureDate(Date busDepartureDate) {
		this.busDepartureDate = busDepartureDate;
	}



	@Override
	public String toString() {
		return "BookingDetails [bookingId=" + bookingId + ", busId=" + busId + ", passengerId=" + passengerId
				+ ", bookingDate=" + bookingDate + ", busDepartureDate=" + busDepartureDate + "]";
	}
	
	
}


/*create table booking_details
(booking_id number(5) primary key,
 bus_id number(5),
 passenger_id number(5),
 booking_date date,
 Bus_departure_date date,
 constraint booking_details_bus_id_fk foreign key(bus_id) references bus_details(bus_id),
 constraint booking_passenger_id_fk foreign key(passenger_id) references passenger(passenger_id)	 
 );*/
