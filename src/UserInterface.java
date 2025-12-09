import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class UserInterface {
    public void startUserInterface() throws InterruptedException {
        UserInteraction userInteraction = new UserInteraction();
        DataManagement dataManagement = new DataManagement();
        FileWriter fileWriter = new FileWriter();
        boolean run = true;
        String select;

//        userInteraction.printAnnoyingLoadingBar();
        while (run) {
            userInteraction.printMainMenu();
            select = userInteraction.getMenuSelect();
            switch (select) { // ~~~MAIN MENU~~~
                case "1" -> { // ~~~PERSON~~~
                    userInteraction.printPersonMenu();
                    select = userInteraction.getMenuSelect();
                    switch (select) {
                        case "1" -> {
                            //where to
                            dataManagement.printPersonManagementList();
                            int selectID = userInteraction.getIdSelect();
                            //add new Person
                            dataManagement.createPerson(userInteraction.scannerPersonData(), selectID);
                        }
                        case "2" -> {
                            //delete Person
                            dataManagement.deletePerson(userInteraction.getIdSelect());
                        }
                        case "3" -> {
                            //update PersonCSV
                            fileWriter.exportPersons(dataManagement.personList);
                            userInteraction.printAnnoyingLoadingBar();
                        }
                        case "4" -> {
                            return;
                        }
                        case ":q!" -> {
                            //close
                            System.out.println("Shutting down");
                            shutdown(fileWriter, dataManagement.personList, dataManagement.addressHashMap, dataManagement.personManagementHashMap);
                            run = false;
                        }

                    }

                }
                case "2" -> { // ~~~ADDRESS~~~
                    userInteraction.printAddressMenu();
                    select = userInteraction.getMenuSelect();
                    switch (select) {
                        case "1" -> {
                            //add new Address
                            dataManagement.createNewAddress();
                        }
                        case "2" -> {
                            //delete Address
                            dataManagement.deleteAddress(userInteraction.getIdSelect());
                        }
                        case "3" -> {
                            //update AddressCSV
                            fileWriter.exportAddresses(dataManagement.addressHashMap);
                        }
                        case "4" -> {
                            //Back
                            return;
                        }
                        case ":q!" -> {
                            //close
                            System.out.println("Shutting down");
                            shutdown(fileWriter, dataManagement.personList, dataManagement.addressHashMap, dataManagement.personManagementHashMap);
                            run = false;
                        }

                    }
                }
                case "3" -> { // ~~~PMCategory~~~
                    userInteraction.printPersonManagementMenu();
                    select = userInteraction.getMenuSelect();
                    switch (select) {
                        case "1" -> {
                            //add new PersonManagement
                            dataManagement.createPersonManagement(userInteraction.getMenuSelect());
                        }
                        case "2" -> {
                            //delete PersonManagement
                            dataManagement.deletePersonManagement(userInteraction.getIdSelect());
                        }
                        case "3" -> {
                            //update PersonManagementCSV
                            fileWriter.exportPersonManagements(dataManagement.personManagementHashMap);
                        }
                        case "4" -> {
                            //Back
                            return;
                        }
                        case ":q!" -> {
                            //close
                            System.out.println("Shutting down");
                            shutdown(fileWriter, dataManagement.personList, dataManagement.addressHashMap, dataManagement.personManagementHashMap);
                            run = false;
                        }

                    }
                }
                case "4" -> {
                    // ALL CSV UPDATE METHODS IN HERE
                    shutdown(fileWriter, dataManagement.personList, dataManagement.addressHashMap, dataManagement.personManagementHashMap);
                }
                case ":q!" -> {
                    //update and close
                    shutdown(fileWriter, dataManagement.personList, dataManagement.addressHashMap, dataManagement.personManagementHashMap);
                    run = false;
                }

            }

        }

    }

    private void shutdown(FileWriter fileWriter, ArrayList<Person> list, HashMap<Integer, Address> addressHashMap, HashMap<Integer, PersonManagement> pmHashMap) {
        fileWriter.exportPersons(list);
        fileWriter.exportAddresses(addressHashMap);
        fileWriter.exportPersonManagements(pmHashMap);
    }
}
