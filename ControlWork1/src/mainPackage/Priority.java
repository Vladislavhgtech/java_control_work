package mainPackage;

public enum Priority {

	неВажно(0), стандартно(1), важно(2), оченьВажно(3);

	public final int count;

	private Priority(int count) {
		this.count = count;
	}

}
