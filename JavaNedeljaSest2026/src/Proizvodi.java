
public abstract class Proizvodi {
    private String opisproizvoda;
    private int barkod;
    private String zemljaproizvodnje;
    private int godinaproizvodnje;
    private double cijena;

    public Proizvodi(String opisproizvoda, int barkod,
            String zemljaproizvodnje, int godinaproizvodnje,
            double cijena) {
        this.setOpisproizvoda(opisproizvoda);
        this.setBarkod(barkod);
        this.setZemljaproizvodnje(zemljaproizvodnje);
        this.setGodinaproizvodnje(godinaproizvodnje);
        this.setCijena(cijena);
    }

    public double getCijena() {
        return cijena;
    }

    public void setCijena(double cijena) {
        this.cijena = cijena;
    }

    public String getOpisproizvoda() {
        return opisproizvoda;
    }

    public void setOpisproizvoda(String opisproizvoda) {
        this.opisproizvoda = opisproizvoda;
    }

    public int getBarkod() {
        return barkod;
    }

    public void setBarkod(int barkod) {
        this.barkod = barkod;
    }

    public String getZemljaproizvodnje() {
        return zemljaproizvodnje;
    }

    public void setZemljaproizvodnje(String zemljaproizvodnje) {
        this.zemljaproizvodnje = zemljaproizvodnje;
    }

    public int getGodinaproizvodnje() {
        return godinaproizvodnje;
    }

    public void setGodinaproizvodnje(int godinaproizvodnje) {
        this.godinaproizvodnje = godinaproizvodnje;
    }
public void novaCijenu() {
	
}
	}
    

