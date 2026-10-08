import java.util.Random;
import java.util.Scanner;
public class prvi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
Random random = new Random();
int n = sc.nextInt();

int[] niz = new int [n];
 
 for(int i=0; i<niz.length; i++) {
	 niz[i] = random.nextInt();
	 System.out.println(niz[i]);
 }
 for(int i=0; i<niz.length; i++) {
	 if (niz[i]%2==0) {
		 niz[i] = niz[i]*-1;
	 }else {
		 niz[i]=1/niz[i];
	 }
	 
	 
	}

}
}