import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;


public class FileUtils {
	public static String [] findLines (InputStream in, String exp){
		
		BufferedReader br = new BufferedReader(new InputStreamReader(in));
		String s;
		ArrayList<String> ret = new ArrayList<String>();
		try {
			while ((s=br.readLine())!=null) {
				if(s.contains(exp)){
					ret.add(s);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
		return ret.toArray(new String[ret.size()]);
		
	}

	public static String [] findLines (String path, String exp){		
		File f = new File(path);
		FileInputStream fis;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return findLines(fis, exp);		
	}

	public static String [] findLines (URL url, String exp){		
		
		try {
			return findLines(url.openStream(), exp);		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	
}
