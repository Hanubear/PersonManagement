public class Person {
    String firstName;
    String lastName;
    String dateOfBirth;
    String address;
    Enum<Gender> gender;

    public Person(String firstName,
                  String lastName,
                  String dateOfBirth,
                  String address,
                  Enum<Gender> gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
    }

    public void createPerson() {

    }

}

enum Gender {
    Male,
    Female,
    Divers
}