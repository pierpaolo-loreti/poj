import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URL;


public class FileUtilTest {
	
	public static void main(String[] args) throws FileNotFoundException, MalformedURLException {
		FileInputStream fis = new FileInputStream("rfc2616.txt");
		String [] res;
		
		res=FileUtils.findLines(fis, "protocol");
		
		for (int i=0;i<10;i++) {
			System.out.println("Metodo 1:"+res[i]);
		}
		System.out.println("");
		
		res=FileUtils.findLines("rfc2616.txt", "protocol");
		
		for (int i=0;i<10;i++) {
			System.out.println("Metodo 2:"+res[i]);
		}
		System.out.println("");

		res=FileUtils.findLines(new URL("http://tools.ietf.org/rfc/rfc2616.txt"), "protocol");
		
		for (int i=0;i<10;i++) {
			System.out.println("Metodo 3:"+res[i]);
		}
		
	}

}
