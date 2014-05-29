package poj.eserc4;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TestJSON {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner sc = new Scanner(new FileReader("jsonobj2.txt"));
			String s = sc.nextLine();
			
			JSONObject jo = new JSONObject(s);
			
			String val = jo.getString("JSON");
			
			System.out.println(val);
			
			sc.close();
			
			sc = new Scanner(new FileReader("jsonarr.txt"));
			s = sc.nextLine();
			JSONArray ja = new JSONArray(s);
			
			int[] intarr = new int[ja.length()];
			
			for (int i = 0; i < intarr.length; i++) {
				intarr[i] = ja.getInt(i);
			}
			
			System.out.println(Arrays.toString(intarr));	
			sc.close();

			sc = new Scanner(new FileReader("jsonarr2.txt"));
			s = sc.nextLine();
			ja = new JSONArray(s);
			
			double[] doubarr = new double[ja.length()];
			
			for (int i = 0; i < doubarr.length; i++) {
				doubarr[i] = ja.getDouble(i);
			}
			
			System.out.println(Arrays.toString(doubarr));	
			sc.close();

			sc = new Scanner(new FileReader("jsonobjarr.txt"));
			s = sc.nextLine();
			jo = new JSONObject(s);

			ja = jo.getJSONArray("intarray");
			
			intarr = new int[ja.length()];
			
			for (int i = 0; i < intarr.length; i++) {
				intarr[i] = ja.getInt(i);
			}
			System.out.println(Arrays.toString(intarr));	

			ja = jo.getJSONArray("doublearray");

			doubarr = new double[ja.length()];
			
			for (int i = 0; i < doubarr.length; i++) {
				doubarr[i] = ja.getDouble(i);
			}
			
			System.out.println(Arrays.toString(doubarr));	
			sc.close();
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
