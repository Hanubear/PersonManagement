import java.util.StringJoiner;

public class Address {
    public String streetId;
    public String street;
    public String city;
    public String zip;

    //"id","street","zip","city"
    public Address(String streetId, String street, String zip, String city) {
        this.streetId = streetId;
        this.street = street;
        this.zip = zip;
        this.city = city;
    }
    DataManagement dataManagement;
    public String getAddressAsString(String addressId) {
        StringJoiner sj = new StringJoiner(", ", " ", " ");
        String address;
        sj.add(dataManagement.addressHashMap.get(addressId).street);
        sj.add(dataManagement.addressHashMap.get(addressId).city);
        sj.add(dataManagement.addressHashMap.get(addressId).zip);
        address = String.valueOf(sj);

        return address;
    }

}
