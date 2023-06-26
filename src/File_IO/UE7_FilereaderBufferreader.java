package File_IO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UE7_FilereaderBufferreader {
    public static void main(String[] args) throws IOException {
//        text aus datei einlesen
        File file = new File("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\uebung7.txt");  //absolutenpfad
        //relativenpfad: newFile.txt
        file.createNewFile();

        FileReader fr = new FileReader("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\newFile.txt");
        BufferedReader br = new BufferedReader(fr);
//        String zeile1 = br.readLine();
//        System.out.println(zeile1);
//        String zeile2 = br.readLine();
//        System.out.println(zeile2);
//        String zeile3 = br.readLine();
//        System.out.println(zeile3);
//        br.close();

        String zeile="";
            while ((zeile=br.readLine())!=null){
                System.out.println(zeile);
            }
            br.close();

//        try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\s53036\\Desktop\\Kata\\Prog3\\newFile.txt"))){
//            String zeile="";
//            while ((zeile=br.readLine())!=null){
//                System.out.println(zeile);
//            }
//        } catch (Exception e){
//            System.out.println("Ein Fehler ist beim Öffnen der Datei aufgetreten.");
//        }




    }

}
