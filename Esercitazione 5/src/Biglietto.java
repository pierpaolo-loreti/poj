import org.json.JSONException;
import org.json.JSONObject;


public class Biglietto {

	
	private int id;
	
	private String titolare;

	public Biglietto(JSONObject obj) throws JSONException {
		id = obj.getInt("id");
		titolare = obj.getString("titolare");
	}
	
	@Override
	public String toString() {
		return "Biglietto [id=" + id + ", titolare=" + titolare + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Biglietto other = (Biglietto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	
	
	
}
