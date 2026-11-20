
import javax.swing.JOptionPane;
public class prvi {
	



	    public static void main(String[] args) {
	        // TODO Auto-generated method stub

	        String ime = JOptionPane.showInputDialog(null, "Unesite ime");
	        String prezime = JOptionPane.showInputDialog(null, "Unesite prezime");
	        String unosGod = JOptionPane.showInputDialog(null, "Unesite unosGod");

	        int godine = Integer.parseInt(unosGod);

	        String poruka = "Pregled podataka: \n\n" + "Ime: " + ime + "\n" + "Prezime:" + prezime + "\n" + "Godina rodjenja:" + godine + "\n" + "Da li su uneseni podaci tacni?";
	        int izbor = JOptionPane.showConfirmDialog(null, poruka, "Provjera podataka", JOptionPane.YES_NO_OPTION);

	        if (izbor == JOptionPane.YES_OPTION) {
	            String email = ime + "." + prezime + godine + "@kompanija.me";
	            JOptionPane.showMessageDialog(null, "Vasa email adresa je:" + email, "eMail", JOptionPane.INFORMATION_MESSAGE);
	        } else {
	            JOptionPane.showMessageDialog(null, "Otkazano", "Email", JOptionPane.INFORMATION_MESSAGE);
	        }
	    }
	}

