import java.io.BufferedWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.StringJoiner;

public class FileWriter {
    DataManagement dataManagement = new DataManagement();
    StringJoiner sj = new StringJoiner("\",\"", "\"", "\"");
    String data;


    public void exportAddresses(HashMap<Integer,Address>hashMap) {
        try {
            java.io.FileWriter file = new java.io.FileWriter("data/testAddresses.csv");
            BufferedWriter output = new BufferedWriter(file);

            //"id","street","zip","city"
            output.write("\"id\",\"street\",\"zip\",\"city\"");
            output.newLine();
            for (int i = 0; i < hashMap.size(); i++) {
                data = "";
                sj.add(String.valueOf(hashMap.get(i).streetId));
                sj.add(hashMap.get(i).street);
                sj.add(hashMap.get(i).zip);
                sj.add(hashMap.get(i).city);

                data = String.valueOf(sj);
                output.write(data);
                output.newLine();
            }

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportPersonManagements(HashMap<Integer,PersonManagement> hashMap) {
        try {
            java.io.FileWriter file = new java.io.FileWriter("data/testPersonManagements.csv");
            BufferedWriter output = new BufferedWriter(file);

            //"id","name"
            output.write("\"id\",\"name\"");
            output.newLine();
            for (int i = 0; i < hashMap.size(); i++) {
                data = "";
                sj.add(String.valueOf(hashMap.get(i).id));
                sj.add(hashMap.get(i).name);

                data = String.valueOf(sj);
                output.write(data);
                output.newLine();
            }

            output.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void exportPersons(List<Person> list) {
        try {
            java.io.FileWriter file = new java.io.FileWriter("data/testPersons.csv");
            BufferedWriter output = new BufferedWriter(file);

            //"id","firstname","lastname","date of birth","addressId","gender","personManagementId"
            output.write("\"id\",\"firstname\",\"lastname\",\"date of birth\",\"addressId\",\"gender\",\"personManagementId\"");
            output.newLine();
            for (int i = 1; i <= list.size(); i++) {
                data = "";
                sj.add(String.valueOf(list.get(i).id));
                sj.add(list.get(i).firstName);
                sj.add(list.get(i).lastName);
                sj.add(list.get(i).dateOfBirth);
                sj.add(String.valueOf(list.get(i).addressId));
                sj.add(list.get(i).gender.toString());
                sj.add(String.valueOf(list.get(i).personManagementId));

                data = String.valueOf(sj);
                output.write(data);
                output.newLine();
            }

            output.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
