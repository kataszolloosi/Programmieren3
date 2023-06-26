package File_IO;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class UE12_Exception {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\uebung1.txt");

        // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
        // While-Schleife liest somit Zeichen um Zeichen aus.

        int byteRead;
        try {
            // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
            FileInputStream fileInputStream = new FileInputStream(file);
            // Für Optimierung der Performance -> BufferedInputStream
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            while ((byteRead = bufferedInputStream.read()) != -1) {
                // char[] ch = Character.toChars(byteRead);
                // System.out.println(ch);
                // Byte wird in char umgewandelt und ausgegeben.
                System.out.println((char) byteRead);
            }
            // close() gibt die Datei wieder frei.
            bufferedInputStream.close();
        } catch (IOException e) {
            System.out.println("Fehler:..... " + e.getMessage());
        }


    }
}
