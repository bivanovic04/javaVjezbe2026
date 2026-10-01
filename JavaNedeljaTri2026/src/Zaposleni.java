
public class Zaposleni {
private String ime;
private String prezime;
private int godine_staza;
private double plata;

public Zaposleni( String ime,
String prezime,
 int godine_staza,
 double plata
) {this.ime = ime;
this.prezime=prezime;
this.godine_staza=godine_staza;
this.plata=plata;
	
}

public String getIme() {
	return ime;
}

public void setIme(String ime) {
	this.ime = ime;
}

public String getPrezime() {
	return prezime;
}

public void setPrezime(String prezime) {
	this.prezime = prezime;
}

public int getGodine_staza() {
	return godine_staza;
}

public void setGodine_staza(int godine_staza) {
	this.godine_staza = godine_staza;
}

public double getPlata() {
	return  plata;
}

public void setPlata(double plata) {
	this.plata = plata;
}
public void ispisi() {
	System.out.println("ime i prezime" + this.ime + this.prezime + "godine staza" + this.godine_staza + "plata" + this.plata);
}
public void provjera() {
	if (this.plata<800 && this.godine_staza>10) {
		this.plata = this.plata*1.06;
	}
}
}
