public class Person {
    public int id;
    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public Address address;
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
        this.address = address;
        this.gender = gender;
        this.personManagementId = personManagementId;
    }

    public Person createPersonFromFile(String[] personData) {
        return new Person(
                Integer.parseInt(personData[0]),
                personData[1],
                personData[2],
                personData[3],
                address.getAddressAsString(personData[5]),
                getGender(personData[4]),
                Integer.parseInt(personData[6])
        );
    }



    private Enum getGender(String gender) {
        switch (gender) {
            case "Male" -> {
                return Gender.MALE;
            }
            case "Female" -> {
                return Gender.FEMALE;
            }
            case "Div" -> {
                return Gender.DIVERS;
            }
        }
        throw new RuntimeException("No Gender");
    }

}

enum Gender {
    MALE,
    FEMALE,
    DIVERS
}