public class UserInterface {
    public void startUserInterface() throws InterruptedException {
        UserInteraction userInteraction = new UserInteraction();
        boolean run = true;
        String select;

        userInteraction.printAnnoyingLoadingBar();
        while (run) {
            userInteraction.printMainMenu();
            select = userInteraction.getMenuSelect();
            /*
            1 -> Person
            2 -> Address
            3 -> PMCategory
             */
            switch (select) {
                case "1" -> {
                    userInteraction.printPersonMenu();
                }
                case "2" -> {
                    userInteraction.printAddressMenu();
                }
                case "3" -> {
                    userInteraction.printPersonManagementMenu();
                }
                case "4" -> {
                    //asd
                }
                case ":q!" -> {
                    //close
                    run = false;
                }

            }

        }

    }
}
