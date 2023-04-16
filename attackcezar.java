
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
