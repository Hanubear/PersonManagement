import java.util.ArrayList;
import java.util.HashMap;

public class UserInterface {
    public void startUserInterface(DataManagement dataManagement) throws InterruptedException {
        UserInteraction userInteraction = new UserInteraction(dataManagement);
        FileWriter fileWriter = new FileWriter();
        boolean run = true;

//        userInteraction.printAnnoyingLoadingBar();
        while (run) {
            String select;
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
                            int selectID;
                            boolean success = false;
                            do {
                                try {
                                    selectID = userInteraction.getIdSelect();
                                    if (!dataManagement.personManagementHashMap.containsKey(selectID))
                                        throw new IdNotFoundException();
                                    //add new Person
                                    String[] personData = userInteraction.scannerPersonData();
                                    dataManagement.createPerson(personData, selectID);
                                    success = true;
                                } catch (IdNotFoundException e) {
                                    e.printStackTrace();
                                    System.out.println("List not found");
                                }
                            } while (!success);
                        }
                        case "2" -> {
                            //delete Person
                            boolean success = false;
                            do {
                                try {
                                    System.out.println("ID: ");
                                    dataManagement.deletePerson(userInteraction.getIdSelect());
                                    success = true;
                                } catch (IdNotFoundException e) {
                                    e.printStackTrace();
                                    System.out.println("Person not in List");
                                }
                            } while (!success);
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
                            System.out.println("ID: ");
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
                            System.out.println("Name: ");
                            dataManagement.createPersonManagement(userInteraction.getMenuSelect());
                        }
                        case "2" -> {
                            //delete PersonManagement
                            System.out.println("ID: ");
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
