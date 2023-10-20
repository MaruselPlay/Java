import java.util.Scanner;
import java.util.Random;

public class EnrolmentAdvanced{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your email: ");
        String email = scanner.nextLine();
        while(!email.contains("@")){
            System.out.print("Not valid email. Enter your email: ");
            email = scanner.nextLine();
        }

        System.out.print("Enter your year group: ");
        String yearGroup = scanner.nextLine();
        while(!yearGroup.equals("U6") && !yearGroup.equals("L6")){
            System.out.print("Wrong year group. Enter your year group: ");
            yearGroup = scanner.nextLine();
        }

        String randomID = "E" + new Random().nextInt(100000);

        System.out.print("Are you happy whith the data entered (yes/no): ");
        String happy = scanner.nextLine();
        while(!happy.equalsIgnoreCase("yes") && !happy.equalsIgnoreCase("no")){
            System.out.print("Are you happy whith the data entered (yes/no): ");
            happy = scanner.nextLine();
        }

        if(happy.equalsIgnoreCase("yes")){
            System.out.println("Email: " + email);
            System.out.println("Year group: " + yearGroup);
            System.out.println("StudentID: " + randomID);
        }

        scanner.close();
    }
}