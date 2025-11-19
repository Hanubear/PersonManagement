public class Person {
    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public Enum<Gender> gender;
    public Address address;

    public Person(String firstName,
                  String lastName,
                  String dateOfBirth,
                  Enum<Gender> gender,
                  Address address
                  ) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
    }

}

enum Gender {
    Male,
    Female,
    Divers
}