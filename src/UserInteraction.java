import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserInteraction implements DateMatcher {
    Scanner scanner = new Scanner(System.in);

    private static final String NAME_REGEX = "^\\p{L}+([\\p{L}\\p{M}'\\- ]*\\p{L})?$";
    private static final Pattern DATE_PATTERN = Pattern.compile(
            "^((2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26]))-02-29)$"
                    + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");

    public String[] scannerPersonData() {
        String[] personData = new String[5];
        String input;

        boolean success = false;
        do {
            try {
                System.out.println("enter Firstname: ");
                input = scanner.nextLine();
                if (!input.matches(NAME_REGEX)) throw new InvalidPersonNameException();
                personData[0] = input;
                success = true;
            } catch (InvalidPersonNameException e) {
                e.printStackTrace();
                System.out.println("Illegal characters used");
            }
        } while (!success);

        success = false;
        do {
            try {
                System.out.println("enter Lastname: ");
                input = scanner.nextLine();
                if (!input.matches(NAME_REGEX)) throw new InvalidPersonNameException();
                personData[1] = input;
                success = true;
            } catch (InvalidPersonNameException e) {
                e.printStackTrace();
                System.out.println("Illegal characters used");
            }
        } while (!success);

        success = false;
        do {
            try {
                System.out.println("enter Date of Birth: ");
                input = scanner.nextLine();
                if (!input.matches(String.valueOf(DATE_PATTERN))) throw new InvalidDateException();
                personData[2] = input;
                success = true;
            } catch (InvalidDateException e) {
                e.printStackTrace();
                System.out.println("Illegal Date used");
            }
        } while (!success);

        System.out.println("enter Address: ");
        input = scanner.nextLine();
        personData[3] = input;

        success = false;
        do {
            try {
                System.out.println("enter Gender: ");
                input = scanner.nextLine().toLowerCase(Locale.ROOT);
                if (!input.matches("male") || !input.matches("female") || !input.matches("\\bdiv\\b"))
                    throw new InvalidPersonNameException();
                personData[4] = input;
                success = true;
            } catch (InvalidPersonNameException e) {
                e.printStackTrace();
                System.out.println("Illegal input");
            }
        } while (!success);
        return personData;
    }

    public void printAnnoyingLoadingBar() throws InterruptedException {
        System.out.print("\nLoading: ");
        System.out.print("▓▓");
        Thread.sleep(450);
        System.out.print("▓▓▓▓▓▓");
        Thread.sleep(850);
        System.out.print("▓▓▓▓");
        Thread.sleep(300);
        System.out.print("▓▓▓");
        Thread.sleep(450);
        System.out.print("▓▓▓▓▓▓");
        Thread.sleep(850);
        System.out.print("▓▓▓▓");
        Thread.sleep(300);
        System.out.println("▓▓▓▓▓▓");
        System.out.println("Loading successful");
    }

    public void printMainMenu() {
        System.out.println("""
                Whats on your mind?
                1 -> add new Person
                2 -> print List
                3 -> sync File with new entries
                :q! -> Close Program
                """);
    }
    public String getMenuSelect (){
        return scanner.nextLine();
    }

    @Override
    public boolean matches(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }
}

interface DateMatcher {
    boolean matches(String date);
}