
public class Televizor {
private int brojKanala;
private String nazivKanala;
private int jacinaTona;

public Televizor(int brojKanala, String nazivKanala, int jacinaTona) {
	this.brojKanala = brojKanala;
	this.nazivKanala = nazivKanala;
	this.jacinaTona = jacinaTona;
	
}

public int getBrojKanala() {
	return brojKanala;
}

public void setBrojKanala(int brojKanala) {
	if(brojKanala>0) {
		this.brojKanala = brojKanala;
	}
}

public String getNazivKanala() {
	return nazivKanala;
}

public void setNazivKanala(String nazivKanala) {
	this.nazivKanala = nazivKanala;
}

public int getJacinaTona() {
	return jacinaTona;
}

public void setJacinaTona(int jacinaTona) {
	if(jacinaTona>=0 && jacinaTona<11) {
		this.jacinaTona = jacinaTona;
	}
}
public void pojacajTon() {
	if(this.jacinaTona<10) {
		this.jacinaTona++;
	}
}
public void ispisi() {
	System.out.println("br kanala:"+this.brojKanala + "naziv kanala" + this.nazivKanala +"jacina tona"+this.jacinaTona);
}
}
