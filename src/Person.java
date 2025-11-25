import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

public class Person {
    static DataManagement dataManagement = new DataManagement();

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

    public static Person createPersonFromFile(String[] data) {
        dataManagement.continuousID++;
        return new Person(
                data[0],
                data[1],
                data[2],
                data[3],
                Address.getAddressAsString(data[4]),
                getGender(data[5]),
                PersonMgmt.getPersonManagement(data[6])
        );
    }

    /**
     * String id,
     * String firstName,
     * String lastName,
     * String dateOfBirth,
     * String address,
     * Enum gender,
     * String personManagement
     *
     * @param newPersonData
     * @return person Object
     */
    public static Person createPerson(String[] newPersonData, String personMgmt) {
        dataManagement.continuousID++;
        return new Person(
                String.valueOf(dataManagement.continuousID),
                newPersonData[0],
                newPersonData[1],
                newPersonData[2],
                newPersonData[3],
                getGender(newPersonData[4]),
                personMgmt
        );
    }


    private static Enum getGender(String gender) {
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