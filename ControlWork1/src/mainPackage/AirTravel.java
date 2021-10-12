package mainPackage;

import java.util.Objects;

public class AirTravel extends ParentPlanner {
	private String DepartureAirport; // Аэропорт вылета
	private String ArrivalAirport; // Аэропорт прилёта

	protected AirTravel() {
		super();
		this.DepartureAirport = "";
		this.ArrivalAirport = "";
	}

	protected AirTravel(int year, int mounth, int day, int hour, int minute, int p, String d, String a) {
		super(year, mounth, day, hour, p);
		this.DepartureAirport = d;
		this.ArrivalAirport = a;
	}

	public String toString() {
		String str = super.toString() + "  Аэропорт вылета:  " + this.DepartureAirport + "  Аэропорт прилёта:  "
				+ this.ArrivalAirport;

		return str;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.DepartureAirport == null) ? 0 : this.DepartureAirport.hashCode());
		result = prime * result + ((this.ArrivalAirport == null) ? 0 : this.ArrivalAirport.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		AirTravel guest = (AirTravel) obj;
		return super.equals(guest) && Objects.equals(this.DepartureAirport, guest.DepartureAirport)
				&& Objects.equals(this.ArrivalAirport, guest.ArrivalAirport);
	}

	public int compareTo(Object o) {
		return super.compareTo(o);
	}
}
