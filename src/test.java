import java.util.Scanner;

public class test {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String a = "";

        System.out.println("test");
        boolean success = false;
        do {

            try {
                a = sc.nextLine();
                if (a.isEmpty()) ;
                if (a.matches("test")) throw new Exception();
                success = true;
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Illegal characters used");
            }
        } while (!success);

        System.out.println(a);
    }
}
