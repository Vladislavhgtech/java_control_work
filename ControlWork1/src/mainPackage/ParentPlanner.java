package mainPackage;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Objects;

public abstract class ParentPlanner implements Comparable<Object> {

	private GregorianCalendar Data;
	private Priority priorityVar;
	int year;
	int mounth;
	int day;
	int hour;
	int p;

	protected ParentPlanner() {
		this.Data = new GregorianCalendar(2021, Calendar.SEPTEMBER, 30);
		this.priorityVar = Priority.неВажно;
	}

	protected ParentPlanner(int year, int mounth, int day, int hour, int p) {
		this.Data = new GregorianCalendar();
		this.Data.set(Calendar.YEAR, year);
		this.Data.set(Calendar.MONTH, mounth);
		this.Data.set(Calendar.DAY_OF_MONTH, day);
		this.Data.set(Calendar.HOUR_OF_DAY, hour);
		this.Data.set(Calendar.MINUTE, 0);
		this.Data.set(Calendar.SECOND, 0);
		this.priorityVar = Priority.values()[p];
	}

	public String toString() {
		String str = String.format("Приоритет: " + this.priorityVar + " Дата: " + this.Data.getTime());
		return str;
	}

	public int compareTo(Object o) {
		ParentPlanner p = (ParentPlanner) o;
		if (p.Data.compareTo(this.Data) != 0) {
			return p.Data.compareTo(this.Data);
		} else {
			return p.priorityVar.compareTo(this.priorityVar);
		}
	}

	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Data == null) ? 0 : Data.hashCode());
		result = prime * result + ((priorityVar == null) ? 0 : priorityVar.hashCode());
		return result;
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (obj == null || obj.getClass() != this.getClass()) {
			return false;
		}

		ParentPlanner guest = (ParentPlanner) obj;
		return Objects.equals(this.Data, guest.Data) && Objects.equals(this.priorityVar, guest.priorityVar);
	}

}
