import java.util.Scanner;

public class Password{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String username = "marusel";
        String password = "qwerty";

        System.out.print("Enter username: ");
        String userEntry = scanner.nextLine();
        System.out.print("Enter password: ");
        String passEntry = scanner.nextLine();

        Boolean success = true;
        if(!userEntry.equals(username)){
            success = false;
            System.out.println("Wrong username");
        }
        if(!passEntry.equals(password)){
            success = false;
            System.out.println("Wrong password");
        }
        if(success){
            System.out.println("Login success!");
        }

        scanner.close();
    }
}
