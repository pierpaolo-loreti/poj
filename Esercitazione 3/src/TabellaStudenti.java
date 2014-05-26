import java.awt.BorderLayout;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTable;

public class TabellaStudenti {

	public static void main(String[] args) throws Exception {
		JFrame finestra = new JFrame();
		finestra.setTitle("Tabella studenti");
		finestra.setSize(300, 400);
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel cp = new JPanel();
		cp.setLayout(new BorderLayout());
		cp.setBackground(Color.gray);
		finestra.setContentPane(cp);

		String[] colonne = { "Nome", "Cognome", "Matricola" };
		Object[][] dati = new Object[11][];

		URL url;
		url = new URL("http://ppl.eln.uniroma2.it/poj/studenti.txt");
		InputStreamReader isr = new InputStreamReader(url.openStream());
		BufferedReader br = new BufferedReader(isr);
		String s;
		int i=0;
		while ((s=br.readLine())!=null) {
			dati[i++]= s.split(",");
		}
			
		JTable tabella = new JTable(dati, colonne);
		cp.add(tabella, BorderLayout.CENTER);

		finestra.setVisible(true);

	}

}
