package Network.ReadFromUrl;

import java.io.*;
import java.net.URL;

public class ReadFromUrl2 {
    public static void main(String[] args) {
        try {
            System.out.println("Main starting up...");
            System.out.println("Bitte die gewünschte URL eingeben:");
            BufferedReader input = new BufferedReader(
                    new InputStreamReader(System.in));
            String user_url = input.readLine();
            //fixe url zum testen -
            //String user_url = "https://ipof.me";
            System.out.println("Habe folgende URL bekommen: " + "'" + user_url + "'");
            //URL auslesen
            URL myUrl = new URL(user_url);
            InputStreamReader isr = new InputStreamReader(myUrl.openStream());
            BufferedReader br = new BufferedReader(isr);

            File file = new File("content1.html");
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //BufferedWriter bw = new BufferedWriter(new FileWriter("content1.html"));

            String one_line;
            //jede zeile von website -> auf konsole
            while((one_line = br.readLine()) !=null) {
                System.out.println(one_line);
                bufferedWriter.write(one_line);
                bufferedWriter.newLine();
            }
            bufferedWriter.flush();
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


       /* try {
            // get URL content
            URL url = new URL("https://ipof.me");
            URLConnection conn = url.openConnection();

            // open the stream and put it into BufferedReader
            BufferedReader br = new BufferedReader(
                    new InputStreamReader(conn.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("content.html"));

            String inputLine;
            while ((inputLine = br.readLine()) != null) {
                bufferedWriter.write(inputLine);
                bufferedWriter.newLine();
            }
            br.close();
            bufferedWriter.flush();
            bufferedWriter.close();

            System.out.println("Done");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }
}
