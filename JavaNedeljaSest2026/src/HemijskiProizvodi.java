
public class HemijskiProizvodi extends Proizvodi {
private float temperatura;
private boolean zapaljivo;
public HemijskiProizvodi(String opisproizvoda, int barkod, String zemljaproizvodnje, int godinaproizvodnje,
		double cijena, float temperatura, boolean zapaljivo) {
	super(opisproizvoda, barkod, zemljaproizvodnje, godinaproizvodnje, cijena);
	this.setTemperatura(temperatura);
	this.setZapaljivo(zapaljivo);
}
public float getTemperatura() {
	return temperatura;
}
public void setTemperatura(float temperatura) {
	this.temperatura = temperatura;
}
public boolean isZapaljivo() {
	return zapaljivo;
}
public void setZapaljivo(boolean zapaljivo) {
	this.zapaljivo = zapaljivo;
}

public void novaCijena() {
	if(this.zapaljivo) {
		this.setCijena(getCijena()*1.125);
	}else {
		this.setCijena(getCijena()*1.1);
	}
}
@Override
public String toString() {
	return "HemijskiProizvodi [temperatura=" + temperatura + ", zapaljivo=" + zapaljivo +", cijena=" + getCijena()+ "]";
}

}
