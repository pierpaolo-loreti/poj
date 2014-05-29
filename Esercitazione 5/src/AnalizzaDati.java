import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Arrays;

import org.json.JSONException;
import org.json.JSONObject;


public class AnalizzaDati {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URL url = new URL("http://ppl.eln.uniroma2.it/poj/data.php");
			Double[] data = new Double[20];
			String s="";
			for (int i = 0; i < data.length; i++) {
				BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
				s=br.readLine();
				br.close();
				System.out.println(s);
				JSONObject jo = new JSONObject(s);
				data[i]=jo.getDouble("temp");
				Thread.sleep(1000);
				
			}
			
			System.out.println(Arrays.toString(data));
			double sum=0;
			for(Double valore: data){
				sum += valore;
			}
			System.out.println("Media :"+sum/data.length);
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
