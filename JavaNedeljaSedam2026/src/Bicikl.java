public class Bicikl extends Vozilo implements Ekonomican {
    public Bicikl(int id, double maxBrzina) {
        super(id, maxBrzina);
    }

    @Override
    public double izracunajVrijemeDostave(double udaljenostKm) {
        return udaljenostKm / maxBrzina * 60; 
    }

    @Override
    public double potrosnjaPoKm() {
        return 0.0;
    }
}
