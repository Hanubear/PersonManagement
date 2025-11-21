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

    public Address createAddress(String[] addressData) {
        return new Address(Integer.parseInt(addressData[0]), addressData[1], Integer.parseInt(addressData[2]),addressData[3]);
    }

    public Address getAddressAsString(String addressId) {
        FileInput fileInput = new FileInput();
        return fileInput.addressHashMap.get(addressId);
    }

}
