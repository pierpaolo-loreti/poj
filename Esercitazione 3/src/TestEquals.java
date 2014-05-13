public class TestEquals {
	public static void main(String[] args) {

		String pier1 = "Pierpaolo";
		String pier2 = pier1;
		String pier3 = "Pierpaolo";

		System.out.println("pier1 == pier2 : "+(pier1 == pier2));
		System.out.println("pier1 == pier3 : "+(pier1 == pier3));
		System.out.println("pier2 == pier3 : "+(pier2 == pier3));

		System.out.println("pier1.equals(pier2) : "+pier1.equals(pier2));
		System.out.println("pier1.equals(pier3) : "+pier1.equals(pier3));
		System.out.println("pier2.equals(pier3) : "+pier2.equals(pier3));

		String marco1 = new String("Marco");
		String marco2 = marco1;
		String marco3 = new String("Marco");

		System.out.println("marco1 == marco2 : "+(marco1 == marco2));
		System.out.println("marco1 == marco3 : "+(marco1 == marco3));
		System.out.println("marco2 == marco3 : "+(marco2 == marco3));
		
		System.out.println("marco1.equals(marco2) : "+marco1.equals(marco2));
		System.out.println("marco1.equals(marco3) : "+marco1.equals(marco3));
		System.out.println("marco2.equals(marco3) : "+marco2.equals(marco3));

		
		
		Persona p1 = new Persona("Pierpaolo");
		Persona p2 = p1;
		Persona p3 = new Persona("Pierpaolo");

		System.out.println("p1 == p2 :"+(p1 == p2));
		System.out.println("p1 == p3 :"+(p1 == p3));
		System.out.println("p2 == p3 :"+(p2 == p3));

		System.out.println("p1.equals(p2) :"+p1.equals(p2));
		System.out.println("p1.equals(p3) :"+p1.equals(p3));
		System.out.println("p2.equals(p3) :"+p2.equals(p3));

	}
}
