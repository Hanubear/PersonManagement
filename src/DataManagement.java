import java.util.*;

public class DataManagement {
    public Scanner scanner = new Scanner(System.in);
    public HashMap<Integer, PersonManagement> personManagementHashMap = new HashMap<>();
    public HashMap<Integer, Address> addressHashMap = new HashMap<>();
    public ArrayList<Person> personList = new ArrayList<>();


    // ~~ PERSON ~~ PERSON ~~ PERSON ~~ PERSON ~~ PERSON ~~ PERSON ~~ PERSON

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
        personList.add(person.id, person);
    }

    public void deletePerson(int personId) {
        for (int i = 1; i < personList.size(); i++) {
            if (personList.get(i).id == personId) {
                personList.remove(i);
                System.out.println("Successfully deleted ID " + personId);
                return;
            }
        }
        throw new IdNotFoundException();
    }

    // ~~ PERSONMANAGEMENT ~~ PERSONMANAGEMENT ~~ PERSONMANAGEMENT ~~ PERSONMANAGEMENT

    public PersonManagement getPersonManagement(int personManagementId) {
        try {
            return personManagementHashMap.get(personManagementId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void createPersonManagement(String name) {
        PersonManagement personManagement = new PersonManagement(name);
        personManagementHashMap.put(personManagement.id, personManagement);
    }

    public void deletePersonManagement(int pmId) {
        for (int i = 1; i <= personManagementHashMap.size(); i++) {
            if (personManagementHashMap.get(i).id == pmId) personManagementHashMap.remove(i);
        }
    }

    public void printPersonManagementList() {
        for (int i = 1; i <= personManagementHashMap.size(); i++) {
            System.out.print(personManagementHashMap.get(i).id + " ");
            System.out.println(personManagementHashMap.get(i).name);
        }
    }

    // ~~ ADDRESS ~~ ADDRESS ~~ ADDRESS ~~ ADDRESS ~~ ADDRESS ~~ ADDRESS ~~ ADDRESS

    public void createAddressFromFile(int addressId, String street, String zip, String city) {
        Address address = new Address(addressId, street, zip, city);
        addressHashMap.put(addressId, address);
    }

    public void createNewAddress(String street, String zip, String city) {
        Address address = new Address(street, zip, city);
        addressHashMap.put(address.streetId, address);
    }

    public int createNewAddress() {
        Address address = new Address();
        String input = "";

        System.out.println("Street: ");
        input = scanner.nextLine();
        address.setStreet(input);

        System.out.println("Zip: ");
        input = scanner.nextLine();
        address.setZip(input);

        System.out.println("City: ");
        input = scanner.nextLine();
        address.setCity(input);

        addressHashMap.put(address.streetId, address);
        return address.streetId;
    }

    public void deleteAddress(int addressId) {
        for (int i = 1; i <= addressHashMap.size(); i++) {
            if (addressHashMap.get(i).streetId == addressId) addressHashMap.remove(i);
        }
    }

    public String getAddressAsString(int addressId) {
        StringJoiner sj = new StringJoiner(", ", " ", " ");
        String addressString;
        sj.add(addressHashMap.get(addressId).street);
        sj.add(addressHashMap.get(addressId).city);
        sj.add(addressHashMap.get(addressId).zip);
        addressString = String.valueOf(sj);

        return addressString;
    }
}

