


import java.lang.StringBuilder;

public class words{
    public static void main(String[] args) {
        String ciphertext = "It is  nice and cool there";
        int celesi = 3;

        ciphertext = ciphertext.toUpperCase();

        char[] alfabeti = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        char[] mesazhiEch = ciphertext.toCharArray();
        String[] tekstiKontrollues = new String[]{"AND", "IS"};

        String[] Split_Mesazhi = ciphertext.split(" ");

        StringBuilder tekstiDekoduar = new StringBuilder(ciphertext);

        for (int i = 0; i < ciphertext.length(); i++) {
            if (ciphertext.charAt(i) != ' ')
                tekstiDekoduar.setCharAt(i, (char) (((ciphertext.charAt(i) - 'A' - celesi + 26) % 26) + 'A'));
        }

        String mesazhiDekoduar = tekstiDekoduar.toString();
        System.out.println(mesazhiDekoduar);
    }
}
