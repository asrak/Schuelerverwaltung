import java.util.Random;

public class Datum {
	/** Eigenschaften*/
	private static int rtag;
	private int tag;
	private static int rmonat=1;
	private int monat;
	private int jahr;
	
	/** Default - Konstruktor*/
	public Datum() {
		if(rtag > 30) {
			rtag = 0;
			rmonat++;
		}
		
		rtag++;
		tag = rtag;
		monat = rmonat;
		jahr = 2009;
	}
	
	/** Konstruktor mit Parameter*/
	public Datum(int vt, int vm, int vj) {
		Random r = new Random();
		tag = r.nextInt(31-vt)+vt;
		monat = r.nextInt(12-vm)+vm;
		jahr = r.nextInt(1995-vj)+vj;
	}
	
	/** Konstruktor mit Parameter*/
	public Datum(int vt, int vm, int vj, boolean b) {
		tag = vt;
		monat = vm;
		jahr = vj;
	}

	/** get - Methoden*/
	public int getTag() {
		return tag;
	}

	/** set - Methoden*/
	public void setTag(int tag) {
		this.tag = tag;
	}
	
	public int getMonat() {
		return monat;
	}
	
	public void setMonat(int monat) {
		this.monat = monat;
	}
	
	public int getJahr() {
		return jahr;
	}
	
	public void setJahr(int jahr) {
		this.jahr = jahr;
	}
	
	/** Gibt den Tag, den Monat und das Jahr des Datums zurück*/
	public String toString() {
		String a = "" + tag;
		String b = "" + monat;
		String c = "" + jahr;
		return a + "." + b + "." + c;
	}
	
	public boolean gleich(Datum d) {
		if(this.getTag() == d.getTag()) {
			if(this.getMonat() == d.getMonat()) {
				if(this.getJahr() == d.getJahr()) {
					return true;
				}
			}
		}
		return false;
	}

	public int c(Datum d) {
		if(this.getTag() == d.getTag()) {
			if(this.getMonat() == d.getMonat()) {
				if(this.getJahr() == d.getJahr()) {
					return 0;
				}
			}
		}
		else {
			if(this.getJahr() > d.getJahr()) {
				return 1;
			}
			else if(this.getJahr() == d.getJahr() && this.getMonat() > d.getMonat()) {
				return 1;
			}
			else if(this.getMonat() == d.getMonat() && this.getTag() > d.getTag()) {
				return 1;
			}
		}
		return -1;
	}
}