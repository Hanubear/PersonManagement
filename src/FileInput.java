import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileInput {
    public String[] dataFill;

    public HashMap<Integer, Address> addressHashMap = new HashMap<>();
    Address address;

    public void importAddresses() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/addresses.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(";");
                addressHashMap.put(Integer.parseInt(dataFill[0]), address.createAddress(dataFill));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<Integer, PersonManagement> personManagementHashMap = new HashMap<>();
    PersonManagement personManagement;

    public void importPersonManagements() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/personManagements.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(";");
                personManagementHashMap.put(Integer.parseInt(dataFill[0]), personManagement.createPersonmanagement(dataFill));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<Integer, Person> personHashMap = new HashMap<>();
    Person person;

    public void importPersons() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/persons.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(";");
                personHashMap.put(Integer.parseInt(dataFill[0]), person.createPersonFromFile(dataFill));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
