package Netzwerk.UE2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class CheckResponseCode {
    //überprüft der Code, ob eine erfolgreiche Verbindung zum angegebenen URL-Objekt hergestellt wurde,
    //und gibt den Antwortcode aus, um anzuzeigen, ob die Verbindung erfolgreich war oder nicht
    public static void main(String[] args) throws IOException {

        URL urlObj = new URL("http://www.google.at");
        //eine Verbindung zum angegebenen URL-Objekt hergestellt
        HttpURLConnection httpCon = (HttpURLConnection) urlObj.openConnection();

        int responseCode = httpCon.getResponseCode();

        if (responseCode != HttpURLConnection.HTTP_OK) {
            System.out.println("Server returned response code " + responseCode + ". Download failed.");
        }
        else {
            System.out.println(responseCode);
        }

    }
}
