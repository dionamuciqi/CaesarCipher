
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class attackcezar {
    public static void main(String[] args) {
        String ciphertext = "";
        try {
            ciphertext = new String(Files.readAllBytes(Paths.get("C:\\\\Siguria e te dhenave\\\\projekti2\\\\ciphertext.txt")));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String plaintext = Dekriptimi(ciphertext);
        System.out.println("Teksti i dekriptuar: " + plaintext);
    }
public static String sms = "";

public static String Dekriptimi(String ciphertext) {
    ciphertext = ciphertext.toUpperCase();
    char[] alfabeti = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

    char[] mesazhiEch = ciphertext.toCharArray();
    String[] tekstiKontrollues = {"AND", "IS"};

    String[] Split_Mesazhi = ciphertext.split(" ");

    List<String> list = new ArrayList<String>();
      for (int i = 0; i < Split_Mesazhi.length; i++)
            for (int j = 0; j < tekstiKontrollues.length; j++)
                if (Split_Mesazhi[i].length() == tekstiKontrollues[j].length())
                    list.add(Split_Mesazhi[i]);
        String[] vargu = list.toArray(new String[0]);

        int celesi = 0;
        for (int i = 0; i < vargu.length; i++) {
            celesi = kontrollo(tekstiKontrollues, vargu[i].toString());
            if (celesi != -1) {
                sms += Mesazhi(ciphertext, celesi);
                break;
            }
        }
        return sms;
    }

    public static String Mesazhi(String tekstiKoduar, int celsi) {
        StringBuilder tekstiDekoduar = new StringBuilder(tekstiKoduar);
        for (int i = 0; i < tekstiKoduar.length(); i++) {
            if (tekstiKoduar.charAt(i) != ' ')
                tekstiDekoduar.setCharAt(i, (char)((tekstiKoduar.charAt(i) - 'A' - celsi + 26) % 26 + 'A'));
        }
        return tekstiDekoduar.toString();
    }
