
public class deveti {

    public static void main(String[] args) {
        String s = "15023";
        String parni = "24680";
        char[] niz = s.toCharArray();

        for (int i = 0; i < niz.length; i++) {
            char c = niz[i];

            if (parni.indexOf(c) != -1) {
                niz[i] = '0';
            } else {
                niz[i] = '1';
            }
        }

        for (int i = 0; i < niz.length; i++) {
            System.out.print(niz[i]);
        }
    }
}
