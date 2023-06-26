package File_IO;

import java.io.*;

public class UE13_Binar {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\hello.bmp");
        // FileInputStream stellt eine Verbindung zur Datei her. Datei wird geöffnet.
        FileInputStream fis = new FileInputStream(file);
        // Für Optimierung der Performance -> BufferedInputStream
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fis);

        // read() liefert Byte for Byte aus der Datei. Wenn das Ende erreicht ist, dann liefert die Methode -1 als Ergebnis.
        // While-Schleife liest somit Zeichen um Zeichen aus.
        int byteRead;
        int characterCounter = 0;
        while ((byteRead = bufferedInputStream.read()) != -1) {
            // char[] ch = Character.toChars(byteRead);
            // System.out.println(ch);
            // Byte wird in char umgewandelt und ausgegeben.

            //Zählen Sie die Anzahl der eingelesenen Zeichen und geben Sie die Gesamtanzahl am Ende aus
            System.out.println("Zeichen " + characterCounter + ": ");
            System.out.print((int) ((char) byteRead));
            //System.out.println(" \t'" + (char) byteRead + "'");
            characterCounter++;
        }
        System.out.println("Anzahl gesamt: "+characterCounter);


        // close() gibt die Datei wieder frei.
        bufferedInputStream.close();
    }
}
