import java.util.Scanner;

public class CheckDigit{
    public static void main(String[] args){
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter first digit of code: ");
            int digit1 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter second digit of code: ");
            int digit2 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter third digit of code: ");
            int digit3 = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter fouth digit of code: ");
            int digit4 = Integer.parseInt(scanner.nextLine());

            int total = digit1 + digit2 + digit3 + digit4;
            if(total <= 9){
                System.out.println("Check digit: " + total);
            }else{
                System.out.println("Check digit: " + total % 10);
            }
        }catch(NumberFormatException exeption){
            System.out.println("Digit should be a number!");
        }
    }
}