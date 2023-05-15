import java.io.File;

public class UE3 {
    public static void main(String[] args) {
        //Write a program, which lists all files / directories of the given directory + their sub directories

        String dir = "C:\\Users\\s53036\\downloads";
        File f = new File(dir);
        File[] myFilesInDirectory = f.listFiles();
        printFilesOfDirectoryWithSubfolder(myFilesInDirectory);

    }

    public static void printFilesOfDirectoryWithSubfolder(File[] inputArray) {

        for (File file : inputArray) {
            if (file.isDirectory()) {
                System.out.println("Dir: " + file.getAbsolutePath());
                System.out.println();
                System.out.println("Weil das ein DIR ist, hier der Inhalt: ");
                printFilesOfDirectoryWithSubfolder(file.listFiles());
            } else {
                System.out.println();
                System.out.println("File: " + file.getAbsoluteFile());
            }
        }
    }
}
