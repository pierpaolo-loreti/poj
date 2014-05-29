import org.json.JSONException;
import org.json.JSONObject;


public class TestBiglietto {

	public static void main(String[] args) {
		String s1= "{\"id\":1,\"titolare\":\"Pierpaolo Loreti\"}";
		
		try {
			Biglietto b = new Biglietto(new JSONObject(s1));
			System.out.println(b);
			
			
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
}
