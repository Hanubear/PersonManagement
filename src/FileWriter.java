import java.io.BufferedWriter;
import java.io.IOException;

public class FileWriter {
    DataManagement dataManagement = new DataManagement();

    public void exportAddresses() {
        try {
            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter("data/addresses.csv"));
            bw.newLine();                          // move to a new line
            bw.write(" ");                     // add new text at the end
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportPersonManagements() {
        try {
            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter("data/personManagements.csv"));
            bw.newLine();                         // move to a new line
            bw.write(" ");                    // add new text at the end
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportPersons() {
        try {
            BufferedWriter bw = new BufferedWriter(new java.io.FileWriter("data/persons.csv"));
            bw.newLine();                         // move to a new line
            bw.write(" ");                    // add new text at the end
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
