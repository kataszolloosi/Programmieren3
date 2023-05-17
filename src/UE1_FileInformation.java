import java.io.File;
import java.io.IOException;

public class UE1_FileInformation {
    public static void main(String[] args) throws IOException {

          /*
        Create a method, which has the parameter File
            The method should print the following information of a file on the console:
            - Does this file exist?
            - Name of the File
            - Parent Directory of the File
            - Path to this File
            - Is this a directory?
            - Is this a file?
            - Is this file readable?
            - Is this File writeable
            - File Size
            - ...
         */

        File file = new File("test.txt");

        System.out.println("Does this file exist? " + file.exists());
        System.out.println("Full Path to File: " + file.getAbsolutePath());
        System.out.println("Name of the File: "+file.getName());
        System.out.println("Parent Directory of the File: "+file.getParent());
        System.out.println("Path to this File: "+file.getPath());
        System.out.println("Is this a directory? " +file.isDirectory());
        System.out.println("Is this a file? "+file.isFile());
        System.out.println("hidden? " + file.isHidden());
        System.out.println("Is this file readable? "+file.canRead());
        System.out.println("Is this File writeable? "+file.canWrite());
        System.out.println("File size: "+file.length() + " byte");
        System.out.println("File size: "+file.length()/1024d + " kb");   //1024d - d für komma zahl


        //create new, empty file
        File file2 = new File("k.txt");
        file2.createNewFile();


    }
}
