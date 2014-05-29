import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.json.JSONArray;
import org.json.JSONException;


public class Lotteria {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URL url = new URL("http://ppl.eln.uniroma2.it/poj/biglietti.json");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			String s = br.readLine();
			
			JSONArray ja = new JSONArray(s);
			Set<Biglietto> biglietti = new HashSet<Biglietto>();
			
			for (int i = 0; i < ja.length(); i++) {
				biglietti.add(new Biglietto(ja.getJSONObject(i)));
			}
			
			System.out.println(biglietti);
			
			ArrayList<Biglietto> al = new ArrayList<Biglietto>(biglietti);
			System.out.println(al);
			Collections.shuffle(al);
			System.out.println(al);
			
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
