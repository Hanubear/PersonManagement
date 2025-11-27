import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataManagement {
    public int continuousAddressID = 0;
    public int continuousPersonMgmtID = 0;
    public List<Person> personList = new ArrayList<>();

    public HashMap<Integer, String> personManagementHashMap = new HashMap<>();
    public HashMap<Integer, Address> addressHashMap = new HashMap<>();


    public void createPerson(String[] newPersonData, int personMgmtId) {
        Person person = new Person(
                newPersonData[0],
                newPersonData[1],
                newPersonData[2],
                Integer.parseInt(newPersonData[3]),
                newPersonData[4],
                personMgmtId
        );
        personList.add(person.id, person);
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
    public void createPersonFromFile(String[] data) {
        Person person = new Person(
                Integer.parseInt(data[0]),
                data[1],
                data[2],
                data[3],
                Integer.parseInt(data[4]),
                (data[5]),
                Integer.parseInt(data[6])
        );
        personList.add(Integer.parseInt(data[0]), person);
    }
}

