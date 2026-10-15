
public class sedmi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "Marko programira";
String[] rijeci = s.trim().split("\\s+");
String s1 = rijeci[0];
String s2=rijeci[1];
StringBuilder novi = new StringBuilder(s1).reverse();
StringBuilder novi2 = new StringBuilder(s2).reverse();
StringBuilder konacni = novi.append(" ").append(novi2);
System.out.println(konacni);
	}

}
