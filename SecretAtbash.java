import java.util.Scanner;

class SecretAtbash{

  public Scanner scanner = new Scanner(System.in); //declaring global scanner to use at any point in the class


  /*
  * The following function creates the instance of this class and runs it
  */
  public static void main(String[] args){
    SecretAtbash instance = new SecretAtbash();
    instance.run();
  }

  public void run(){
    /*
    * The following block of code asks the user for their massage, until it's valid
    */
    String message;
    do{
      message = this.getUserInput("Enter your message: ");
      if(!this.isMessageValid(message)){ //checkng if the massage is valid
        message = ""; //so the loop repeats if the massage is not valid
        System.out.println("Message shouldn't contain any commas");
      }
    }while(message.equals(""));

    /*
    * The following block of code asks the user for the action they want to perform, until it's valid
    */
    String action = "";
    do{
      action = this.getUserInput("Encrypt - 1\nDecrypt - 2\nEnter the action you want to perform (1/2): ");
      if(!action.equals("1") && !action.equals("2")){ //checking if the action is in range of allowed boundaries
        action = ""; //so the loop repeats if the action is not valid
        System.out.println("Unknown option!");
      }
    }while(action.equals(""));

    /*
    * Deciding what to do with the input, based on th action entered
    */
    if(action.equals("1")){
      System.out.println(this.encryptMessage(message));
    }else if(action.equals("2")){
      System.out.println(this.decryptMessage(message));
    }
  }

  /*
  * The following function returns bool value the represent if the message is valid or not
  */
  public boolean isMessageValid(String message){
    return !message.contains(",");
  }

  /*
  * The following function gets the input from the user
  */
  public String getUserInput(String outputMessage){
    if(!outputMessage.equals("")){
      System.out.print(outputMessage);
    }
    return this.scanner.nextLine();
  }

  /*
  * The following function encrypts the message given using the Atbash technique
  */
  public String encryptMessage(String message){
    String encrypted = "";
    for(int i = 0; i < message.length(); i++){ //a loop to go through and encrypt each character in the message given
      char shiftedChar = (char) ((int) message.charAt(i) + 3);
      encrypted += shiftedChar;
    }
    return encrypted;
  }

   /*
  * The following function decrypts the message given using the reversed Atbash technique
  */
  public String decryptMessage(String encrypted){
    String decrypted = "";
    for(int i = 0; i < encrypted.length(); i++){ //a loop to go through and decrypt each character in the message given
      char shiftedChar = (char) ((int) encrypted.charAt(i) - 3); //shifts current character 3 places back
      decrypted += shiftedChar;
    }
    return decrypted;
  }
}