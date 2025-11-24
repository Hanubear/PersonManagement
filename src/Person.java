import java.util.HashMap;
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

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, String lastName, String dateOfBirth, Enum gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public Person(String firstName, String lastName, String dateOfBirth, String address, Enum gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.gender = gender;
    }

    public static Person createPersonFromFile(String[] data) {
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

    public static Person createPerson (){

        Person person = new Person();
        return person;
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