import java.util.Scanner;
import java.io.FileWriter;

class FileWriterStandard{

  public String[] dataToWrite = {"Green", "Eggs", "and", "Ham", "EOF"}; //declaring global array with pre-declared values

  public static void main(String[] args){
    FileWriterStandard self = new FileWriterStandard(); //creating an instance of our class
    self.start(); //calling method start inside the object
  }

  public void start(){
    this.writeDataToFile(this.getFileNameFromUser()); //getting file name from user and writing data to it
  }

  /*
  * The following function gets the file name from user and returns it as a String object
  */
  public String getFileNameFromUser(){
    System.out.print("Enter the name of file: ");
    Scanner scanner = new Scanner(System.in);
    String line = scanner.nextLine();
    scanner.close();
    return line;
  }

  /*
  * Writing data from global array to the given file
  */
  public void writeDataToFile(String file){
    try{//try and catch block to catch any potential errors
      FileWriter fileWriter = new FileWriter(file); //initializing FileWriter instance
      for(int i = 0; i < dataToWrite.length; i++){
        fileWriter.write(dataToWrite[i] + "\n"); //writing all data from array on separates lines
      }
      fileWriter.close();
    }catch(Exception e){//error handling 
      System.out.println("An error happend while writing to file: ");
      e.printStackTrace();
    }
    System.out.println("Done!");
  }
}
