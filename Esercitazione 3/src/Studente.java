

public class Studente {

	private String nome;
	private String cognome;
	private String matricola;
	
	public Studente(String riga) throws Exception {
		
		String[] dati = riga.split(",");
		if(dati.length!=3){
			throw new Exception("problema di parsing");
		}
		
		nome = dati[0];
		cognome = dati[1];
		matricola = dati[2];
		
		
	}

	@Override
	public String toString() {
		return "Studente [nome=" + nome + ", cognome=" + cognome
				+ ", matricola=" + matricola + "]";
	}

	@Override
	public int hashCode() {
		return matricola.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Studente other = (Studente) obj;
		if (matricola == null) {
			if (other.matricola != null)
				return false;
		} else if (!matricola.equals(other.matricola))
			return false;
		return true;
	}
	
	
	
	
	
}
