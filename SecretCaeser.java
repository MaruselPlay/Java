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

  public void runAll(){
    this.outPutASCII();
    this.encrypt();
    this.showEncrypted();
  }

  private void outPutASCII(){
    System.out.print("\"" + this.plaintext + "\" in ASCII is: ");
    for(int i = 0; i < this.plaintext.length(); i++){
      System.out.print((int) this.plaintext.charAt(i));
    }
  }

  private void encrypt(){
    for (int i = 0; i < this.plaintext.length(); i++) {
      this.encrypted += (char) ((int) this.plaintext.charAt(i) + 10);
    }
  }

  private void showEncrypted(){
    System.out.print("\nEncrypted: " + this.encrypted);
  }
}