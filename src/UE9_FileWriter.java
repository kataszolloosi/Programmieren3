import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class UE9_FileWriter {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\uebung9.txt");  //objekt erstellt
        FileWriter fileWriter = new FileWriter(file);   //file ertellt
        PrintWriter printWriter = new PrintWriter(fileWriter);   //bufferedWriter ist besser


        printWriter.println("Ich bin printWriter");
        printWriter.println("Hello World");
        printWriter.flush();
        printWriter.close();
        printWriter.write("hslhad");


    }

}
