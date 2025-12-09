import java.util.Locale;

public class Person {
    private static int continuousPersonID = 1;

    public int id;
    public String firstName;
    public String lastName;
    public String dateOfBirth;
    public int addressId;
    public Enum gender;
    public int personManagementId;

    //"id","firstname","lastname","date of birth","addressId","gender","personManagementId"
    public Person(int id,
                  String firstName,
                  String lastName,
                  String dateOfBirth,
                  int addressId,
                  String gender,
                  int personManagementId
    ) {
        if (id > continuousPersonID) continuousPersonID = id;
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.addressId = addressId;
        this.gender = getGender(gender);
        this.personManagementId = personManagementId;
    }

    public Person(String firstName,
                  String lastName,
                  String dateOfBirth,
                  int addressId,
                  String gender,
                  int personManagementId) {
        this.id = ++continuousPersonID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.addressId = addressId;
        this.gender = getGender(gender);
        this.personManagementId = personManagementId;
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