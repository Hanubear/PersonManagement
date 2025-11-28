public class PersonManagement {
    static DataManagement dataManagement = new DataManagement();
    private static int continuousPersonMgmtID = 0;

    public int id;
    public String name;

    public PersonManagement(int id, String name) {
        if (id > continuousPersonMgmtID) continuousPersonMgmtID = id;
        this.id = id;
        this.name = name;
    }

    public PersonManagement(String name) {
        this.id = ++continuousPersonMgmtID;
        this.name = name;
    }

    /**
     * Update CSV
     *
     * @param personManagement
     * @return Anzahl der aktualisierten Zeilen
     */
    public void update(PersonManagement personManagement) {

    }

    /**
     * liefert das gelöschte Objekt
     *
     * @param personManagementId
     * @return
     */
    public PersonManagement delete(int personManagementId) {

        return null;
    }

}
