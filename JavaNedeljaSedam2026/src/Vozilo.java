
public abstract class Vozilo {
protected int id;
protected double maxBrzina;

public Vozilo(int id, double maxBrzina) {
	super();
	this.id = id;
	this.maxBrzina = maxBrzina;
}

public void info() {
    System.out.println("Vozilo ID: " + id + ", max brzina: " + maxBrzina + " km/h");
}

public abstract double izracunajVrijemeDostave(double udaljenostKm);

}
