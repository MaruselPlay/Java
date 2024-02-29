import java.util.Scanner;
import java.util.Random;

class Safecracker{

  private int[] code = new int[3]; //global variable to hold code
  private boolean running = true; //status of the program
  private int maxAttempts = -1;
  private boolean showHints = false;
  private Scanner scanner = new Scanner(System.in);

  /**
   * Creating instance of this class and running it
   */
  public static void main(String[] args){
    Safecracker instance = new Safecracker();
    instance.start();
  }

  /**
   * Starts the program and keeps it running
   */
  public void start(){
    while(this.running){
      this.showOptionMenu();
      System.out.print("Enter an option: ");
      this.handleOption(this.getOption());
    }
  }

  /**
   * Executes an action that should happen when specific option entered
   * @param option
   */
  private void handleOption(int option){
    switch(option){
      case 1:
        this.letUserEnterCode();
        break;
      case 2:
        this.generateCode();
        break;
      case 3:
        this.letUserSetMaxAttempts();
        break;
      case 4:
        if(this.showHints){
          System.out.println("Hints were turned off!");
        }else{
          System.out.println("Hints were turned on!");
        }
        this.showHints = !this.showHints;
        break;
      case 5:
        this.letUserGuessCode();
        break;
      case 6:
        this.running = false;
    }
  }

  /**
   * Sets the maximum amount of attempts
   * @param maxAttempts
   */
  public void setMaxAttempts(int maxAttempts){
    this.maxAttempts = maxAttempts;
  }

  /**
   * Returns the maximum amount of attempts
   * @return int
   */
  public int getMaxAttempts(){
    return this.maxAttempts;
  }

  /**
   * Asks the user for the maximum number of attempts and makes sure valid value entered and stored
   */
  private void letUserSetMaxAttempts(){
    System.out.print("Input max amount of attempts or enter 0 for unlimited: ");
    boolean valid = false;
    int attempts;
    while(!valid){
      try{
        attempts = Integer.parseInt(this.scanner.nextLine());
      }catch(Exception e){
        System.out.println("Must be numeric, try again: ");
        continue;
      }

      if(attempts < 0){
        System.out.print("Can't be less than 0, try again: ");
        continue;
      }

      if(attempts == 0){
        this.maxAttempts = -1;
        System.out.println("Unlimited number of attempts was set");
      }else{
        this.maxAttempts = attempts;
        System.out.println("Maximum attempts of " + attempts + " was set");
      }
      valid = true;
    }
  }

  /**
   * Asks the user to guess the current code
   */
  private void letUserGuessCode(){
    System.out.print("Try to guess the code: ");
    boolean guessed = false;
    String code;
    int guesses = 0;
    while(!guessed){
      code = this.scanner.nextLine();
      if(code.length() != 3){
        System.out.print("The code should be 3-digit, try again: ");
        continue;
      }

      if(!this.isCodeEqual(code.split(""))){
        guesses++;
        if(guesses == this.maxAttempts){
          System.out.println("Wrong code, maximum amount of attempts exceeded");
          return;
        }else{
          System.out.print("Wrong code, try again: ");
        }
        continue;
      }
      guessed = true;
    }
    System.out.println("You guessed it!");
  }

  /**
   * Cheks if given code equal to the currently stored one
   * @param code
   * @return boolean
   */
  private boolean isCodeEqual(String[] code){
    boolean correct = true;
    try{
      for(int i = 0; i < code.length; i++){
        if(Integer.parseInt(code[i]) != this.code[i]){
          correct = false;
        }else{
          if(this.showHints){
            System.out.println("You gussed the right number at position " + (i + 1) + " it is number " + code[i]);
          }
        }
      }
    }catch(Exception e){
      return false;
    }
    return correct;
  }

  /**
   * Randomly generates 3-digit code
   */
  public void generateCode(){
    Random random = new Random();
    for(int i = 0; i < 3; i++){
      this.code[i] = random.nextInt(9);
    }
    System.out.println("Random code was set");
  }

  /**
   * Lets user enter the code to store. Ensures that data inputed is valid.
   */
  private void letUserEnterCode(){
    System.out.print("Enter the code you want to set: ");
    boolean valid = false;
    String code;
    String[] splitCode = new String[3];
    loop:
    while(!valid){
      code = this.scanner.nextLine();
      if(code.length() != 3){
        System.out.print("The code should be 3-digit, try again: ");
        continue;
      }
      
      splitCode = code.split("");
      for(int i = 0; i < splitCode.length; i++){
        try{
          this.code[i] = Integer.parseInt(splitCode[i]);
        }catch(Exception e){
          System.out.print("The code should be numeric, try again: ");
          continue loop;
        }
      }
      valid = true;
    }
  }

  /**
   * Displays option menu
   */
  public void showOptionMenu(){
    System.out.println("1 - Manually set a new 3-digit code\n2 - Randomly generate a 3-digit code\n3 - Set max number of guesses\n4 - Turn hints on/off\n5 - Guess the code\n6 - Exit");
  }

  /**
   * Sets given code as current code
   * @param code
   */
  public void setCode(int[] code){
    this.code = code;
  }

  /**
   * Returns if the given string can be converted to integer
   * @param String unparsedInt
   * @return boolean
   */
  public boolean isInt(String unparsedInt){
    try{
      Integer.parseInt(unparsedInt);
    }catch(Exception e){
      return false;
    }
    return true;
  }

  /**
   * Reads input from the user
   * @return int
   */
  private int getOption(){
    String option = this.scanner.nextLine();
    int numericOption = 0;
    
    try{
      numericOption = Integer.parseInt(option);
    }catch(Exception e){
      System.out.println("Selected option doesn't exists");
    }
    return numericOption;
  }
}