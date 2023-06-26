package File_IO;

import java.io.*;

public class UE12_BinarInput {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\uebung7.txt");
        // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
        FileInputStream fileInputStream = new FileInputStream(file);
        // Für Optimierung der Performance -> BufferedInputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);

        // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
        // While-Schleife liest somit Zeichen um Zeichen aus.
        int byteRead;
        while ((byteRead = bufferedInputStream.read()) != -1) {
            // char[] ch = Character.toChars(byteRead);
            // System.out.println(ch);
            // Byte wird in char umgewandelt und ausgegeben.
            System.out.println((char) byteRead);
        }

        // close() gibt die Datei wieder frei.
        bufferedInputStream.close();
    }
}
