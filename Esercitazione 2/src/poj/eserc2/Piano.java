package poj.eserc2;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

public class Piano {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("punti.txt"));
			String s;
			ArrayList punti = new ArrayList();
			
			while ((s=br.readLine())!=null) {
				String [] numeri = s.split(";");
				double a = Double.parseDouble(numeri[0]);
				double b = Double.parseDouble(numeri[1]);
				punti.add(new Punto(a, b));
				
			}
			
			System.out.println(punti);
			ArrayList punti2 = Selezionatore.puntiVicini(punti);
			
			System.out.println(punti2);
			
			ArrayList punti3 = Selezionatore.puntiViciniClonati(punti);
			
			System.out.println(punti3);
			
			PrintWriter pw = new PrintWriter(new File("puntiselezionati.txt"));
			
			for (int i = 0; i < punti3.size(); i++) {
				pw.println(punti3.get(i));
			}
			pw.close();
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
