import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataManagement {
    public int continuousPersonID = 0;
    public int continuousAddressID = 0;
    public int continuousPersonMgmtID = 0;
    public List<Person> personList = new ArrayList<>();

    public HashMap<Integer, String> personManagementHashMap = new HashMap<>();
    public HashMap<Integer, Address> addressHashMap = new HashMap<>();
}
