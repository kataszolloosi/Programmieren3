package File_IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class UE8_Exception {
    public static void main(String[] args) {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String data = null;
        try {
            data = br.readLine();
            while (data != null) {
                if (data.toLowerCase().equals("stop")) {
                    break;
                }
                System.out.println(data);
                data = br.readLine();
            }
            br.close();
            throw new IOException("Fehler: Das ist eine Testexception");
        } catch (IOException meineException) {
            System.out.println("Fehler: IO Exception, etwas ist schief gelaufen. Nachricht: " + meineException.getMessage());
        }
    }
}
