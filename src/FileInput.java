import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInput {
    DataManagement dataManagement = new DataManagement();
    public String[] dataFill;


    public void importAddresses() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/addresses.csv"));
            String line;
            reader.readLine(); // Skip header line
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(",");
                dataManagement.addressHashMap.put(dataFill[0], new Address(dataFill[0], dataFill[1], dataFill[2], dataFill[3]));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

//    public static HashMap<String, String> personManagementHashMap = new HashMap<>();

    public void importPersonManagements() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/personManagements.csv"));
            String line;
            reader.readLine(); // Skip header line
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(",");
                dataManagement.personManagementHashMap.put(dataFill[0], dataFill[1]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    Person person;
    public void importPersons() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/persons.csv"));
            String line;
            reader.readLine(); // Skip header line
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(",");
                dataManagement.personHashMap.put(dataFill[0], person.createPersonFromFile(dataFill));
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
