public class PersonMgmt {
    static DataManagement dataManagement = new DataManagement();

    public static String getPersonManagement(int personMgmtId) {
        String personMgmt;
        personMgmt = dataManagement.personManagementHashMap.get(personMgmtId);
        return personMgmt;
    }

    public void createPersonManagement(String name) {
        int key = dataManagement.continuousPersonMgmtID;
        dataManagement.personManagementHashMap.put(key, name);
        dataManagement.continuousPersonMgmtID++;
    }

}
