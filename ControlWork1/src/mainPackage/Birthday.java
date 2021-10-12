package mainPackage;

import java.util.Objects;

public class Birthday extends ParentPlanner {
	private String FIO;

	protected Birthday() {
		super();
		this.FIO = "";
	}

	protected Birthday(int year, int mounth, int day, int hour, int p, String s) {
		super(year, mounth, day, hour, p);
		this.FIO = s;
	}

	public String toString() {
		String str = super.toString() + " День рождения у: " + this.FIO;
		return str;
	}

	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.FIO == null) ? 0 : this.FIO.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		Birthday guest = (Birthday) obj;
		return super.equals(guest) && Objects.equals(this.FIO, guest.FIO);
	}

	public int compareTo(Object o) {
		return super.compareTo(o);
	}

}
