package Abchlussbeispiel_FileIO;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class AddressManager {
    private ArrayList<Address> addresses = new ArrayList<>();

    public ArrayList<Address> getAdresses() {
        return addresses;
    }

    public void add(Address a) {
        //TODO
        addresses.add(a);
    }

    public void printAllAddresses() {
        for (int i = 0; i < addresses.size(); i++) {
            System.out.println("Eintrag " + i + ": " + addresses.get(i).toString());
        }
    }

    public void exportToCsv(String path, String separator) throws AddressExportException, AddressExportFileAlreadyExistsException {
        //TODO
        File file = new File(path);

        if (file.exists()) {
            throw new AddressExportFileAlreadyExistsException("File already exist");
        }
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(file);
            bw = new BufferedWriter(fw);

            for (Address a : addresses) {
                bw.write(a.toString());
                bw.newLine();
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new AddressExportException(e.getMessage());
        }

    }

    public void loadFromCsv(String path, String separator) throws AddressLoadException {
        //TODO
//        List<Address> addressList = new ArrayList<>();
        BufferedReader bufferedReader = null;
        try {
            FileReader fr = new FileReader(path);
            bufferedReader = new BufferedReader(fr);

            String line;
            while (((line = bufferedReader.readLine()) != null)) {
                String[] tempp = line.split(separator);
                if (tempp.length != 4) {
                    throw new AddressLoadWrongFormatException("4 Spalten erwartet!");
                }
                addresses.add(new Address(tempp[0], tempp[1], tempp[2], tempp[3]));
            }
        } catch (IOException e) {
            throw new AddressLoadException(e.getMessage());
        } catch (AddressLoadWrongFormatException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                throw new AddressLoadException(e.getMessage());
            }
        }
    }

}
