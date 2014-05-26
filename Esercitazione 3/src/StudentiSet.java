import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;


public class StudentiSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			URL url = new URL("http://ppl.eln.uniroma2.it/poj/studenti.txt");
			
			InputStreamReader isr = new InputStreamReader(url.openStream());
			
			//BufferedReader br = new BufferedReader(new FileReader("studenti.txt"));
			//BufferedReader br = new BufferedReader(new FileReader("/Users/loreti/studenti.txt"));
			BufferedReader br = new BufferedReader(isr);
			
			String s;
			
			Set studenti = new HashSet<Studente>();
			
			while ((s=br.readLine())!=null) {
				studenti.add(new Studente(s));
			}
			
			
			br.close();
			System.out.println(studenti);
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
