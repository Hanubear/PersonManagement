public class Address {
    public int streetId;
    public String street;
    public String city;
    public int zip;

    //"id","street","zip","city"
    public Address(int streetId, String street, int zip, String city) {
        this.streetId = streetId;
        this.street = street;
        this.zip = zip;
        this.city = city;
    }

    public Address getAddressAsString(String addressId){
        FileInput fileInput = new FileInput();
        return fileInput.addressHashMap.get(addressId);
    }

}
