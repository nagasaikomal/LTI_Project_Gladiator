import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Route {

	@Id
	@Column(name="route_id")
	private int routeId;
	@Column(name="route_source")
	private String routeSource;
	@Column(name="route_destination")
	private String routeDestination;
	
	
	public Route() {
		super();
		
	}
	
	public Route(int routeId, String routeSource, String routeDestination) {
		super();
		this.routeId = routeId;
		this.routeSource = routeSource;
		this.routeDestination = routeDestination;
	}
	
	public int getRouteId() {
		return routeId;
	}
	public void setRouteId(int routeId) {
		this.routeId = routeId;
	}
	public String getRouteSource() {
		return routeSource;
	}
	public void setRouteSource(String routeSource) {
		this.routeSource = routeSource;
	}
	public String getRouteDestination() {
		return routeDestination;
	}
	public void setRouteDestination(String routeDestination) {
		this.routeDestination = routeDestination;
	}

	@Override
	public String toString() {
		return "Route [routeId=" + routeId + ", routeSource=" + routeSource + ", routeDestination=" + routeDestination
				+ "]";
	}
	
	
	
}
