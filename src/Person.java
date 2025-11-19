public class Person {
    public int id;
    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public Address addressId;
    public Enum<Gender> gender;
    public int personManagementId;

    //"id","firstname","lastname","date of birth","addressId","gender","personManagementId"
    public Person(int id,
                  String firstName,
                  String lastName,
                  String dateOfBirth,
                  Address address,
                  Enum<Gender> gender,
                  int personManagementId
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.addressId = address;
        this.gender = gender;
        this.personManagementId = personManagementId;
    }

}

enum Gender {
    Male,
    Female,
    Divers
}