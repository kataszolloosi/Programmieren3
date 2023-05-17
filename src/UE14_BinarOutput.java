import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UE14_BinarOutput {
    //Implementieren Sie Binary Output Beispiel
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\uebung14.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        String outputText = "Hallo File - first output";
        for (char c : outputText.toCharArray()) {
            System.out.println("Schreibe char: "+  (int)c + " in die Datei...");
            fileOutputStream.write(c);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
    }
}
