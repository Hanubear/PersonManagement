public class Main {
    static void main() {
        FileInput fileInput = new FileInput();
        fileInput.importAddresses();
        fileInput.importPersonManagements();
        fileInput.importPersons();

        UserInterface userInterface = new UserInterface();
        userInterface.startUserInterface();

    }
}
