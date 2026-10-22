class Menadzer extends Zaposleni {
private final double dodatak = 1300;
private double bonus;
public double getBonus() {
	return bonus;
}
public void setBonus(double bonus) {
	this.bonus = bonus;
}
public double getDodatak() {
	return dodatak;
}
public Menadzer(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati, double bonus) {
	super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
	this.bonus = bonus;
}

public double IzracunajPlatu() {
	return dodatak+4*getUkupanBrojSati();
}

public String getTip() {
	return "Menadzer";
}

}
