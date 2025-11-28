import java.util.StringJoiner;

public class Address {
    public static int continuousAddressID = 0;

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

    public Address(String street, String city, String zip) {
        if (streetId > continuousAddressID) continuousAddressID = streetId;
        this.streetId = ++continuousAddressID;
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public Address() {
        this.streetId = ++continuousAddressID;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
