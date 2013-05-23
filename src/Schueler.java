import java.util.ArrayList;
import java.util.Random;

public class Schueler {
	/** Eigenschaften*/
	private int schuelernummer;
	private String familienname;
	private String vorname;
	private Datum geburtsdatum;
	private Adresse adresse;
	private String klasse;
	private ArrayList<Note> noten;
	private static int nr = 0;
	
	/** Konstruktor mit Parameter*/
	public Schueler(int schuelernummer, String familienname, String vorname, Datum geburtsdatum, Adresse adresse, String klasse, ArrayList<Note> noten) {
		this.schuelernummer = schuelernummer;
		this.familienname = familienname;
		this.vorname = vorname;
		this.geburtsdatum = geburtsdatum;
		this.adresse = adresse;
		this.klasse = klasse;
		this.noten = noten;
	}
	
	/** Konstruktor mit Parameter*/
	public Schueler(int schuelernummer, String familienname, String vorname, Datum geburtsdatum, Adresse adresse, String klasse) {
		this.schuelernummer = schuelernummer;
		this.familienname = familienname;
		this.vorname = vorname;
		this.geburtsdatum = geburtsdatum;
		this.adresse = adresse;
		this.klasse = klasse;
		this.noten = new ArrayList<Note>();
	}
	
	/** Default - Konstruktor*/
	public Schueler() {
		nr++;
		Random r = new Random();
		schuelernummer = r.nextInt(9999)+10000;
		familienname = "Familienname " + nr;
		vorname = "Vorname " + nr;
		geburtsdatum = new Datum(1,1,1990);
		adresse = new Adresse();
		int i = r.nextInt(4)+1;
		String[] s = {"A", "B", "C", "D", "E"}; 
		klasse = i + s[r.nextInt(4)] + "HIF";
		noten = new ArrayList<Note>();
		for(int x = 0; x < 12; x++) {
			noten.add(new Note());
		}
	}
	
	/** Get - Methoden*/
	public int getSchuelernummer() {
		return schuelernummer;
	}

	public String getFamilienname() {
		return familienname;
	}

	public String getVorname() {
		return vorname;
	}

	public Datum getGeburtsdatum() {
		return geburtsdatum;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public String getKlasse() {
		return klasse;
	}

	public ArrayList<Note> getNoten() {
		return noten;
	}
	
	/** Set - Methoden*/
	public void setSchuelernummer(int schuelernummer) {
		this.schuelernummer = schuelernummer;
	}

	public void setFamilienname(String familienname) {
		this.familienname = familienname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public void setGeburtsdatum(Datum geburtsdatum) {
		this.geburtsdatum = geburtsdatum;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}

	public void setNoten(ArrayList<Note> noten) {
		this.noten = noten;
	}
	
	public String toString() {
		String a = "Schülernummer: " + schuelernummer;
		String b = "Familienname: " + familienname;
		String c = "Vorname: " + vorname;
		String d = "Geburtsdatum: " + geburtsdatum;
		String e = "Adresse:\n" + adresse;
		String f = "Klasse: " + klasse;
		return a + "\n" + b + "\n" + c + "\n" + d + "\n" + e + "\n" + f;
	}
	
	public void printNoten() {
		System.out.println("Fach\t\t\tNote");
		for(int i = 0; i < noten.size(); i++) {
			System.out.println(noten.get(i));
		}
	}
}
