public class PersonManagement {
    static DataManagement dataManagement = new DataManagement();

    public static String getPersonManagement(int personMgmtId) {
        String personMgmt;
        personMgmt = dataManagement.personManagementHashMap.get(personMgmtId);
        return personMgmt;
    }

    public int createPersonManagement(String name) {
        int key = dataManagement.continuousPersonMgmtID;
        dataManagement.personManagementHashMap.put(key, name);
        dataManagement.continuousPersonMgmtID++;
        return dataManagement.continuousPersonMgmtID;
    }

    public String get(int personManagementId){
        try {
            return dataManagement.personManagementHashMap.get(personManagementId);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /**liefert die Anzahl der aktualisierten Zeilen
     *
     * @param personManagement
     * @return Anzahl der aktualisierten Zeilen
     */
    public int update(PersonManagement personManagement){

        return 0;
    }

    /**liefert das gelöschte Objekt
     *
     * @param personManagementId
     * @return
     */
    public PersonManagement delete(int personManagementId){

        return null;
    }

}
