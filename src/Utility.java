public class Utility {
    public static String[] removeQuotation(String[] input) {
        String[] strings = new String[input.length];
        for (int i = 0; i < input.length; i++) {
            if (input[i].startsWith("\"") && input[i].endsWith("\"") ) {
                strings[i] = input[i].substring(1, input[i].length() - 1);
            } else strings[i] = input[i];
        }
        return strings;
    }
}
