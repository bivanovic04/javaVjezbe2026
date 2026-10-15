
public class sesti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//kreirati stringbuilder sa sadrzajem "programiranje" obrisati slova od 3. do 6. ideksa
		String s = "programiranje";
		StringBuilder novi = new StringBuilder(s);
		novi.delete(3,6);S
		System.out.println(novi);
	}

}
