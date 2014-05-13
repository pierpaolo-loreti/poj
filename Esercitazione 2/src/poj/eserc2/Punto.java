package poj.eserc2;


public class Punto implements Comparable<Punto>{

	private double x;
	private double y;

	public Punto(double x, double y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Punto [x=" + x + ", y=" + y + "] S=" + distanzaDallOrigine();
	}

	public double distanzaDallOrigine() {
		return Math.sqrt(x * x + y * y);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Punto(x, y);
	}

	@Override
	public int compareTo(Punto other) {
		if(this.distanzaDallOrigine() == other.distanzaDallOrigine())
		    return 0;
		 
		if(this.distanzaDallOrigine() >=other.distanzaDallOrigine())
		    return 1;
		 
		if(this.distanzaDallOrigine() <= other.distanzaDallOrigine())
		    return -1;
		 
		return 0;
		
	}

}
