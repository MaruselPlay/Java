import java.util.Scanner;

/** 
 * Ask the user for their name.
 * Outputs each character entered by the user, on separate lines.
 * Then outputs only letters from the name entered by the user, all on the same line.
*/

class NameChecker{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        for(int i = 0; i < name.length(); i++){
            System.out.println(name.charAt(i));
        }
        for(int i = 0; i < name.length(); i++){
            try{
                Integer.parseInt(name.charAt(i) + "");
            }catch(Exception e){
                System.out.print(name.charAt(i));
            }
        }
    }
}