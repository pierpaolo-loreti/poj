import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LeggiCalcola {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new FileReader("numeri.txt"));
		String s;
		
		while ((s=br.readLine())!=null) {
			int a = Integer.parseInt(s);
			double b = Math.sqrt(a);
			
			System.out.println(a+" sqrt:"+b);
		}
		
	}
}
