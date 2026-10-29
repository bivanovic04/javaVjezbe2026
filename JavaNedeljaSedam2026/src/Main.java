import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
	double udaljenost = 10;
	ArrayList<Vozilo> lista = new ArrayList<>();
	lista.add(new Bicikl(1010,30));
	lista.add(new Motor(9292,100));
	lista.add(new Automobil(8210,120));
	double ukupnaPotrosnja = 0;
	int brojEkonomicnih = 0;
	
	for (Vozilo v : lista) {
        v.info();
        
	}
for(Vozilo v: lista) {
	if (v instanceof Ekonomican) {
        Ekonomican e = (Ekonomican) v;
        double potrosnja = e.potrosnjaPoKm() * udaljenost;
        System.out.printf("Potrosnja na %.0f km: %.2f l%n", udaljenost, potrosnja);
         ukupnaPotrosnja += potrosnja;
         brojEkonomicnih++;
    } else {
        System.out.println("Vozilo nije ekonomicno.");
    }
    }

	}
}
