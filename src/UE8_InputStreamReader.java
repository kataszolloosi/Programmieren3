import java.io.*;

public class UE8_InputStreamReader {
    public static void main(String[] args) throws IOException {
        //input von konsole, lauft nur bis stop input
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        String data=br.readLine();
        while (data != null){
            if (data.toLowerCase().equals("stop")) {
                System.out.println("Program close");
                break;
            }
            System.out.println(data);
            data=br.readLine();
        }
    }
}
