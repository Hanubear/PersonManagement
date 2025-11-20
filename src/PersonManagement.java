public class PersonManagement {
    public int id;
    public String name;

    public PersonManagement(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public PersonManagement getPersonManagement(String personMgmtId){
        FileInput fileInput = new FileInput();
        return fileInput.personManagementHashMap.get(personMgmtId);
    }
    /*
    Get PERSOMNMGT Method
     */

}
