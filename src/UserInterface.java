import javax.xml.crypto.Data;

public class UserInterface {
    public void startUserInterface() throws InterruptedException {
        UserInteraction userInteraction = new UserInteraction();
        DataManagement dataManagement = new DataManagement();
        boolean run = true;
        String select;

        userInteraction.printAnnoyingLoadingBar();
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

                        }
                        case "4" -> {
                            //Back

                        }
                        case ":q!" -> {
                            //close
                            run = false;
                        }

                    }

                }
                case "2" -> { // ~~~ADDRESS~~~
                    userInteraction.printAddressMenu();
                    select = userInteraction.getMenuSelect();
                    switch (select) {
                        case "1" -> {
                            //add new Person

                        }
                        case "2" -> {
                            //delete Person

                        }
                        case "3" -> {
                            //update PersonCSV

                        }
                        case "4" -> {
                            //Back

                        }
                        case ":q!" -> {
                            //close
                            run = false;
                        }

                    }
                }
                case "3" -> { // ~~~PMCategory~~~
                    userInteraction.printPersonManagementMenu();
                    select = userInteraction.getMenuSelect();
                    switch (select) {
                        case "1" -> {
                            //add new Person

                        }
                        case "2" -> {
                            //delete Person

                        }
                        case "3" -> {
                            //update PersonCSV

                        }
                        case "4" -> {
                            //Back

                        }
                        case ":q!" -> {
                            //close
                            run = false;
                        }

                    }
                }
                case "4" -> {
                    // ALL CSV UPDATE METHODS IN HERE

                }
                case ":q!" -> {
                    //update and close
                    run = false;
                }

            }

        }

    }
}
