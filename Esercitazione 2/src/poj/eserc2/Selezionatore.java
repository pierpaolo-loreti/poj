package poj.eserc2;

import java.util.ArrayList;

public class Selezionatore {

	public static ArrayList puntiVicini(ArrayList list) {
		ArrayList ret = new ArrayList();

		for (int i = 0; i < list.size(); i++) {
			Punto p = (Punto) list.get(i);
			if (p.distanzaDallOrigine() < 5) {
				ret.add(p);
			}

		}

		return ret;

	}

	public static ArrayList puntiViciniClonati(ArrayList list) {
		ArrayList ret = new ArrayList();

		for (int i = 0; i < list.size(); i++) {
			Punto p = (Punto) list.get(i);
			if (p.distanzaDallOrigine() < 5) {
				try {
					ret.add(p.clone());
				} catch (CloneNotSupportedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		return ret;

	}
}
