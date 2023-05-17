import java.io.*;

public class UE16_Serialisiert {
    String s = "Hello World";
    byte[] b = {'e', 'x', 'a', 'm', 'p', 'l', 'e'};

        try

    {
        File file = new File("object.dat");
        // Teil 1 - Schreibe Objekt(e) in Datei
        FileOutputStream fileOutputStream = new FileOutputStream(file);
        ObjectOutputStream objectOutputStream = null;
        try {
            objectOutputStream = new ObjectOutputStream(fileOutputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // write something in the file
        objectOutputStream.writeObject(s);
        objectOutputStream.writeObject(b);
        objectOutputStream.flush();
        objectOutputStream.close();

        // create an ObjectInputStream for the file we created before
        FileInputStream fileInputStream = new FileInputStream(file);
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        // System.out.println(objectInputStream.readObject()); -> Cast is missing!
        // read and print an object and cast it as string
        System.out.println("STRING: " + (String) objectInputStream.readObject());

        // read and print an object and cast it as string
        byte[] text2 = (byte[]) objectInputStream.readObject();
        String s2 = new String(text2);
        System.out.println("BYTE[]: " + s2);

    } catch(
    Exception ex)

    {
        ex.printStackTrace();
    }
        /*
         FileInputStream fis = new FileInputStream("outputFile");
         ArrayList<Object> objectsList = new ArrayList<>();
        boolean cont = true;
         while (cont) {
            try (ObjectInputStream input = new ObjectInputStream(fis)) {
                Object obj = input.readObject();
                    if (obj != null) {
                        objectsList.add(obj);
                    } else {
                        cont = false;
                        }
                    } catch (Exception e) {
           // System.out.println(e.printStackTrace());
           }
        } */
}
