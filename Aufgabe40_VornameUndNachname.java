
public class Aufgabe40_VornameUndNachname {
	public String vorname;
	public String nachname;
	
	public String toString() {
		return String.format("%s %s", vorname, nachname);
	}
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
}
