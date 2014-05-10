import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class LeggiStringhe {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s;
		
		while (!(s=br.readLine()).equals("")) {
			
			System.out.println(s);
			
			
		}
	}
}
