public class PersonManagement {
    public int id;
    public String name;

    public PersonManagement(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public PersonManagement createPersonmanagement(String[] personMgmt) {
        return new PersonManagement(Integer.parseInt(personMgmt[0]), personMgmt[1]);
    }

    public PersonManagement getPersonManagement(String personMgmtId) {
        FileInput fileInput = new FileInput();
        return fileInput.personManagementHashMap.get(personMgmtId);
    }

}
