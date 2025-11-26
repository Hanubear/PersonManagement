import java.util.StringJoiner;

public class Address {
    public int streetId;
    public String street;
    public String city;
    public String zip;

    //"id","street","zip","city"
    public Address(int streetId, String street, String zip, String city) {
        this.streetId = streetId;
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    static DataManagement dataManagement = new DataManagement();

    public static String getAddressAsString(int addressId) {
        StringJoiner sj = new StringJoiner(", ", " ", " ");
        String addressString;
        sj.add(dataManagement.addressHashMap.get(addressId).street);
        sj.add(dataManagement.addressHashMap.get(addressId).city);
        sj.add(dataManagement.addressHashMap.get(addressId).zip);
        addressString = String.valueOf(sj);

        return addressString;
    }

    public static void createAddressFromFile(int addressId, String street, String zip, String city) {
        dataManagement.continuousAddressID++;
        Address address = new Address(addressId, street, zip, city);
        dataManagement.addressHashMap.put(addressId, address);
    }

    public static void createNewAddress(String street, String zip, String city) {
        dataManagement.continuousAddressID++;
        Address address = new Address(dataManagement.continuousAddressID, street, zip, city);
        dataManagement.addressHashMap.put(dataManagement.continuousAddressID, address);
    }

}
