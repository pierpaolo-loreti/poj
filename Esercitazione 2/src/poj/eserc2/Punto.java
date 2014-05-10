package poj.eserc2;

public class Punto {

	private double x;
	private double y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "] " + super.toString();
	}

	public double distanzaDallOrigine() {
		return Math.sqrt(x * x + y * y);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Punto(x, y);
	}

}
