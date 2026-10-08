import java.util.Scanner;

public class AnaizaNiza {

	    private int niz[];
	    private int suma;
	    private double rezultat;

	    public AnaizaNiza(int niz[]) {
	        this.niz = niz;
	        this.suma = 0;
	        this.rezultat = 0;
	    }

	    public int[] getNiz() {
	        return niz;
	    }

	    public void setNiz(int[] niz) {
	        this.niz = niz;
	    }

	    public int getSuma() {
	        return suma;
	    }

	    public void setSuma(int suma) {
	        this.suma = suma;
	    }

	    public double getRezultat() {
	        return rezultat;
	    }

	    public void setRezultat(double rezultat) {
	        this.rezultat = rezultat;
	    }

	    public void nadjiParniPozitivniProsjek() {
	        int brojac = 0;
	        suma = 0;
	        for (int i = 0; i < niz.length; i++) {
	            if (niz[i] > 0 && niz[i] % 2 == 0) {
	                suma += niz[i];
	                brojac++;
	            }
	        }
	        if (brojac > 0) {
	            rezultat = (double) suma / brojac;
	            System.out.println(rezultat);
	        } else {
	            System.out.println("Nema parnih pozitivnih elemenata");
	        }
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();

	        int[] niz = new int[n];
	        for (int i = 0; i < n; i++) {
	            niz[i] = sc.nextInt();
	        }

	        AnaizaNiza a = new AnaizaNiza(niz);
	        a.nadjiParniPozitivniProsjek();

	    }
	}
