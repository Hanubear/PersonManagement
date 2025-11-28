import java.io.BufferedReader;
import java.io.IOException;

public class FileReader {
    DataManagement dataManagement = new DataManagement();
    public String[] dataFill;

    public void importAddresses() {
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader("data/addresses.csv"));
            String line;
            reader.readLine(); // Skip header line
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(",");
                dataManagement.createAddressFromFile((Integer.parseInt(dataFill[0])), dataFill[1], dataFill[2], dataFill[3]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importPersonManagements() {
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader("data/personManagements.csv"));
            String line;
            reader.readLine(); // Skip header line
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(",");
                dataManagement.createPersonManagement(dataFill[1]);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void importPersons() {
        try {
            BufferedReader reader = new BufferedReader(new java.io.FileReader("data/persons.csv"));
            String line;
            reader.readLine(); // Skip header line
            while ((line = reader.readLine()) != null) {
                if (line.isBlank()) continue;
                dataFill = line.split(",");
                dataManagement.createPersonFromFile(dataFill);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
