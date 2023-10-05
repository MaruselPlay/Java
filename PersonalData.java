import java.util.Scanner;

public class PersonalData {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        String tempAge = scanner.nextLine();
        scanner.close();
        if(tempAge.equalsIgnoreCase(("fred"))){
            throw new NumberFormatException();
        }
        System.out.println(name);
        try{
            int age = Integer.parseInt(tempAge);
            
            System.out.println(age);
        }catch(NumberFormatException exeption){
            System.out.println("Wrong format");
        }
    }
}
