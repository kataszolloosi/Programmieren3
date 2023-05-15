import java.io.File;
import java.io.IOException;

public class UE4 {
    //Write a program, which prints all files + relevant attributes of the files to the console. And we also want to know how much storage they need. (Print the total storage of the files to the console at the end
    public static void main(String[] args) throws IOException {
        //Write a program, which lists all files / directories of the given directory (without sub directories)
        String dir = "C:\\Users\\s53036\\Desktop\\Kata";
        File f = new File(dir);

        File[] myFilesInDirectory = f.listFiles();

        printFilesOfDirectory(myFilesInDirectory);

    }

    public static void printFilesOfDirectory(File[] inputArray) {
        long totalSize = 0;
        for (File file : inputArray) {
            if (file.isFile()) {
                System.out.print("File: " + file.getAbsolutePath());
                System.out.println("\t" + file.length()+ " "+file.getPath());
                totalSize += file.length();
            }
        }
        System.out.println("Gesamtgroesse: " + totalSize);
    }
}
