import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UE15_BinarOutput {
    public static void main(String[] args) throws IOException {
        //lesen sie zeichen für zeichen von der konsole ein unde schreiben sie die einzelnen bytes in eine datei
        //von der konsole kann mittels system.in.read ein zeichen gelesen
        //brechen sie ab, wenn ein x eingegeben wird
        File file = new File("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\uebung15.txt");
        FileOutputStream fileOutputStream = new FileOutputStream(file);

        char c;
        while ((c = (char) System.in.read()) != 'x') {
            fileOutputStream.write(c);
            System.out.println(c);
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        System.out.println("Fertig");
    }

}
