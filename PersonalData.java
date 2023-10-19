import java.util.Scanner;

/*
* This code ask user for their name and age.
* IF "fred" is entered instead age, the NumberFormatException is thrown.
* Age is then converted to integer and both values are outputed.
*/

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
