import java.util.Scanner;
public class drugi {

	public static void main(String[] args) {
//provjeriti za unesenu rijec da li je palindrom
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String provjera = new StringBuilder(s).reverse().toString();
		if(s.equalsIgnoreCase(provjera)) {
			System.out.println("rijec je palindrom");
				
			}else {
				System.out.println("nije palindrom");
			}

		
	}

}
