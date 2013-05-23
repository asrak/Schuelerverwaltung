
public class Main {
	public static void main(String[] args) {
		Schuelerverwaltung sv = new Schuelerverwaltung();
		for(int i = 0; i < 10; i++) {
			sv.schuelerErfassen(new Schueler());
		}
		sv.printSchueler();
		sv.schuelerKlasseSortieren();
		System.out.println("\n\n\nNach dem Sortiern:\n");
		sv.printSchueler();
		//System.out.println("\n\n\nNach dem Ändern des 3. Schülers:\n");
		//sv.schuelerAendern(new Schueler(sv.getSchueler().get(2).getSchuelernummer(), sv.getSchueler().get(2).getFamilienname(), sv.getSchueler().get(2).getVorname(), sv.getSchueler().get(2).getGeburtsdatum(),new Adresse(sv.getSchueler().get(2).getAdresse().getPostleitzahl(),sv.getSchueler().get(2).getAdresse().getOrt(),sv.getSchueler().get(2).getAdresse().getStrasse(),sv.getSchueler().get(2).getAdresse().getHausnummer()),sv.getSchueler().get(2).getKlasse()), new Schueler());
		//sv.printSchueler();
		System.out.println("Notendurchschnitt von " + sv.getSchueler().get(8).getKlasse() + ": " + sv.notenschnitt(sv.getSchueler().get(8).getKlasse()));
		Schuelerverwaltung sv2 = new Schuelerverwaltung(sv.sucheSchuelernachOrt("Wien"));
		//System.out.println("\n\n\nSchüler aus Wien:");
		//sv2.printSchueler();
	}
}
