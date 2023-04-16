
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
