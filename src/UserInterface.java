public class UserInterface {
    public void startUserInterface () throws InterruptedException {
        UserInteraction userInteraction = new UserInteraction();
        boolean run = true;
        String select;

        userInteraction.printAnnoyingLoadingBar();
        while (run){
            userInteraction.printMainMenu();
            select = userInteraction.getMenuSelect();
//            switch ()



            run = false;
        }

    }
}
