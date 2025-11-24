import java.util.HashMap;

public class PersonMgmt {
    static DataManagement dataManagement = new DataManagement();

    public static String getPersonManagement(String personMgmtId) {
        String personMgmt = "";
        personMgmt = dataManagement.personManagementHashMap.get(personMgmtId);
        return personMgmt;
    }

    public void createPersonManagement(String key, String name) {
        if (dataManagement.personManagementHashMap.containsKey(key))
            throw new PersonManagementKeyAlreadyExiststException();

        dataManagement.personManagementHashMap.put(key, name);
    }

}
