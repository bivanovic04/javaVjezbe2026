 class Kuvar extends Zaposleni {
private final double dodatak = 1500;

public double getDodatak() {
	return dodatak;
}

public Kuvar(int id, String ime, String prezime, double plataPoSatu, double ukupanBrojSati) {
	super(id, ime, prezime, plataPoSatu, ukupanBrojSati);
}

public double IzracunajPlatu() {
	return dodatak + 4*getUkupanBrojSati()*getPlataPoSatu();
}

@Override
public String getTip() {

	return "Kuvar";
}

}
