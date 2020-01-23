import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(SeatID.class)
public class Seat {
	
	@Id
	@Column(name="seat_id")
	private String seatId;
	@Id
	@Column(name="bus_id")
	private int busId;
	@Id
	@Column(name="status")
	private String status;
	@Id
	@Column(name="bus_departure_date")
	private Date busDepartureDate;
	
	public Seat(){
		super();
	}
	
	
	public Seat(String seatId, int busId, String status, Date busDepartureDate) {
		super();
		this.seatId = seatId;
		this.busId = busId;
		this.status = status;
		this.busDepartureDate = busDepartureDate;
	}


	public String getSeatId() {
		return seatId;
	}


	public void setSeatId(String seatId) {
		this.seatId = seatId;
	}


	public int getBusId() {
		return busId;
	}


	public void setBusId(int busId) {
		this.busId = busId;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Date getBusDepartureDate() {
		return busDepartureDate;
	}


	public void setBusDepartureDate(Date busDepartureDate) {
		this.busDepartureDate = busDepartureDate;
	}


	@Override
	public String toString() {
		return "Seat [seatId=" + seatId + ", busId=" + busId + ", status=" + status + ", busDepartureDate="
				+ busDepartureDate + "]";
	}
	
	
	
	

}

/*create table seat_details
(
seat_id varchar(5),
bus_id number(4),
status varchar(15),
bus_departure_date date,
primary key(seat_id,bus_id,status,bus_departure_date),
constraint seat_bus_date_fk foreign key(bus_id) references bus_details(bus_id)
);*/