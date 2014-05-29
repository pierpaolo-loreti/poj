import java.util.HashSet;
import java.util.Set;


public class SetUtil {

	public static <T> Set<T> unione(Set<T> setA, Set<T> setB){
		Set<T> ret = new HashSet<T>(setA);
		ret.addAll(setB);
		return ret;
	}
	
	
	public static <T> Set<T> intersezione(Set<T> setA, Set<T> setB){
		Set<T> ret = new HashSet<T>();
		
		for(T elemento: setA){
			if(setB.contains(elemento))
					ret.add(elemento);
		}
		
		return ret;
	}
	
	public static <T> Set<T> differenza(Set<T> setA, Set<T> setB){
		Set<T> ret = new HashSet<T>(setA);
		
		for(T elemento: setA){
			if(setB.contains(elemento))
					ret.remove(elemento);
		}
		
		return ret;
	}
	
	
	
}
