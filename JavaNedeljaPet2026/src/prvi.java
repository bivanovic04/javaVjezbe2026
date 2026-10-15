import java.util.Scanner;

public class prvi {
// unesi recenicu a da sistem vraca broj rijeci u toj recenici
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	String[] rijeci = s.trim().split("\\s+");
	System.out.println(rijeci.length);
	
	}
}
