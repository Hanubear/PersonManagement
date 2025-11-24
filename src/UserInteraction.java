import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class UserInteraction implements DateMatcher {
    private static final String NAME_REGEX = "^\\p{L}+([\\p{L}\\p{M}'\\- ]*\\p{L})?$";
    private static final Pattern DATE_PATTERN = Pattern.compile(
            "^((2000|2400|2800|(19|2[0-9])(0[48]|[2468][048]|[13579][26]))-02-29)$"
                    + "|^(((19|2[0-9])[0-9]{2})-02-(0[1-9]|1[0-9]|2[0-8]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[13578]|10|12)-(0[1-9]|[12][0-9]|3[01]))$"
                    + "|^(((19|2[0-9])[0-9]{2})-(0[469]|11)-(0[1-9]|[12][0-9]|30))$");

    Scanner scanner = new Scanner(System.in);

    public ArrayList<String> scannerPersonData() {
        ArrayList<String> data = new ArrayList<>();
        String input;

        try {
            System.out.println("enter Firstname: ");
            input = scanner.nextLine();
            if (!input.matches(NAME_REGEX)) throw new InvalidPersonNameException();
            data.add(input);
        } catch (InvalidPersonNameException e) {
            e.printStackTrace();
            System.out.println("Illegal characters used");
        }

        try {
            System.out.println("enter Lastname: ");
            input = scanner.nextLine();
            if (!input.matches(NAME_REGEX)) throw new InvalidPersonNameException();
            data.add(input);
        } catch (InvalidPersonNameException e) {
            e.printStackTrace();
            System.out.println("Illegal characters used");
        }

        try {
            System.out.println("enter Date of Birth: ");
            input = scanner.nextLine();
            if (!input.matches(String.valueOf(DATE_PATTERN))) throw new InvalidDateException();
            data.add(input);
        } catch (InvalidDateException e) {
            e.printStackTrace();
            System.out.println("Illegal Date used");
        }

        try {
            System.out.println("enter Gender: ");
            input = scanner.nextLine().toLowerCase(Locale.ROOT);
            if (!input.matches("male")||!input.matches("female")||!input.matches("\\bdiv\\b")) throw new InvalidPersonNameException();
            data.add(input);
        } catch (InvalidPersonNameException e) {
            e.printStackTrace();
            System.out.println("Illegal Date used");
        }

        System.out.println("enter Address: ");


        return data;
    }

    @Override
    public boolean matches(String date) {
        return DATE_PATTERN.matcher(date).matches();
    }
}

interface DateMatcher {
    boolean matches(String date);
}