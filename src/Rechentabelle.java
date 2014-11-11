//@author Thomas Hauptvogel

public class Rechentabelle {
	int[][] tabelle;	//2-dimensionales Array
	String ausgabe;		// Ausgabezeile
	
	public Rechentabelle(){
		this.tabelle = new int[10][10];	
		this.ausgabe = "";
	}
	
	public void rechne(){
		for(int i=0; i<10; i++){
			for(int j=0; j<10; j++){
				this.tabelle[i][j] = (i+1) * (j+1); //+1 da Index bei 0 anfängt
				this.ausgabe = this.ausgabe + this.tabelle[i][j] + " ";
			}
			System.out.println(this.ausgabe);
			this.ausgabe = ""; //nach der Ausgabe der Zeile den Inhalt wieder leeren
		}
	}

	public static void main(String[] args) {
		Rechentabelle einmaleins = new Rechentabelle();
		einmaleins.rechne();
	}

}
