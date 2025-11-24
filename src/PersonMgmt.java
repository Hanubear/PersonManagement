import java.util.HashMap;

public class PersonMgmt {
    DataManagement dataManagement = new DataManagement();

    public String getPersonManagement(String personMgmtId) {
        String personMgmt = "";
        personMgmt = dataManagement.personManagementHashMap.get(personMgmtId);
        return personMgmt;
    }

}
