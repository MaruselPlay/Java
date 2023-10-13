import java.util.Scanner;

/*This code letting the user to enter their name
*Then this code outputs "hello, " and the name you've entered
*Then this code creates a nickname for the user, based on thier name
*/

public class Conversation {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String name;
        System.out.print("Enter your name: ");
        name = scanner.nextLine();
        System.out.println("Hello, " + name);
        System.out.println("Your nickname is, " + name.substring(0, 2) + "gsy");
        scanner.close();
    }
}
