import java.util.Scanner;
import java.lang.NumberFormatException; //it's java.io.NumberFormatException for blueJ

class ElfNameArrayAdvanced{
  public static void main(String[] args){
    System.out.println("The program will ask you for the first letter of your name and for the month you were born.\nBased on the given data, the program will calculate your Elf name");

    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the first letter of your name: ");
    String letter = scanner.nextLine().toLowerCase(); //converting any input to lower case to avoid futher problems during comparison

    if(letter.length() != 1){ //checking for the length, for one letter should be 1
      System.out.print("Input can't be empty or more than one letter long");
      scanner.close();
      return; //stopping the program and outputting error message if wrong length
    }

    //the following block of code decides whether the string is numeric or not
    boolean isNumeric = true;
    try{  
      Double.parseDouble(letter);
    }catch(NumberFormatException e){
      isNumeric = false;
    }

    if(isNumeric){
      System.out.print("Input must be a letter");
      scanner.close();
      return; //stopping the program and outputting error message if input is numeric
    }

    System.out.print("Enter the month you were born: ");
    String month = scanner.nextLine().toLowerCase(); //converting any input to lower case to avoid futher problems during comparison

    String[] months = {"january", "february", "march", "april", "may", "june", "july", "august", "september", "october", "november", "december"}; //assigning an array with monthes

    //the following block of code decides whether the month entered is valid and records the position of this month
    int monthPosition = -1;
    for(int i = 0; i < months.length; i++){
      if(month.equals(months[i])){
        monthPosition = i;
        break;
      }
    }

    if(monthPosition == -1){ //month was not found in the list, therefore it's incorrect
      System.out.print("Input must be a valid month name");
      scanner.close();
      return; //stopping the program and outputting error message if month is incorrect
    }

    /*
     * HashMap would be better for this purpose
     */
    //the followwing block of code assigns arrays for names, letters and other names
    String[] letters = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    String[] firstNames = {"Sparkle", "Jingle", "Happy", "Snowy", "Tinsel", "Jolly", "Bumble", "Cosmo", "Twizzle", "JoJo", "Pinky", "Twirly", "Zippy", "Noel", "Swirly", "Dizzy", "Minty", "Cranberry", "Crinkle", "Poppy", "Tookie", "Merry", "Tinker", "Pepper", "Glitter", "Wiggles"};
    String[] otherNames = {"Sugarberry", "McGiggles", "Muffin Tin", "Pickle Pants", "Plumbottom", "Snickerdoodle", "Cinnabuns", "Snazzyhead", "Monkey Berry", "Twinkle Toes", "Ginger Pants", "BrightButtons"};

    //the following block of code searches through letters to find the position of letter entered by the user
    int letterPosition = 0;
    for(int i = 0; i < letters.length; i++){
      if(letter.equals(letters[i])){
        letterPosition = i;
        break;
      }
    }

    System.out.println("Your Elf name would be: " + firstNames[letterPosition] + " " + otherNames[monthPosition]); //outpitting the final name using positions that were worked out earlier

    scanner.close();
  }
}