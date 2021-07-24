import java.util.Scanner;

public class TextInput {
    public static String returnTextInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hello world: ");
        return scanner.nextLine();
    }
}
