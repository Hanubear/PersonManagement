import java.util.Locale;

public class Person {
    public String id;
    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public String address;
    public Enum gender;
    public String personManagement;

    //"id","firstname","lastname","date of birth","addressId","gender","personManagementId"
    public Person(String id,
                  String firstName,
                  String lastName,
                  String dateOfBirth,
                  String addressId,
                  String gender,
                  String personManagementId
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = Address.getAddressAsString(addressId);
        this.gender = getGender(gender);
        this.personManagement = PersonManagement.getPersonManagement(personManagementId);
    }


    private Enum getGender(String gender) {
        try {
            switch (gender.toLowerCase(Locale.ROOT)) {
                case "male" -> {
                    return Gender.MALE;
                }
                case "female" -> {
                    return Gender.FEMALE;
                }
                case "div" -> {
                    return Gender.DIVERS;
                }
            }
        } catch (Exception e) {
            throw new NoGenderException("No Gender");
        }
        return null;
    }

}

enum Gender {
    MALE,
    FEMALE,
    DIVERS
}