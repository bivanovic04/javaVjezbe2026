// za 2 stringa provjeriti da li je prvi substring prvog
import java.util.Scanner;

public class peti {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine().trim();
        String s2 = sc.nextLine().trim();
if(s2.contains(s1)) {
	System.out.println("jeste substring");
}else {
	System.out.println("nije");
}
}

}
