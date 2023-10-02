import java.util.Scanner;

public class Conversation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Your nickname is, " + name.substring(0, 2) + "gsy");
    }
}
