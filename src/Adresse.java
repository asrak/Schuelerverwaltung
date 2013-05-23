import java.util.Random;

public class Adresse {
	/** Eigenschaften*/
	private String postleitzahl;
	private String ort;
	private String strasse;
	private String hausnummer;
	
	/** Konstruktor mit Parameter*/
	public Adresse(String postleitzahl, String ort, String strasse, String hausnummer) {
		this.postleitzahl = postleitzahl;
		this.ort = ort;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
	}
	
	/** Default - Konstruktor*/
	public Adresse() {
		Random r = new Random();
		int i = r.nextInt(8999)+1000;
		postleitzahl = "" + i;
		String[] s = {"Wien", "Niederösterreich", "Oberösterreich", "Salzburg", "Kärnten", "Tirol", "Vorarlberg", "Steiermark", "Burgenland"};
		ort = s[r.nextInt(8)];
		strasse = "Eine Strasse";
		i = r.nextInt(199)+1;
		hausnummer = "" + i;
	}
	
	/** Get - Methoden*/
	public String getPostleitzahl() {
		return postleitzahl;
	}

	public String getOrt() {
		return ort;
	}

	public String getStrasse() {
		return strasse;
	}

	public String getHausnummer() {
		return hausnummer;
	}
	
	/** Set - Methoden*/
	public void setPostleitzahl(String postleitzahl) {
		this.postleitzahl = postleitzahl;
	}

	public void setOrt(String ort) {
		this.ort = ort;
	}

	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}

	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	
	public String toString() {
		String a = strasse + " " + hausnummer;
		String b = ort + " " + postleitzahl;
		return a + "\n" + b;
	}
}
