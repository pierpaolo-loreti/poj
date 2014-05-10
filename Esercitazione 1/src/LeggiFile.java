import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class LeggiFile {

	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader( new FileReader("data.txt"));
		String s;
		
		while ((s=br.readLine())!=null) {
			System.out.println(s);
		}
	}
}
