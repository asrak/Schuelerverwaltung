import java.util.Random;

public class Note {
	/** Eigenschaften*/
	private String fach;
	private int note;
	private static int i = 0;
	
	/** Konstruktor mit Parameter*/
	public Note(String fach, int note) {
		this.fach = fach;
		this.note = note;
	}
	
	/** Default - Konstruktor*/
	public Note() {
		Random r = new Random();
		String[] s = {"POS", "BWM", "BSPK", "PRE", "E", "D", "AM", "NW", "NVS", "GGPB", "DBIS", "MUT"};
		fach = s[i];
		note = r.nextInt(4)+1;
		i++;
		if(i == 12) {
			i = new Integer(0);
		}
	}
	
	/** Get - Methoden*/
	public String getFach() {
		return fach;
	}

	public int getNote() {
		return note;
	}
	
	/** Set - Methoden*/
	public void setFach(String fach) {
		this.fach = fach;
	}

	public void setNote(int note) {
		this.note = note;
	}
	
	public String toString() {
		String a = fach;
		String b = "" + note;
		return a + "\t\t\t" + b;
	}
}
