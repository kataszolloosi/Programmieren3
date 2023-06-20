package Netzwerk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class ReadFromUrl {
    public static void main(String[] args) {
        try {
            System.out.println("Main starting up...");
            System.out.println("Bitte die gewünschte URL eingeben:");
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(System.in));
            String user_url = input.readLine();
            System.out.println("Habe folgende URL bekommen: " + "'" + user_url + "'");
            //URL auslesen
            URL myUrl = new URL(user_url);
            InputStreamReader isr = new InputStreamReader(myUrl.openStream());
            BufferedReader br = new BufferedReader(isr);
            String one_line;
            while((one_line = br.readLine()) !=null) {
                System.out.println(one_line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
