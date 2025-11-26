public class Main {
    static void main() throws InterruptedException {
        FileReader fileInput = new FileReader();
        fileInput.importAddresses();
        fileInput.importPersonManagements();
        fileInput.importPersons();

        UserInterface userInterface = new UserInterface();
        userInterface.startUserInterface();

    }
}
