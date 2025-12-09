public class Main {
    static void main() throws InterruptedException {

        FileReader fileInput = new FileReader();
        DataManagement dataManagement = new DataManagement();
        fileInput.importAddresses(dataManagement);
        fileInput.importPersonManagements(dataManagement);
        fileInput.importPersons(dataManagement);

        UserInterface userInterface = new UserInterface();
        userInterface.startUserInterface(dataManagement);

    }
}
