import java.util.Scanner;

/*
* This code lets the user to enter all colours of rainbow.
* The code replaces each letters "e" by letter "a".
* The code then makes every letter uppercase in each second colour.
* Finally all colours are outputed
*/

public class MixedRainbow {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] colours = new String[7];
        System.out.println("Enter all rainbow colours (press enter after each entered): ");
        for(int i = 0; i < 7; i++){
            colours[i] = scanner.nextLine();
            colours[i] = colours[i].replaceAll("e","a");
            if(i % 2 != 0){
                colours[i] = colours[i].toUpperCase();
            }else{
                colours[i] = colours[i].toLowerCase();
            }
        }

        System.out.println("Here is the result:");
        for(int i = 0; i < 7; i++){
            System.out.println(colours[i]);
        }
        scanner.close();
    }
}
