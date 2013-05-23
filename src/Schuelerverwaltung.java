import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Schuelerverwaltung {
	/** Eigenschaften*/
	private ArrayList<Schueler> schueler;
	
	/** Konstruktor mit Parameter*/
	public Schuelerverwaltung(ArrayList<Schueler> s) {
		schueler = s;
	}
	
	/** Default - Konstruktor*/
	public Schuelerverwaltung() {
		schueler = new ArrayList<Schueler>();
	}
	
	/** Get - Methode*/
	public ArrayList<Schueler> getSchueler() {
		return schueler;
	}
	
	/** Set - Methode*/
	public void setSchueler(ArrayList<Schueler> schueler) {
		this.schueler = schueler;
	}
	
	/** entfernt einen Schüler aus der List*/
	public void schuelerEntfernen(Schueler s) {
		schueler.remove(s);
	}
	
	/** fügt einen Schüler zur List hinzu*/
	public void schuelerErfassen(Schueler s) {
		schueler.add(s);
	}
	
	/** sortiert die Schüler in der List aufsteigend nach der Klasse und in der Klasse aufsteigend nach dem Familiennamen
	 * 
	 * @return sortierte List
	 */
	public ArrayList<Schueler> schuelerKlasseSortieren() {
		Collections.sort(schueler ,new Comparator<Schueler>() {
			public int compare(Schueler s, Schueler sv) {
					return (s.getKlasse().compareTo(sv.getKlasse()));
			}
		});
		Collections.sort(schueler ,new Comparator<Schueler>() {
			public int compare(Schueler s, Schueler sv) {
					return (s.getFamilienname().compareTo(sv.getFamilienname()));
			}
		});
		return schueler;
	}
	
	/** gibt die Schüler, die in der List sind, aus*/
	public void printSchueler() {
		for(int i = 0; i < schueler.size(); i++) {
			System.out.println(schueler.get(i));
			schueler.get(i).printNoten();
			System.out.println("--------------------------------------------------------");
		}
	}
	
	public void schuelerAendern(Schueler alteDaten, Schueler neueDaten) {
		for(int i = 0; i < schueler.size(); i++) {
			if(schueler.get(i).toString().compareTo(alteDaten.toString()) == 0) {
				schueler.remove(i);
				schueler.add(i, neueDaten);
				return;
			}
		}
	}
	
	public Schueler sucheSchueler(String familienname) {
		for(int i = 0; i < schueler.size(); i++) {
			if(familienname.compareTo(schueler.get(i).getFamilienname()) == 0) {
				return schueler.get(i);
			}
		}
		return null;
	}
	
	public double notenschnitt(String klasse) {
		double nd = 0;
		double en = 0;
		int anzSchuelerInKlasse = 0;
		for(int i = 0; i < schueler.size(); i++) {
			if(klasse.compareTo(schueler.get(i).getKlasse()) == 0) {
				anzSchuelerInKlasse++;
				for(int j = 0; j < schueler.get(i).getNoten().size(); j++) {
					en += schueler.get(i).getNoten().get(j).getNote();
				}
			}
			en /= 12;
			nd += en;
			en = 0;
		}
		nd /= anzSchuelerInKlasse;
		nd = nd*100;
		nd = (int)nd;
		nd /=100;
		return nd;
	}
	
	public ArrayList<Schueler> sucheSchuelernachOrt(String ort) {
		ArrayList<Schueler> s = new ArrayList<Schueler>();
		for(int i = 0; i < schueler.size(); i++) {
			if(schueler.get(i).getAdresse().getOrt().compareTo(ort) == 0) {
				s.add(schueler.get(i));
			}
		}
		return s;
	}
}
