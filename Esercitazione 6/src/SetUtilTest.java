import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


public class SetUtilTest {

	
	
	public static void main(String[] args) {
		
		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();
		
		s1.add(1);
		s1.add(2);
		s1.add(3);
		s1.add(4);
		s1.add(5);
		s1.add(6);
		
		s2.add(4);
		s2.add(5);
		s2.add(6);
		s2.add(7);
		s2.add(8);
		
		System.out.println("S1 "+s1);
		System.out.println("S2 "+s2);
		System.out.println("Unione "+SetUtil.unione(s1, s2));
		System.out.println("Intersezione "+SetUtil.intersezione(s1, s2));
		System.out.println("Differenza "+SetUtil.differenza(s1, s2));
		
		
	}
}
