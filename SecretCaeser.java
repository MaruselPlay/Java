class SecretCaeser{

  private String plaintext = "Hello World";
  private String encrypted;


  /*
  * The following function creates the instance of this class and runs it
  */
  public static void main(String[] args){
    SecretCaeser instance = new SecretCaeser();
    instance.runAll();
  }

  /*
  * This method is called at the start and runs the program
  */
  public void runAll(){
    this.outPutASCII();
    this.encrypt();
    this.showEncrypted();
  }

  /*
  * This code converts global variable plaintext to acii and outputs it
  */
  private void outPutASCII(){
    System.out.print("\"" + this.plaintext + "\" in ASCII is: ");
    for(int i = 0; i < this.plaintext.length(); i++){ //a loop to convert each leytein the string
      System.out.print((int) this.plaintext.charAt(i));
    }
  }

  /*
  * Encrypt function, encrypts the variable plaintext and stores it in global variable
  */
  private void encrypt(){
    for (int i = 0; i < this.plaintext.length(); i++) {
      this.encrypted += (char) ((int) this.plaintext.charAt(i) + 10); //adding encrypted letter by letter
    }
  }

  /*
  * Outputs the contents of variable encrypted
  */
  private void showEncrypted(){
    System.out.print("\nEncrypted: " + this.encrypted);
  }
}
