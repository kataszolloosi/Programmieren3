package File_IO;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

public class UE6_createRenameDelete {
    //Create 10 Files + Rename all files (only files) of the given directory
    //create, rename, delete
    public static void main(String[] args) throws IOException {

        File dir = new File("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\neueFile");
        createFiles(dir);
        renameFiles(dir);

    }


    public static void createFiles(File directory) throws IOException {

        for (int i = 0; i < 10; i++) {
            String filename = ThreadLocalRandom.current().nextInt() + ".mp3";
            File fileToCreate = new File(directory.getAbsolutePath() + " " + filename);
            //System.out.println("File " + i + ": " + fileToCreate.getAbsolutePath());
            fileToCreate.createNewFile();
            if (fileToCreate.createNewFile()) {
                System.out.println("File " + fileToCreate.getAbsolutePath() + "\\" + " CREATED");
            } else {
                System.out.println("ERROR: File " + fileToCreate.getAbsolutePath() + " is already exist");
            }
        }
    }

    public static void renameFiles(File directory) {

        for (File currentFile : directory.listFiles()) {
            if (currentFile.isFile()) {
                File destFile = new File(directory.getAbsolutePath() + File.separator + "1_" + currentFile.getName());
                if (currentFile.renameTo(destFile)) {
                    System.out.println("Rename " + currentFile.getAbsolutePath() + " to: " + destFile.getAbsolutePath());
                }
            } else {
                System.out.println("The file can't be renamed");
            }
        }

    }

    public static void deleteFiles(File directory) {
        for (File currentFile : directory.listFiles()) {
            if (currentFile.isFile()) {
                if(currentFile.delete()) {
                    System.out.println("DELETED " + currentFile.getAbsolutePath());
                }
            }
        }

    }
}
