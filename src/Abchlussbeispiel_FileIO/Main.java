package Abchlussbeispiel_FileIO;

public class Main {
    public static void main(String[] args) throws AddressExportException, AddressLoadException, AddressExportFileAlreadyExistsException {
        System.out.println("Demo starting hier...");
        Address a = new Address("King", "Kong", "+81 316 7", "kong@superking.biz");
        Address a1 = new Address("King", "Lion", "+81 316 4", "lion@superking.biz");
        Address a2 = new Address("Hon", "Kong", "+81 316 3", "hon@superking.biz");
        Address a3 = new Address("King", "Bird", "+81 316 2", "king@superking.biz");
        Address a4 = new Address("Ping", "Pong", "+81 316 1", "pong@superking.biz");

        AddressManager am = new AddressManager();

        am.add(a);
        am.add(a1);
        am.add(a2);
        am.add(a3);
        am.add(a4);
        am.printAllAddresses();

        am.exportToCsv("abschlussss.csv", "---");
        am.loadFromCsv("abschlussss.csv", "---");
    }
}
