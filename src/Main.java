public class Main {
    static void main() throws InterruptedException {

        FileReader fileInput = new FileReader();
        DataManagement dataManagement = new DataManagement();
        fileInput.importAddresses();
        fileInput.importPersonManagements();
        fileInput.importPersons();

        UserInterface userInterface = new UserInterface();
        userInterface.startUserInterface();

    }
}
