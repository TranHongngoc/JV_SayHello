import java.util.Scanner;

public class Sayhello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your Name: ");
        String name = scanner.nextLine();

        System.out.println("Hello " + name);

    }
}
