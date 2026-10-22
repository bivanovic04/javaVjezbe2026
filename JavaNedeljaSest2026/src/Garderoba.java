

public class Garderoba extends Proizvodi {
    private String materijalproizvoda;
    private String sezona;

    public Garderoba(String opisproizvoda, int barkod,String zemljaproizvodnje, int godinaproizvodnje,
            double cijena, String materijalproizvoda, String sezona) {
        super(opisproizvoda, barkod, zemljaproizvodnje,godinaproizvodnje, cijena);
        this.setMaterijalproizvoda(materijalproizvoda);
        this.setSezona(sezona);
    }

    public String getMaterijalproizvoda() {
        return materijalproizvoda;
    }

    public void setMaterijalproizvoda(String materijalproizvoda) {
        this.materijalproizvoda = materijalproizvoda;
    }

    public String getSezona() {
        return sezona;
    }

    public void setSezona(String sezona) {
        this.sezona = sezona;
    }

    public void novaCijena() {
        this.setCijena(this.getCijena() * 1.05);
    }

	@Override
	public String toString() {
		return "Garderoba [materijalproizvoda=" + materijalproizvoda + ", sezona=" + sezona +", cijena=" + getCijena()+ "]";
	}

	
    
}
