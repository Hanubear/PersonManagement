import java.util.Locale;

public class Person {
    static DataManagement dataManagement = new DataManagement();

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
                  Enum gender,
                  int personManagementId
    ) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.addressId = addressId;
        this.gender = gender;
        this.personManagementId = personManagementId;
    }

    /**
     * id;
     * firstName;
     * lastName;
     * dateOfBirth;
     * addressId;
     * gender;
     * personManagementId;
     *
     * @param data
     */
    public static void createPersonFromFile(String[] data) {
        dataManagement.continuousPersonID++;
        Person person = new Person(
                Integer.parseInt(data[0]),
                data[1],
                data[2],
                data[3],
                Integer.parseInt(data[4]),
                getGender(data[5]),
                Integer.parseInt(data[6])
        );
        dataManagement.personList.add(Integer.parseInt(data[0]), person);
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
     * @param personMgmtId
     */
    public static void createPerson(String[] newPersonData, int personMgmtId) {
        dataManagement.continuousPersonID++;
        Person person = new Person(
                dataManagement.continuousPersonID,
                newPersonData[0],
                newPersonData[1],
                newPersonData[2],
                Integer.parseInt(newPersonData[3]),
                getGender(newPersonData[4]),
                personMgmtId
        );
        dataManagement.personList.add(dataManagement.continuousPersonID, person);
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