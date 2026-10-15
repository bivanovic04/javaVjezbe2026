import java.util.Scanner;
public class cetvrti {
//locirati slova koja se ponavljaju u stringu uzastopno
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        for(int i=0;i<s.length()-1;i++) {
        	if(s.charAt(i) == s.charAt(i)+1) {
        		System.out.println(s.charAt(i) );
        	}
        }
        
	}

}
