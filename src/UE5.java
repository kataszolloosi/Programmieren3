import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class UE5 {
    public static void main(String[] args) {
        File dir = new File("C:\\Users\\s53036\\Desktop\\Kata\\testordner\\blabla");
        createDirectory(dir);


    }

    public static void createDirectory(File file) {
        file = new File("C:\\Users\\s53036\\Desktop\\Kata\\testordner\\blabla");

        // check if the directory can be created
        // using the abstract path name
        if (file.mkdirs()) {

            // display that the directory is created
            // as the function returned true
            System.out.println("Directory is created");
        } else {

            // display that the directory cannot be created
            // as the function returned false
            System.out.println("Directory cannot be created");
        }
    }
}
