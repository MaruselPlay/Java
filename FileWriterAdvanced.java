import java.util.Scanner;
import java.io.FileWriter;

class FileWriterAdvanced{

  public String[] dataToWrite = new String[10]; //declaring fixed size global array

  public static void main(String[] args){
    FileWriterAdvanced object = new FileWriterAdvanced(); //creating a new instance of our class
    object.start(); //calling start function inside the instance
  }

  public void start(){
    try{//try and catch block to catch any potential errors
      Scanner scanner = new Scanner(System.in);
      this.inputLinesFromUser(scanner); //calling a function that fills the array
      this.writeLines(this.inputFileNameFromUser(scanner));
      scanner.close();
    }catch(Exception e){ //error handling
      System.out.println("An error happend while writing to file: ");
      e.printStackTrace();
    }
  }

  /*
  * The following function accepts the Scanner object as a parameter 
  * and reads line to the array from this Scanner
  */
  public void inputLinesFromUser(Scanner scanner){
    int count = 0;
    String line;
    do{//readlines until user types in "STOP" or until the array is full
      System.out.print("Enter line or type \"STOP\" to stop writing: ");
      line = scanner.nextLine();
      if(line.equals("STOP")){
        break;
      }
      this.dataToWrite[count] = line; //storing line in the global array
      count++;
    }while(this.canWriteToArray(count));
  }

  /*
  * The following function returns a bool value that represents if the global array is full or not
  */
  public boolean canWriteToArray(int index){
    return index < this.dataToWrite.length;
  }

  /*
  * The following function accepts Scanner object as a parameter, reads file name from this Scanner 
  * instance and returns file name as a String object
  */
  public String inputFileNameFromUser(Scanner scanner){
    System.out.print("Enter the name of file: ");
    return scanner.nextLine();
  }

  public void writeLines(String file){
    try{
      FileWriter fileWriter = new FileWriter(file);

      for(int i = 0; i < this.dataToWrite.length; i++){
        fileWriter.write(this.dataToWrite[i] + "\n");
      }
      fileWriter.close();
      System.out.println("Done!");
    }catch(Exception e){
      System.out.println("An error happend while writing to file: ");
      e.printStackTrace();
    }
  }
}
