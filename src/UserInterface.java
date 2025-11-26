public class UserInterface {
    public void startUserInterface () throws InterruptedException {
        UserInteraction userInteraction = new UserInteraction();
        boolean run = true;
        String select;

        userInteraction.printAnnoyingLoadingBar();
        while (run){
            userInteraction.printMainMenu();
            select = userInteraction.getMenuSelect();
            switch (select){
                case "1" -> {
                    //add Person

                }
                case "2" -> {
                    //Print List
                }
                case "3" -> {

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
