
public class zaposlenitest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Zaposleni abc = new Zaposleni("Marko","Markovic",12,650);
Zaposleni abcd = new Zaposleni("Janko","Jankovic",4,120.5);
Zaposleni abcde = new Zaposleni("Boris","Ivanovic",1,10000);
abc.ispisi();
abcd.ispisi();
abcde.ispisi();
abc.setGodine_staza(13);
abc.ispisi();
	}

}
