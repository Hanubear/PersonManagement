import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class FileInput {
    public String[] dataFill;

    public HashMap<Integer, Address> addressHashMap = new HashMap<>();
    public void importAddresses() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/addresses.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(";");

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<Integer, PersonManagement> personManagementHashMap = new HashMap<>();
    public void importPersonManagements() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/personManagements.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(";");

            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public HashMap<Integer, Person> personHashMap = new HashMap<>();
    public void importPersons() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/persons.csv"));
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(";");

                //createPersonFromFile(dataFill);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
