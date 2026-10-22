import java.time.LocalDate;

public class Hrana extends Proizvodi {
private double brojkallorija;
private LocalDate rokupotrebe;
public double getBrojkallorija() {
	return brojkallorija;
}
public void setBrojkallorija(double brojkallorija) {
	this.brojkallorija = brojkallorija;
}
public LocalDate getRokupotrebe() {
	return rokupotrebe;
}
public void setRokupotrebe(LocalDate rokupotrebe) {
	this.rokupotrebe = rokupotrebe;
}
public Hrana(String opisproizvoda, int barkod, String zemljaproizvodnje, int godinaproizvodnje, double cijena,
		double brojkallorija, LocalDate rokupotrebe) {
	super(opisproizvoda, barkod, zemljaproizvodnje, godinaproizvodnje, cijena);
	this.setBrojkallorija(brojkallorija);
	this.setRokupotrebe(rokupotrebe);
}
public void novaCijena() {
    if (rokupotrebe.isBefore(LocalDate.now().plusMonths(6))) {
        this.setCijena(this.getCijena() * 1.05);
    } else {
        this.setCijena(this.getCijena() * 1.10);
    }
    
}
@Override
public String toString() {
	return "Hrana [brojkallorija=" + brojkallorija + ", rokupotrebe=" + rokupotrebe + ", cijena=" + getCijena()+"]";
}

}
