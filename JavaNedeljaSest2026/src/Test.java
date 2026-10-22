import java.time.LocalDate;
import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Proizvodi> lista = new ArrayList<Proizvodi>();
Garderoba g1 = new Garderoba("Majica",1001,"Kina",2025,20.0,"Pamuk","Ljeto");

Garderoba g2 = new Garderoba("Jakna",1002,"Italija",2024,80.0,"Koza","Zima");

    Hrana h1 = new Hrana("Mlijeko",2001,"Srbija",2026,1.50,60.0, LocalDate.now().plusMonths(3));

    Hrana h2 = new Hrana("Med",2002,"Crna Gora",2025,8.0,300.0,LocalDate.now().plusMonths(12));
    lista.add(g1);
    lista.add(g2);
    lista.add(h1);
    lista.add(h2);

    g1.novaCijena();
    g2.novaCijena();
    h1.novaCijena();
    h2.novaCijena();
    for(Proizvodi p:lista) {
    	System.out.println(p);
    	
    }
	}
	
}

