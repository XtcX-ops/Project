package Entitites;

import java.util.Objects;

public class Airport {
	private int airport_id;
	private String location;
	private String name;
	public Airport(int airport_id, String location, String name) {
		super();
		this.airport_id = airport_id;
		this.location = location;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Airport [airport_id=" + airport_id + ", location=" + location + ", name=" + name + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(airport_id);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airport other = (Airport) obj;
		return airport_id == other.airport_id;
	}
	
	
}
