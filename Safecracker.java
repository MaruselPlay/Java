import java.util.Scanner;
import java.util.Random;

class Safecracker{

  private int[] code = new int[3];
  private boolean running = true;
  private Scanner scanner = new Scanner(System.in)

  public static void main(String[] args){
    Safecracker instance = new Safecracker();
    instance.start();
  }

  public void start(){
    while(this.running){
      this.showOptionMenu();
      this.handleOption(this.getOption());
    }
  }

  private void handleOption(int option){
    switch(option){
      case 1:
        this.trySaveCode(scanner.nextLine());
        break;
      case 2:
        this.generateCode();
        break;
      case 5:
        this.letUserGuessCode();
        break;
      case 6:
        this.running = false;
    }
  }

  private void letUserGuessCode(){
    System.out.print("Try to guess the code: ");
    boolean guessed = false;
    String[] splitCode = new String[3];
    String code;
    while(!guessed){
      code = scanner.nextLine();
      if(code.length() != 3){
        System.out.println("The code should be 3-digit");
        continue;
      }

      for(int i = 0; i < splitCode.length; i++){
        splitCode[i] = code[i];
      }

      if(this.isCodeEqual(splitCode)){
        System.out.print("Wrong code, try again: ");
      }
      guessed = true;
    }
  }

  private boolean isCodeEqual(String[] code){
    try{
      for(int i = 0; i < code.length; i++){
        if(Integer.parseInt(code[i]) != this.code[i]){
          return false;
        }
      }
    }catch(Exception e){
      return false;
    }
    return true;
  }

  private void generateCode(){
    Random random = new Random();
    for(int i = 0; i < 3; i++){
      this.code[i] = random.nextInt(9);
    }
  }

  private void trySaveCode(String code){
    if(code.length() != 3){
      System.out.println("The code should be 3-digit");
      return;
    }

    String[] splitCode = new String[3];
    for(int i = 0; i < splitCode.length; i++){
      try{
        this.code[i] = Integer.parseInt(splitCode[i]);
      }catch(Exception e){
        System.out.println("The code should be numeric");
        return;
      }
    }
  }

  private void showOptionMenu(){
    System.out.println("1 - Manually set a new 3-digit code\n2 - Randomly generate a 3-digit code\n3 - Set max number of guesses\n4 - Turn hints on/off\n5 - Guess the code\n6 - Exit");
  }

  private void setCode(int[] code){
    this.code = code;
  }

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