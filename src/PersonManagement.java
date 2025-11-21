public class PersonManagement {
    public String id;
    public String name;

    public PersonManagement(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public static String getPersonManagement(String personMgmtId) {
        String persoMgmgt = "";
        persoMgmgt = FileInput.personManagementHashMap.get(personMgmtId).name;
        return persoMgmgt;
    }

}
