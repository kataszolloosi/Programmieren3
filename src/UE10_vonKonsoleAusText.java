import java.io.*;

public class UE10_vonKonsoleAusText {
    public static void main(String[] args) throws IOException {
        //Schreiben Sie ein Programm, das Ihre Noten aus allen
        //Fächern im ersten Semester von der Konsole einliest und
        //anschließend als „.txt“- Datei speichert
        //Die Eingabe endet, wenn das Wort „STOP“ eingegeben wird

        //einlesen von konsole
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        //objekt erstellt
        File file = new File("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\uebung10.txt");
        //schreiben auf file
        FileWriter fileWriter = new FileWriter(file);
        PrintWriter printWriter = new PrintWriter(fileWriter);

        // Zeile für Zeile wird eingelesen
        String data=" ";
        while (!(data = br.readLine()).toLowerCase().equals("stop")) {
            // Mittels println(...) werden Zeilen geschrieben. Jede Zeile wird richtig abgeschlosen.
            printWriter.println(data);
            // printWriter.flush();
            System.out.println(data);
        }

       /* String data=br.readLine();
        while (data != null){
            if (data.toLowerCase().equals("stop")) {
                System.out.println("Program close");
                break;
            }
            printWriter.println(data);
            System.out.println(data);
            data=br.readLine();
        }*/

        // bufferedReader schließen - andere hat zugreif nach schließen
        br.close();
        // flush() löst das Schreiben aus - schreib alles aus
        printWriter.flush();
        printWriter.close();
    }
}
