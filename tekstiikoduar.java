import java.lang.StringBuilder;

public class tekstiikoduar {
    public static void main(String[] args) {
        String ciphertext = "FQ FP KFZB XKA ZLLI QEBOB";
        int celesi = 3;
        String plaintext = decrypt(ciphertext, celesi);
        System.out.println(plaintext);
    }

    public static String decrypt(String ciphertext, int celesi) {
        StringBuilder plaintext = new StringBuilder(ciphertext);
        char[] alfabeti = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < ciphertext.length(); i++) {
            char ch = ciphertext.charAt(i);
            if (ch != ' ') {
                int pozicioni = -1;
                for (int j = 0; j < alfabeti.length; j++) {
                    if (ch == alfabeti[j]) {
                        pozicioni = j;
                        break;
                    }
                }
                if (pozicioni != -1) {
                    pozicioni = (pozicioni + celesi) % alfabeti.length;
                    plaintext.setCharAt(i, alfabeti[pozicioni]);
                }
            }
        }
        return plaintext.toString();
    }
}
