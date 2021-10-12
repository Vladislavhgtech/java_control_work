package mainPackage;

import java.util.Arrays;
import java.util.Objects;

public class BusinessMeeting extends ParentPlanner {

	private String Place;
	private String[] Participants;

	protected BusinessMeeting() {
		super();
		this.Place = "";
		this.Participants = null;
	}

	protected BusinessMeeting(int year, int mounth, int day, int hour, int p, String s, String[] strings) {
		super(year, mounth, day, hour, p);
		this.Place = s;
		this.Participants = strings;
	}

	public String toString() {
		String str = super.toString() + "  Место встречи:  " + this.Place + "  Участники встречи:   "
				+ Arrays.toString(this.Participants);

		return str;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.Place == null) ? 0 : this.Place.hashCode());
		result = prime * result + ((this.Participants == null) ? 0 : this.Participants.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		BusinessMeeting guest = (BusinessMeeting) obj;
		return super.equals(guest) && Objects.equals(this.Place, guest.Place)
				&& Objects.equals(this.Participants, guest.Participants);
	}

	public int compareTo(Object o) {
		return super.compareTo(o);
	}
}