import java.util.HashMap;
import java.util.Locale;

public class Person {
//    public HashMap<String, Person> personHashMap = new HashMap<>();

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
                  String address,
                  Enum gender,
                  String personManagement
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
        this.personManagement = personManagement;
    }

    Address addressInstance;
    PersonMgmt personMgmt;
    public Person createPersonFromFile(String[] data) {
        return new Person(
                data[0],
                data[1],
                data[2],
                data[3],
                addressInstance.getAddressAsString(data[4]),
                getGender(data[5]),
                personMgmt.getPersonManagement(data[6])
        );
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