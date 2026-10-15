
import java.util.Scanner;

public class treci {

    public static void main(String[] args) {
        // Odrediti broj samoglasnika i suglasnika u recenici
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine().trim();
        char[] niz = s.toCharArray();

        int samoglasnici = 0;
        String samoglasniici = "aeiouAEIOU";
        int suglasnici = 0;

        for (int i = 0; i < niz.length; i++) {
            char c = niz[i];

            if (Character.isLetter(c)) {
                if (samoglasniici.indexOf(c) != -1) {
                    samoglasnici++;
                } else {
                    suglasnici++;
                }
            }
        }

        System.out.println("Samoglasnici: " + samoglasnici);
        System.out.println("Suglasnici: " + suglasnici);

    }
}
