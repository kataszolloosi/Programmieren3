package File_IO;

import java.io.File;
import java.io.IOException;

public class UE2_allFileListen {
    public static void main(String[] args) throws IOException {
        //Write a program, which lists all files / directories of the given directory (without sub directories)
        String dir = "C:\\";
        File f = new File(dir);

        System.out.println("Gibt es dieses file/directory? " + f.exists());
        System.out.println("Ist es ein Directory/Folder? " + f.isDirectory());

        File[] myFilesInDirectory = f.listFiles();

        printFilesOfDirectory(myFilesInDirectory);
    }

    public static void printFilesOfDirectory(File[] inputArray) {
        for (File file : inputArray) {
            if (file.isDirectory()) {
                System.out.println("Dir: " +file.getAbsolutePath());
            } else {
                System.out.println("File: " + file.getAbsoluteFile());
            }
        }
    }
}
