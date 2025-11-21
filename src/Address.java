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

    public static String getAddressAsString(String addressId) {
        StringJoiner sj = new StringJoiner(" ", "", "");
        String address;
        sj.add(FileInput.addressHashMap.get(addressId).street);
        sj.add(FileInput.addressHashMap.get(addressId).city);
        sj.add(FileInput.addressHashMap.get(addressId).zip);
        address = String.valueOf(sj);

        return address;
    }

}
