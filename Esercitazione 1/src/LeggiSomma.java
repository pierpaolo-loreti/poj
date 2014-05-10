import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LeggiSomma {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new FileReader("coppie.txt"));
		String s;
		
		while ((s=br.readLine())!=null) {
			String [] numeri = s.split(";");
			int a = Integer.parseInt(numeri[0]);
			int b = Integer.parseInt(numeri[1]);
			int c= a+b;
			System.out.println(a+"+"+b+"="+c);
			
		}
		
	}

}
