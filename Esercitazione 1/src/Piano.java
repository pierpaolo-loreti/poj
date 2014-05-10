import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Piano {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws NumberFormatException 
	 */
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader( new FileReader("punti.txt"));
		String s;
		Punto[] punti= new Punto[10];
		
		
		int i= 0;
		while ((s=br.readLine())!=null) {
			String [] numeri = s.split(";");
			int a = Integer.parseInt(numeri[0]);
			int b = Integer.parseInt(numeri[1]);
			
			punti[i++]=new Punto(a, b);
			
		}
		
		for (int j = 0; j < punti.length; j++) {
			System.out.println(punti[j]);
			
		}
	}

}
